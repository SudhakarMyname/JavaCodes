package practice;
import java.util.*;
public class mutilplr7btw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner x=new Scanner(System.in);
int a=x.nextInt();
int b=x.nextInt();
int c=a%7;
if (c==0) {
	for(int i=a;i<=b;i=i+7) {
		System.out.print(i+" ");
	}
}
else {
	int d=a/7;
	int e=(d+1)*7;
	for (int j=e;j<=b;j=j+7) {
		System.out.println(j+" ");
	}
}
	}

}
