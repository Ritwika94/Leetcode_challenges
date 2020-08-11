package com.leetcode.august.Challenges;

public class AddAndSearchWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public TrieNode root=null;
     class TrieNode
	{
	  TrieNode child[]=new TrieNode[26];
	  boolean leaf;
         
	  public TrieNode(){
		  leaf=false;
		  for(int i=0;i<26;i++)
			  child[i]=null;
	  }
	  
	}
	

    /** Initialize your data structure here. */
    public AddAndSearchWord() {
      
       root=new TrieNode();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        int len=word.length();
       
        TrieNode pNode=root;
        for(int i=0;i<len;i++)
        {
          
            int index =word.charAt(i)-'a';
            if(pNode.child[index]==null)
                pNode.child[index]=new TrieNode();
            pNode=pNode.child[index];
            
        }
        pNode.leaf=true;
        System.out.println("Word added");
        
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
     if(match(word.toCharArray(),0,root))
     {
           System.out.println("word found: "+word);
         return true;
     }
        else{
             System.out.println("word not found: "+word);
             return false;
        }
     
        
}
    boolean match(char[] ch, int k, TrieNode node)
    {
        if(k==ch.length)
        {
           return (node.leaf==true);
        }
            
        if(ch[k]!='.')
        {

            return ((node.child[ch[k]-'a']!=null) && match(ch,k+1, node.child[ch[k]-'a']));
        }
         else
        {
              for(int i=0;i<26;i++)
              {
                   if(node.child[i]!=null)
                  {
                        
                          if (match(ch,k+1,node.child[i]))
                              return true;
                   }
                }
                 
              
        }                                                                       
       return false; 
    }

}
