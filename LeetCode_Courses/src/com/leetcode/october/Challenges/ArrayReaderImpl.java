package com.leetcode.october.Challenges;

public class ArrayReaderImpl implements ArrayReader {
	private int arr[];
	public ArrayReaderImpl(int arr[])  {
		this.arr=arr;
	}

	@Override
	public int get(int index) {
		
		return index<=arr.length-1?arr[index]:Integer.MAX_VALUE;
	}

}
