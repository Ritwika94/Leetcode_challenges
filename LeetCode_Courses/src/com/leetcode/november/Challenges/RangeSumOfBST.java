package com.leetcode.november.Challenges;

public class RangeSumOfBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        findrangeSumBST(root,low,high);
        return sum;
    }
     public void findrangeSumBST(TreeNode root, int low, int high) {
        if(root==null)
            return;
        if(root.val>=low && root.val<=high)
            sum+=root.val;
        if(root.val<=low)
            findrangeSumBST(root.right,low,high);
        else if(root.val>low && root.val<high){
             findrangeSumBST(root.left,low,high);
              findrangeSumBST(root.right,low,high);
        }
           
        else if(root.val>=high)
            findrangeSumBST(root.left,low,high);
         
     }
}
