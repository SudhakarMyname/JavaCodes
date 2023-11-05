package practice;
import java.util.*;

public class ne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++) {
    	 arr[i]=x.nextInt();
    	 
    	 
     }
     for(int i=0; i<n-1;i++) {
    	 for(int j=0; j<n-1;j++) {
    		 if(arr[j+1]<arr[j]) {
    			 int temp=arr[j+1];
    			 arr[j+1]=arr[j];
    			 arr[j]=temp;
    		 }
    	 }
     }
     for(int item:arr) {
    	 System.out.print(item);
     }
	}

}
