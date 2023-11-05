package Assignment1_Non_Arry;
import java.util.*;

// print Numbers not Present in 0123456789

public class NumPresentOrNot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		String x= sc.nextLine();
		String y= "0123456789";
		String rep=y;
		for(int i=0; i<=9 ;i++) {
			for(int j= 0 ; j<= x.length()-1; j++) {
				char ch =y.charAt(i);
				char ch2=x.charAt(j);
				if( i==0 && ch2==ch) {
				 rep=y.replace('0',' ');
				 y=rep;
				 }
				if(i==1 && ch2==ch) {
				 rep=y.replace('1',' ');
				 y=rep;
				}
				if(i==2 && ch2==ch) {
					 rep=y.replace('2',' ');
					 y=rep;
					}
				if(i==3 && ch2==ch) {
					 rep=y.replace('3',' ');
					 y=rep;
					}
				if(i==4 && ch2==ch) {
					 rep=y.replace('4',' ');
					 y=rep;
					}
				if(i==5 && ch2==ch) {
					 rep=y.replace('5',' ');
					 y=rep;
					}
				if(i==6 && ch2==ch) {
					 rep=y.replace('6',' ');
					 y=rep;
					}
				if(i==7 && ch2==ch) {
					 rep=y.replace('7',' ');
					 y=rep;
					}
				if(i==8 && ch2==ch) {
					 rep=y.replace('8',' ');
					 y=rep;
					}
				if(i==9 && ch2==ch) {
					 rep=y.replace('9',' ');
					 y=rep;
					}	
			}	
		}
		System.out.println(y);
	}}
		