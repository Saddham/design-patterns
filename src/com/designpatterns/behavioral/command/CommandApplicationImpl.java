package com.design.patterns.behavioral.command;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by saddhamp on 14/3/16.
 */

public class CommandApplicationImpl implements CommandApplication {
    private static final String workchainXML;
    private static final String workerPackage = "com.design.patterns.behavioral.command.worker.";
    private String regex = "<\\s*(flow)\\s+name\\s*=\\s*\"PLACE_HOLDER\"\\s*>(.*)</\\s*(\\1)\\s*>";
    static {
        InputStream in = CommandApplicationImpl.class.getClassLoader().getResourceAsStream("workchain.xml");
        BufferedReader buffer = new BufferedReader(
                new InputStreamReader(in));
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        try {
            while ((line = buffer.readLine()) != null){
                stringBuilder.append(line);
                System.out.println(buffer.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        workchainXML = stringBuilder.toString();
    }
        @Override
    public Response application(Request request) {
            regex = regex.replace("PLACE_HOLDER", request.getFlow());
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(workchainXML);
            List<String> workers = new ArrayList<String>();
            pattern = Pattern.compile("<\\s*(worker)\\s*>([^><]+)</\\s*(\\1)\\s*>");
            Matcher matcher1;
            if (matcher.find()){
                matcher1 = pattern.matcher(matcher.group(2));
                while(matcher1.find()) {
                    workers.add(matcher1.group(2));
                }
            }

            Class clazz;
            Method method;
            Response response = new Response();
            Command command;
            for(String worker : workers){
                try {
                    clazz = Class.forName(workerPackage+worker);
                    command = (Command) clazz.newInstance();
                    method = clazz.getMethod("execute", new Class[]{Request.class, Response.class});
                    if(!response.hasErrors()){
                        method.invoke(command);
                    }
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
            return response;
    }
}
