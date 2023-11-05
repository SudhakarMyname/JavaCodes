package Assignment_Array;

// Show Nos. Greater than adjacent no.

public class Arr5 {

	public static void main(String[] args) {
	
		int[] num= {100, 34, 23, 67, 134, 56, 789, 123};
		int b=num.length-1;

		if(num[0]>num[1]) {
			System.out.println(num[0]);
		}
for(int i=1; i<b ;i++) {
	if(num[i]>num[i-1] && num[i] > num[i+1] ) {
		System.out.println(num[i]);
	}
	if(num[b]>num[b-1]) {
		System.out.println(num[b]);
	}
}}}
