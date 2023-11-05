package practice;
import java.util.*;

public class sidetriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner x=new Scanner(System.in);
int n=x.nextInt();
int rows=2*n-1;
for(int i=1; i<=rows;i++) {
	for(int j=1;j<=i;j++) {
		if(i<=n) {
			System.out.print("* ");
		}
	}
	 if (i>n) {
		for(int j=rows-i+1;j>=1;j--) {
			System.out.print("* ");
		}
	
		
	}
	 System.out.println();
}


	}

}
