package practice;
import java.util.*;

public class stringnaem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		String s = x.nextLine();
		System.out.println(s.charAt(2));
		System.out.print(s.length());	
		System.out.println();
		System.out.print(s.substring(0));
		System.out.println();
		System.out.print(s.substring(1,10));
		System.out.println();
		System.out.println(s.contains("sanu"));
		String s1=new String(s);
		System.out.println(s==s1);
		System.out.println(s1);
		System.out.println(s.equals(s1));
		System.out.println(s.isEmpty());
		s=s+" kumar";
		System.out.println(s);
		System.out.println(s.concat("sanu"));
		System.out.println(s.replace('a','e'));
		String car=x.nextLine();
		System.out.println(car.indexOf('m'));
		String allcars[]=car.split(" ");
		for(String car1:allcars) {
			System.out.println(car1);
		}
		String name=x.nextLine();
		System.out.println(name.trim());
		
		
	}

}
