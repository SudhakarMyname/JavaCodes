package practice;
import java.util.*;

public class addry {
	
	static int r=4,c=4;
	static int rowindex(int mat[][]) {
		int max=-1;
		int k=c-1; int maxrow=0;
		for(int i=0; i<r; i++) {
			int sum=0;
		
			for(int j=0;j<c;j++) {
			
				sum = sum+mat[i][j];
				
			}
				
			
			if(sum>max) {
			
				maxrow=i;}
				max=sum;
			//System.out.print(i);	
			
			
				if (maxrow ==0 && mat[0][c-1]==0)
					return -1;
				
				
				}return maxrow;
			}
			public static void main (String[]args) {
				
				
				
				int mat[][]={{0,1,1,1},
						     {1,0,1,1},
						     {1,1,0,1},
						     {1,1,1,1}};
				
				System.out.println(rowindex(mat));
			}
		}
		
		
		
