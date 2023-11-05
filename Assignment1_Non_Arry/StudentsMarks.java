package Assignment1_Non_Arry;
import java.util.*;

// Show Grade 

public class StudentsMarks {

	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		System.out.println("Enter English Marks");
		int a= x.nextInt();
		System.out.println("Enter Hindi Marks");
		int b= x.nextInt();
		System.out.println("Enter Maths Marks");
		int c= x.nextInt();
		System.out.println("Enter So.Science Marks");
		int d= x.nextInt();
		System.out.println("Enter Phy.Edu. Marks");
		int e= x.nextInt();
		
		int Percentage=(a+b+c+d+e)/5;
		
		if(Percentage >=85) {
			System.out.println("EXCELLENT");
		}
		else if( Percentage < 85 && Percentage >= 70 ) {
		System.out.println("VERY GOOD");}
		else if( Percentage < 70 && Percentage >= 55 ) {
			System.out.println("GOOD");
		}else if( Percentage < 55 && Percentage >=40 ) {
			System.out.println("POOR");
		}
		else {
			System.out.println("VERY POOR");
		
		}
		
	}

}
