package practice;
import java.util.*;

public class multipleinput {

	class Main {
		public void main (String[] args) {
	                      // Your code here
	                      Scanner x=new Scanner(System.in);
	                      int i=x.nextInt();
	                      int []a= new int [i];

	                      for (int j=0; j<i; j++){
	                        a[j]= x.nextInt();

	                      }int sum=0;
	                      System.out.print("0"+" ");
	                      for (int q=0; q<i;q++){
	                            sum=sum+a[q];
	                             if (a[q]<=a[q+1]){

	                                  a[q]=0;
	                                  
	                                  System.out.print(+a[q]+" ");
	                              }
	                             else if(a[q]>a[q+1]) {

	                                  a[q]=a[q]-a[q+1];
	                                  
	                                  System.out.print(a[q]+" ");
	                             }
	                             
	                              }

	                     }}}
	                     