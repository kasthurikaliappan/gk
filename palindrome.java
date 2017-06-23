package gk;

import java.util.Scanner;

public class palindrome {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String rev="";
		String num;
		num=s.nextLine();
		int a=num.length();
		{
		        for ( int i=a-1; i>=0 ;--i)
				rev= rev +num.charAt(i);
			}
			if(num.equalsIgnoreCase(rev))
					{
				System.out.println("palindrome");
			}
			else
			{
			 System.out.println("not palindrome");	
			}
		}
	}



