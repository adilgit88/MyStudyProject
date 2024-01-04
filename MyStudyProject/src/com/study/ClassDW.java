package com.study;

public class ClassDW
{

    void meth1(String word) 
    {
        String rev = "";

        for (int i = word.length() - 1; i >= 0; i--) 
        {
            rev += word.charAt(i);
        }

       System.out.println("word :"+word);
       System.out.println("rev :"+rev);
       
       if (word.equalsIgnoreCase(rev))
    	   System.out.println(word + " is a palindrome: ");
       else
           System.out.println(word + " is not a palindrome:");
    }

    public static void main(String[] args) {
        ClassDW aobj = new ClassDW();
        aobj.meth1("kayak");
    }
}
