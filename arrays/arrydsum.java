package arrays;

import java.util.Scanner;

public class arrydsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Scanner x=new Scanner(System.in); 
		int i= x.nextInt();
		int j= x.nextInt();
			int [][]a= new int[i][j];
			
			
			for (int c=0; c<i ; c++) {
				for (int b=0; b<j; b++) {
					a[c][b]= x.nextInt();		}
				
		}int sum=0;
			for (int c=0; c<i;c++) {
			for (int d=0; d<j; d++) {
				
				if(c==d) {
				
							sum= sum+ a[c][d];}}}
			System.out.print(sum);
						
					}
			
				}

