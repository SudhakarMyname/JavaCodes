package functin;
import java.util.*;

public class pprcstic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x=new Scanner(System.in);
		int n= x.nextInt();
		long []a= new long [n];

		for (int i=0; i<n; i++)
			a[i]=x.nextInt();

		long max_value=-1;
	for (int i=0; i<n;i++){

		for ( int k=n-1; k>i ; k--){

			if (a[k]>a[i] ){
				
				max_value=Math.max(max_value,k-i);
				break;}}}
				System.out.print(max_value);}}