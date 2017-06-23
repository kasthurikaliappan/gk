package gk;
import java.util.*;
public class primenot {
	public static void main(String args[]){
		int i,n,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the prime");
		n=s.nextInt();
		for(i=2; i<n/2; i++){
			if(n%i==0){
				flag=1;
				break;
				}
		}
		if(flag==0){
			System.out.println("Enter the  number is prime");
		}
		else{
			System.out.println("Enter the number is not prime  ");
		}
	}

}
