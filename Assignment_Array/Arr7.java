package Assignment_Array;

//Display Index of Largest no.

public class Arr7 {

	public static void main(String[] args) {
		
		int [] x= {10,24,45,212,11,87,6666};
		int b=x.length-1;
		int max= -1;
		int index=0;
		for(int i=0;i <= b; i++) {
			
			if(x[i]>max) {
				max=x[i];
				index=i;
			}
			
		}System.out.println(index);
		
		
	}

}
