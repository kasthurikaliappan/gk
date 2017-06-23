package gk;
import java.util.*;
public class armstrong {
  public static void main(String args[]){
	  int n,temp=0,s1,arm,a,no;
	  Scanner s=new Scanner(System.in);
	  n=s.nextInt();
	  a=n;
	  while(n>0){
		  no=n%10;
		  n=n/10;
		  temp=temp+no*no*no;
		  }
	  if(a==temp){
		  System.out.println("Is an armstrong number");
		  
	  }
	  else{
		  System.out.println("Is an not armstrong number");
	  }
	  
  }
}
