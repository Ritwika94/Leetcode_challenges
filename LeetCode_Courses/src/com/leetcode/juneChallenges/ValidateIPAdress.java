package com.leetcode.juneChallenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAdress {

	public static void main(String[] args) {
		String str="2001:0db8:85a3:0:0:8A2E:0370:7334";
		
		System.out.println(validIPAddress(str));

	}
	
	 public static String validIPAddress(String IP) {
		 if(IP.isEmpty() || IP==null)
			 return "Neither";
		 String[] arr=IP.split("\\.");
		 if(IP.endsWith("."))
			 return "Neither";
		 if(arr.length==4)
		 {
			 String zeroTo255 
	            = "(\\d{1,2}|(0|1)\\"
	              + "d{2}|2[0-4]\\d|25[0-5])"; 
			 String regex 
	            = zeroTo255 + "\\."
	              + zeroTo255 + "\\."
	              + zeroTo255 + "\\."
	              + zeroTo255; 
			 Pattern p = Pattern.compile(regex); 
			 Matcher m = p.matcher(IP); 
			 if(!m.matches())
				 return "Neither";
			for(int i=0;i<arr.length;i++)
			{
				char nums[]=arr[i].toCharArray();
				System.out.println(arr[i].startsWith("0"));
				if(arr[i].length()>1 && arr[i].startsWith("0"))
					return "Neither";
				for(int j=0;j<nums.length;j++)
				{
					if(!Character.isDigit(arr[i].charAt(j)))
					  return "Neither";
				}
				int val=Integer.parseInt(arr[i]);
				
				if(!(val>=0 &&val<=255))
					return "Neither";
				
				
			}
			return "IPV4";
		 }
		 else 
		 {
			 String regex 
	            = "^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$";
			 Pattern p = Pattern.compile(regex); 
			 Matcher m = p.matcher(IP); 
			 if(!m.matches())
			 {
				 System.out.println("Hi");
				 return "Neither";
			 }
				
			 if(IP.contains("::"))
				 return "Neither";
			 if(IP.endsWith(":"))
				 return "Neither";
			 String[] arr1=IP.split("\\:");
			 System.out.println(arr1.length);
			 if(arr1.length!=8)
				 return "Neither";
			 
			 for(int i=0;i<arr1.length;i++)
			 {
				 if(arr1[i].length()>4)
					 return "Neither";
				 if(arr1[i].length()>4 && arr1[i].startsWith("0"))
					 return "Neither";
			 }
			 return "IPV6";
		 }
	        
	    }

}
