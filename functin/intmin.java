package functin;

public class intmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []a= new int [] {1,2,3};
		
		
		int max= Integer.MIN_VALUE;
		for (int i=0; i<3; i++) {
		if (a[i]>= max) {
			
			max= a[i];
			System.out.print(max);
			
		}
		

	}

}}
