package arrays;
import java.util.*;
import java.io.*;
public class frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 Scanner x=new Scanner(System.in);
			 int []a=new int [10];
			 System.out.println("enter nos");
			 for (int i=0;i<10;i++) 
				 a[i]=x.nextInt();
			
			 System.out.println("enter n");
			 int n=x.nextInt();
			 int freq=0;
			 for (int i=0;i<10;i++) {
				 
				 if (a[i]==n) {
					 freq=freq+1;
				 }
			 }System.out.println(freq);
	}

}
