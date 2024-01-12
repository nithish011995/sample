package programs;

import java.util.Scanner;

public class reverse {
	
	public static void main(String[] args) {
		
	/*	String s="abcd";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String S=sc.next();
		String	Rev="";
		
		for(int i=S.length()-1;i>=0;i--)
		{
			Rev=Rev+S.charAt(i);
		}
		
		System.out.println(Rev);*/
		
		StringBuilder s2=new StringBuilder() ;
		String s="abc";
		s2.append(s);
		s2=s2.reverse();
		System.out.println(s2);
		
	}

}
