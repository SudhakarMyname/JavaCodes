package javatpoint;

public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=120;int sum=0;
		int n=a;
		while (n>0) {
			 
			 int r= n%10;
			 sum= (sum*10)+r;
			 n=n/10;
		}
if (a==sum) {
	System.out.println("yes it is pallindrome");
}
else {
	System.out.println("no it is not a pallindrome");
}
	}

}
