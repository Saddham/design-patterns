package com.designpatterns.behavioral.templatemethod;

import java.util.ArrayList;
import java.util.List;

public abstract class ListOrganizer<T extends Comparable>{
	public void convertToListAndPrintInOrder(T [] arr){
		List<T> list = convertToList(arr);
		sort(list);
		print(list);
	}

	private List<T> convertToList(T[] arr) {
		List<T> list = new ArrayList<T>();
		for(T ele : arr){
			list.add(ele);
		}
		
		return list;
	}
	
	protected abstract void sort(List<T> list);
	
	private void print(List<T> list){
		for (T ele : list) {
			System.out.print(ele.toString()+" ");
		}
		System.out.println();
	}
}
