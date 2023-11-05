package Assignment_Array;

//Array Having 9 as last digit

public class Arr2 {

	public static void main(String[] args) {
		int [] x= {10,45,17,49,49,123,56,7,19};
		int a=x.length-1;
		for(int i=0;i<=a;i++) {
			
			int rem=x[i]%10;
			if(rem==9) {
			System.out.println(x[i]);}
			
		}
		
		
	}

}
