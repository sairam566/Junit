package com.tsr.service;

public class NumberHelper {
	public int min2(int[] inArray) {
		int[] sortedArray = null;

		sortedArray = ArrayHelper.getSortedArray(inArray);
		if (sortedArray.length > 1) {
			return sortedArray[1];
		}
		return sortedArray[0];
	}
}
