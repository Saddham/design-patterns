package com.designpatterns.behavioral.templatemethod;

public class TemplateMethodApp {
	public static void main(String[] args) {
		String [] strArray = "Z Y X C B A".split(" ");
		ListOrganizer<String> mergeSortListOrganizer = new MergeSortListOrganizer<String>();
		mergeSortListOrganizer.convertToListAndPrintInOrder(strArray);
	}
}
