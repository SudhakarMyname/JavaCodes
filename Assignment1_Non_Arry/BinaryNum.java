package Assignment1_Non_Arry;
import java.util.*;

// Convert number into binary

public class BinaryNum {

	
	public static void main(String[] args) {
		
   Scanner x=new Scanner(System.in);
    System.out.println("Enter Number");
   int a=x.nextInt(); 
   
   int num = a;
   
   int size=0;
   int index=0;
   
   while( a != 0 ) {   
	  int  rem=a%2;
	   size++;
	   a=a/2;
   }
   int [] arr= new int[size];
   while( num != 0 ) {   
	  int  rem=num%2;
	    arr[index]=rem;
	     index++;
	   num = num/2; 
  }
   for(int e: arr) {
	   } 
   for(int i= arr.length-1; i>=0; i-- ) {
	   System.out.print(arr[i]);
   }
   
	}	

	}


