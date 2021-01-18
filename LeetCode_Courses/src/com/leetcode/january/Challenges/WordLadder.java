package com.leetcode.january.Challenges;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        String target=endWord;
       String start=beginWord;
    
        HashSet<String> set = new HashSet<>(wordList);
		if(!set.contains(target))
			return 0;
		int level=0;
		int len=start.length();
		Queue<String> q=new LinkedList();
		q.add(start);
		while(!q.isEmpty()) {
			++level;
			int size=q.size();
			for(int i=0;i<size;i++) {
				char word[]=q.poll().toCharArray();
			
				for(int pos=0;pos<len;pos++) {
					char temp=word[pos];
					for(char c='a';c<='z';c++) {
						word[pos]=c;
						if(String.valueOf(word).equals(target)){
                           
                           return level+1;
                       }
							
						if(!set.contains(String.valueOf(word)))
							continue;
						set.remove(String.valueOf(word));
						q.add(String.valueOf(word));
					}
					word[pos]=temp;
					
				}
			}
         
	}
return 0;
	
   }

}
