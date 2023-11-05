package introduction;
import java.util.*;

public class leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x=new Scanner (System.in);
		int a=x.nextInt();
		if (a%4==0) {
			if (a%10==0) {
				if (a%400==0) {
					System.out.println("yes 3");}
				else 
					System.out.println("no");
				}
			else { System.out.println("yes 2");}
				
			
				
		}
		else {
			System.out.println("no1");
		}}}