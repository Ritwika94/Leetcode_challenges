package com.leetcode.november.Challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args) {
	
	}

	public static int[][] merge(int[][] intervals) {
		List<int[]> alist = new ArrayList();
		for (int[] interval : intervals) {
			int start = interval[0];
			int end = interval[1];
			alist.add(new int[] { start, end });
		}
		Collections.sort(alist, new Comparator<int[]>() {
			@Override
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});
		int start = alist.get(0)[0];
		int end = alist.get(0)[1];

		List<int[]> alist2 = new ArrayList();
		for (int[] interval : alist) {
			int start1 = interval[0];
			int end1 = interval[1];
			if (start1 <= end) {
				end = Math.max(end, end1);

			}
			if (start1 > end) {
				alist2.add(new int[] { start, end });
				start = start1;
				end = end1;
			}

		}
		alist2.add(new int[] { start, end });
		int[][] arr2 = new int[alist2.size()][2];
		int i = 0;
		for (int[] interval : alist2) {
			arr2[i][0] = interval[0];
			arr2[i][1] = interval[1];
			i++;
		}
		return arr2;
	}

}
