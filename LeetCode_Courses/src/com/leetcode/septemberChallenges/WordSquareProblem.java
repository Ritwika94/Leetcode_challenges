package com.leetcode.septemberChallenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class WordSquareProblem {
	static HashMap<String,List<String>> hmap=new HashMap();
	public static void main(String[] args) {
		String words[]= {"area","lead","wall","lady","ball"};
		List<List<String>> wordArray=wordSquare(words);
		for(int i=0;i<wordArray.size();i++) {
			List<String> list=wordArray.get(i);
			for(String s:list) {
				System.out.print(s+" ");
			}
			System.out.println();
			
		}
	}

	private static List<List<String>> wordSquare(String[] words) {
		List<List<String>> res=new ArrayList();
		createPrefix(words);
		
		for(String word:words) {
			LinkedList<String> list=new LinkedList();
			list.add(word);
			backTrack(1,list,res,word.length());
		}
		return res;
		
	}

	private static void backTrack(int step, LinkedList<String> list, List<List<String>> res, int n) {
		if(list.size()==n) {
			res.add(new ArrayList<>(list));
			return;
		}
		StringBuilder sb=new StringBuilder();
		for(String str:list) {
			sb.append(str.charAt(step));
			
		}
		String st=sb.toString();
		List<String> wordList=hmap.getOrDefault(st, new ArrayList<>());
		for(String wordVal:wordList) {
			list.add(wordVal);
			backTrack(step+1,list,res,n);
			list.removeLast();
		}
	}

	private static void createPrefix(String[] words) {
		for(String word:words) {
			for(int i=0;i<word.length();i++) {
				String prefix=word.substring(0,i);
				hmap.putIfAbsent(prefix, new ArrayList<>());
				List<String> list=hmap.get(prefix);
				list.add(word);
				
			}
		}
		
	}

}
