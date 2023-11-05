package practice;
import java.util.*;
public class numofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x=new Scanner (System.in);
		int n=x.nextInt();
		int numberofdigits=(int)Math.log10(n)+1;
		System.out.println(numberofdigits);
		
		
	}

}
