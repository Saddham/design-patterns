package com.designpatterns.behavioral.templatemethod;

import java.util.Collections;
import java.util.List;

public class MergeSortListOrganizer<T extends Comparable> extends ListOrganizer<T> {

	@Override
	protected void sort(List<T> list) {
		Collections.sort(list);
	}

}
