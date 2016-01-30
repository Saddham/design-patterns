package com.designpatterns.creational.objectpool;

public class JDBCConnectionPool extends ObjectPool<Connection> {

	private String driver, url, user, pwd;

	public JDBCConnectionPool(String driver, String url, String user, String pwd) {
		super();
		try {
			Class.forName(driver).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		this.url = url;
		this.user = user;
		this.pwd = pwd;
	}

	@Override
	protected Connection create() {
		return DriverManager.getConnection(url, user, pwd);
	}

	@Override
	protected void expire(Connection connection) {		
		connection.close();
	}

	@Override
	protected boolean validate(Connection connection) {		
		return !connection.isClosed();
	}

}
