package com.leetcode.septemberChallenges;

public class VersionComparison {

	public static void main(String[] args) {
		String version1 = "0.1";
		String version2 = "1.1";
		System.out.println(compareVersion(version1,version2));

	}
	
	  public static int compareVersion(String version1, String version2) {
	        String arr1[]=version1.split("\\.");
	        String arr2[]=version2.split("\\.");
	        int n1=arr1.length;
	        int n2=arr2.length;
	        int i=0;
	        int j=0;
	        for(i=0,j=0;i<n1 && j<n2;i++,j++){
	            String str1=arr1[i].replaceFirst("^0+(?!$)", "");
	            String str2=arr2[j].replaceFirst("^0+(?!$)", "");
	            Integer val1=Integer.parseInt(str1);
	            Integer val2=Integer.parseInt(str2);
	            if(val1>val2)
	                return 1;
	            if(val1<val2)
	                return -1;
	            
	        }
	       
	            
	        if(i==n1 && j!=n2){
	           
	            while(j<n2){
	                  String str2=arr2[j].replaceFirst("^0+(?!$)", "");
	                if(str2.equals("0")){
	                    j++;
	                    continue;
	                }
	                else 
	                 return -1;
	            }
	            if(j==n2)
	                return 0;
	        }
	         if(i!=n1 && j==n2){
	            while(i<n1){
	               String s=arr1[i].replaceFirst("^0+(?!$)", "");
	                if(s.equals("0")){
	                   i++;
	                    continue;
	                }
	                else 
	                 return 1;
	            }
	            if(i==n1)
	                return 0;
	        }
	        return 0;
	    }

}
