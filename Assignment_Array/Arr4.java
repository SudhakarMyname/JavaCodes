package Assignment_Array;

//Array 4

public class Arr4 {

	public static void main(String[] args) {
		
		int []x= {10,24,45,12,1,87,6};
		int []y= {123,92,6,10,11,4,16};
	int a=y.length-1;
	System.out.println("Sum of both Arrays");
	for(int i=0 ; i<=a; i++  ) {
	System.out.println(x[i]+y[i]);	
	}
	System.out.println("================================================");
	System.out.println("Numbers Not present in Array Y");
		for(int i=0; i<=a;i++) {
			int flag=0;
		for(int j=0; j<=a;j++) {
			
			if(y[j]==x[i]) {
				
			flag++;
			}
			
		}	if(flag==0) {
			System.out.println(x[i]);
		}
		
		}
	System.out.println("======================================================");
	System.out.println("Nos. Common in Both Arrays");
	for(int i=0;i<=a;i++) {
		for(int j=0;j<=a;j++) {
			
			if(y[j]==x[i]) {
				System.out.println(x[i]);
			}}}}}


