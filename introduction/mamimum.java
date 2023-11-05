package introduction;
import java.util.*;
import java.io.*;

public class mamimum {
	static int max(int a,int b) {
		
		int c=a>b?a:b;
		return c;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner x=new Scanner (System.in);
 int a=1;a=2;
 int b=x.nextInt();
 int result=max(a,b);
 
 System.out.println(result);
	}

}
