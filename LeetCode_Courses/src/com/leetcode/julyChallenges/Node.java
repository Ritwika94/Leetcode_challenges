package com.leetcode.julyChallenges;

public class Node {
	public int val;
    public Node prev;
    public Node next;
    public Node child;
	public Node(int val, Node prev, Node next, Node child) {
		super();
		this.val = val;
		this.prev = prev;
		this.next = next;
		this.child = child;
	}
}
