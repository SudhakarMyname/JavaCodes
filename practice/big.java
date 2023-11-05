package practice;
import java.math.BigInteger;
import java.util.*;

public class big {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner x=new Scanner(System.in);
String s=x.nextLine();
String s1=x.nextLine();

BigInteger i= new BigInteger(s);
BigInteger a= new BigInteger(s1);
BigInteger mod = i.mod(a);
int v=mod.intValue();
if(v==0) {
	System.out.println("yes");
}
	


System.out.println(v);
	}

}
