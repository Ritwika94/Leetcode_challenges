package com.leetcode.january.Challenges;

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
	        if(original==null)
	            return null;
	        if(original.val==target.val){
	             if(checkTree(original,cloned))
	                 return cloned;
	            
	        }
	        TreeNode ls=getTargetCopy(original.left,cloned.left,target);
	        TreeNode rs=getTargetCopy(original.right,cloned.right,target);
	        
	        if( ls==null && rs==null)
	            return null;
	        else
	            return (ls==null)?rs:ls;
	    }
	    
	     public final boolean checkTree( TreeNode original,  TreeNode cloned){
	         if(original==null && cloned==null)
	             return true;
	         if(original==null || cloned==null)
	             return false;
	         if(original !=null && cloned!=null){
	             return (original.val==cloned.val && checkTree(original.left,cloned.left) 
	                     && checkTree(original.right,cloned.right ));
	         }
	         
	         return false;
	    }

}
