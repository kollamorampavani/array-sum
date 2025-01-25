package arrays;
import java.util.*;
import java.util.Scanner;

public class sum_array {
	public static int sumarray(int[] a) {
		int sum=0;//for to find product int prod=1,prod=prod*a[i]
		 for(int i=0;i<a.length;i++) {
	    	  sum=sum+a[i];
	    	 
	      }
		  return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
	      System.out.print("enter n");
	      int n=scan.nextInt();
	      int []a=new int[n];
	      for(int i=0;i<a.length;i++) {
	    	  a[i]=scan.nextInt();
	    	 }
	         int res=sumarray(a);
	         System.out.print(res);
	    	}

}
