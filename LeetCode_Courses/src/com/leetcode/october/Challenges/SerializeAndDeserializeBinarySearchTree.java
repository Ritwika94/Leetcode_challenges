package com.leetcode.october.Challenges;

import java.util.ArrayList;

public class SerializeAndDeserializeBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	   ArrayList<String> alist=new ArrayList();
	   int i=0;

	    // Encodes a tree to a single string.
	    public String serialize(TreeNode root) {
	        formString(root);
	        
	        return  String.join(",",alist);
	        
	        
	    }
	     public void formString(TreeNode root) {
	        if(root==null){
	            alist.add("#");
	            
	        }
	        else{
	        alist.add(""+root.val);
	        formString(root.left);
	        formString(root.right);
	        } 
	        
	        
	    }

	    // Decodes your encoded data to tree.
	    public TreeNode deserialize(String data) {
	       if(data == null)
	        return null;
	 
	   // int[] t = {0};
	    String[] arr = data.split(",");
	 
	    return helper(arr);
	}
	 
	public TreeNode helper(String[] arr){
	    if(arr[i].equals("#")){
	        return null;
	    }
	    
	    TreeNode root = new TreeNode(Integer.parseInt(arr[i]));
	 
	    i++;
	    root.left = helper(arr);
	   i++;
	    root.right = helper(arr);
	 
	    return root;
	     
	         
	    }

}
