package Assignment1_Non_Arry;


// A B D G K P V

public class Series4 {

	public static void main(String[] args) {
		int a=65;
		int c=0;
		
		for(int i=0;i<=6;i++) {
			
			c=i+a;
			a=c;
			char ch=(char)c;
			System.out.println(ch);
		}
		

	}

}
