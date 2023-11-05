package practice;

public class equalscom {

	public static void main(String[] args) {
	
		String str1 = new String("10");
		String str2 = new String("10");
		
		boolean re1 = str1==str2;
		System.out.println(re1);		

		boolean re2 = str1.equals(str2);
		System.out.println(re2);
		
	}

}
