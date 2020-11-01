package com.leetcode.septemberChallenges;

public class InorderSuccessorinBst2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Node inorderSuccessor(Node x) {
		Node res=null;
		Node p=x.right;
		
		while(p!=null) {
			res=p;
			p=p.left;
		}
		if(res!=null) {
			return res;
		}
		p=x;
		while(p!=null) {
			if(p.parent!=null && p.parent.left==x)
				return p.parent;
			p=p.parent;
		}
		
	return null;
		
	}

}
