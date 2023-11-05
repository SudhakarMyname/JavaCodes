package Assignment_Array;

//Atleast one multiple in Array y

public class Arr6 {

	public static void main(String[] args) {
		int[] x= {10,24,45,22,11,87,6};
		int[]y = {12,90,33,80};
		int c=y.length-1;
		int flag=0;	
		for(int i=0; i<=c ; i++ ) {
			
		for(int j=0; j<=x.length-1;j++) {
			
			if(y[i]%x[j]==0) {
				
				System.out.print(x[j]+" ");
			
			}
			
		}
		System.out.println();
			
		}
		
		
	}

}
