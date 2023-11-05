package functin;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


public class mk {




  
    // function to print the
    // required traversal
    public static void counterClockspiralPrint(int m,
                                        int n,
                                        int arr[][])
    {
        int i, k = 0, l = 0;
 
    /* k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator */
 
        // initialize the count
        int cnt = 0;
 
        // total number of
        // elements in matrix
        int total = m * n;
 
        while (k < m && l < n)
        {
            if (cnt == total)
                break;
 
            // Print the first column
            // from the remaining columns
            for (i = k; i < m; ++i)
            {
                System.out.print(arr[i][l] + " ");
                cnt++;
            }
            l++;
 
            if (cnt == total)
                break;
 
            // Print the last row from
            // the remaining rows
            for (i = l; i < n; ++i)
            {
                System.out.print(arr[m - 1][i] + " ");
                cnt++;
            }
            m--;
 
            if (cnt == total)
                break;
 
            // Print the last column
            // from the remaining columns
            if (k < m)
            {
                for (i = m - 1; i >= k; --i)
                {
                    System.out.print(arr[i][n - 1] + " ");
                    cnt++;
                }
                n--;
            }
 
            if (cnt == total)
                break;
 
            // Print the first row
            // from the remaining rows
            if (l < n)
            {
                for (i = n - 1; i >= l; --i)
                {
                    System.out.print(arr[k][i] + " ");
                    cnt++;
                }
                k++;
            }
        }
    }
 
// Driver Code
public static void main(String[] args)
{
    Scanner x=new Scanner(System.in);
    int m=x.nextInt();
    int n=m;
    int arr[][] = new int [m][n];
    for(int i=0;i<m;i++) {
    	for(int j=0;j<n;j++) {
    		arr[i][j]=x.nextInt();
    	}
    	
    }
    // Function calling            
    counterClockspiralPrint(m, n, arr);
}
}