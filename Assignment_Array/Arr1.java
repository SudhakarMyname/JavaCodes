package Assignment_Array;



public class Arr1 {

	public static void main(String[] args) {
	
	int[] x= {10,45,17,49,123,56,7,1};
	
	int[] y= new int[x.length];
	
	for(int i=0; i < x.length; i++) {
		
		y[i]= x[(x.length-1)-i];
		
	}
	
	for(int e:y) {
		System.out.print(e+" ");
	}
	
	}

}
