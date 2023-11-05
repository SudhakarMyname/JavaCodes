package Assignment_Array;

//Sum of Digits of Each Digits

public class Arr3 {

	public static void main(String[] args) {
		int[]x = {10,45,15,49,49,123,24,7,4011};
		int a = x.length-1;
		
		for(int i=0; i <=a;i++  ) {
			
			int num=x[i];
		
			while(num>9) {
				int div=num/10;
				int rem=num%10;
			   num=rem+div;
						
			}
			System.out.println(num);
		}
		
		
		
		

	}

}
