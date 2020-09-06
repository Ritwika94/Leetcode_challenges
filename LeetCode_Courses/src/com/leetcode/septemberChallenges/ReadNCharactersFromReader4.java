package com.leetcode.septemberChallenges;

public class ReadNCharactersFromReader4 extends Reader4 {

	public static void main(String[] args) {
		
	}
	char temp[]=new char[4];
	int tmpPtr=0;
	int tmpCnt=0;
	public int read(char buf[],int n) {
		int total=0;
		
		while(total<n) {
			if(tmpPtr==0) {
			tmpCnt=read4(temp);
			}
			
	
		while(total<n && tmpPtr<tmpCnt) {
			buf[total++]=temp[tmpPtr++];
		}
		
		if(tmpPtr==tmpCnt)
			tmpPtr=0;
		
		if(tmpCnt<4)
			break;
		
		}
		return total;
		
	}
	

}
