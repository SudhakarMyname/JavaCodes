package arrays;
import java.util.*;

public class traversal {
	
		 
	   
	 // public static int R = 5, C = 4;
	  public static void diagonalOrder(int[][] arr, int n, int m)
	  {
	 
	    // we will use a 2D vector to
	    // store the diagonals of our array
	    // the 2D vector will have (n+m-1)
	    // rows that is equal to the number of
	    // diagonals
	    ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>(n+m-1);
	    for(int i = 0; i < n + m - 1; i++)
	    {
	      ans.add(new ArrayList<Integer>());
	    }
	 
	    for (int i = 0; i < n; i++)
	    {
	      for (int j = 0; j < m; j++)
	      {
	        (ans.get(i+j)).add(arr[i][j]);
	      }
	    }
	 
	    for (int i = 0; i < ans.size(); i++)
	    {
	      for (int j = ans.get(i).size() - 1; j >= 0; j--)
	      {    System.out.print(ans.get(i).get(j)+ " ");
	      }  
	      System.out.println();
	    }
	  }
	 
	  // Driver code
	  public static void main (String[] args) {
		  Scanner x=new Scanner(System.in);
		  int n= x.nextInt();
		  int m= x.nextInt();
	    
	    int[][] arr= new int [n][m];
	 for (int i=0; i<n;i++) {
		 for (int j=0; j<n; j++) {
			 arr[i][j]=x.nextInt();
		 }
	 }
	    diagonalOrder(arr, n, m);
	  }
	}
	 