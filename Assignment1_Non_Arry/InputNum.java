package Assignment1_Non_Arry;
import java.util.*;

//Input number from user and show Big & small no.

public class InputNum {

	public static void main(String[] args) {
	
		Scanner x= new Scanner(System.in);
	System.out.println("Enter 1st num");
	int a= x.nextInt();
	System.out.println("Enter 2nd num");
	int b= x.nextInt();
	System.out.println("Enter 3rd num");
	int c= x.nextInt();
	
	int Max= a > b ? a : b ;
	
	Max = Max > c ? Max :c ;
	
	System.out.println("Biggest NUmber is "+ Max );
	

	int Min = a < b ? a : b ;
	
	Min = Min < c ? Min : c ;
	
		System.out.println("smallest number is "+ Min);
	}

}
