package com.leetcode.septemberChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class AllElementsInTwoBst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ArrayList<Integer> alist=new ArrayList();
	public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        traverseTree(root1);
        traverseTree(root2);
        Collections.sort(alist);
       
        return alist;
      
    }
     public void traverseTree(TreeNode root){
         if(root!=null){
             traverseTree(root.left);
             alist.add(root.val);
              traverseTree(root.right);
         }
         
     }
}
