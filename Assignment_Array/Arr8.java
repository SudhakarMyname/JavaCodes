package Assignment_Array;

// Display Nos. whose Digits sum is even

public class Arr8 {

	public static void main(String[] args) {
		int[]x= {10,24,45,212,11,87,6};
		int b=x.length-1;
	for(int i=0 ; i<=b ; i++) {
	
int a=x[i];
while(a>9) {
	int rem=a%10;
	int div=a/10;
	a=rem+div;
	}
if(a%2==0) {
	System.out.println(x[i]);
}
		
	}
		
		
	}

}
