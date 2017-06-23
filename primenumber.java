package gk;
import java.util.*;
public class primenumber {
  public static void main(String args[]){
	  int i,a,n;
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the prime");
	  n=s.nextInt();
	  for(i=2; i<=n; i++){
		  {
			  a=0;
			  for(int j=2; j<i;j++){
				  if(i%j==0){
					  a++;
					  }
			  }
			  if(a==0){
				  System.out.println(""+i);
			  }
		  }
	  }
	  
  }
}
