package arrays;
import java.util.*;
public class arrymtrixsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner x= new Scanner (System.in);
int i= x.nextInt();
int j= x.nextInt();
int [][]a= new int [i][j];
int [][]q= new int [i][j];

for (int b=0; b<i; b++) {
	
	for( int c=0 ;  c<j; c++ ) {
		System.out.print("entered 1 matrix");
		a[b][c]=x.nextInt();
	}}
for( int b=0 ;  b<j; b++ ){
	for( int c=0 ;  c<j; c++ ) {
	System.out.print("enter 2 matrix");
	q[b][c]=x.nextInt();
	}
}
for (int b=0; b<i; b++) {
	for (int c=0 ; c<j ; c++) {
	int [][]e= new int [i][j];
		e[b][c]= a[b][c]+q[b][c];
		System.out.print(e[b][c]);
	}


System.out.println();}
	}

}
