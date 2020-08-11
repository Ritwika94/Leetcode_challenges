package com.leetcode.august.Challenges;

public class ClosestBSTValue {
    public int mindiff;
    public int mindiff_key;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
  public int findclosest(TreeNode root, int k) {
	    mindiff=Integer.MAX_VALUE;
	    mindiff_key=-1;
	    findclosestValuetoTarget(root,k);
		return mindiff_key;
    }
private void findclosestValuetoTarget(TreeNode root, int k) {
	if(root==null)
		return;
	if(root.val==k)
	{
		mindiff_key=root.val;
		return;
	}
	if(mindiff>Math.abs(root.val-k))
	{
		mindiff=Math.abs(root.val-k);
		mindiff_key=root.val;
	}
	if(k<root.val)
	{
		findclosestValuetoTarget(root.left,k);
	}
	else 
		findclosestValuetoTarget(root.right,k);
	
}

}
