package Assignment1_Non_Arry;


//1 1 2 3 5 8 13 21 34 55

public class Series2 {

	public static void main(String[] args) {
	int a=0;
	int b=1;
	System.out.println(1);
	for(int i=0;i<=8;i++) {
		
	 int temp=b;
		b=b+a;
		a=temp;
			
		System.out.println(b);
	}
		
	}

}
