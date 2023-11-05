package practice;
import java.util.*;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int []arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=x.nextInt();
			System.out.println();
		}
		for(int i=0;i<n-1;i++) {   
			int minind=i;
    for(int j=i;j<n;j++) {
    		if(arr[j]<arr[minind]) {
    		minind=j;
    	}}
    int temp=arr[i];
    arr[i]=arr[minind];
    arr[minind]=temp;
		}
		for(int total:arr) {
			System.out.print(total);}}}
