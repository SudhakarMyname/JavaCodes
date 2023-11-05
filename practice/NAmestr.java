package practice;

public class NAmestr {

	public static void main(String[] args) {
		
		String str = "Sudhakar(7891)";
		
		int i = str.indexOf('(');
		int j = str.indexOf(')');
		
		System.out.println(i +"   " + j);
		
		String eid = str.substring(i+1 , j);
		
		System.out.println(eid);
		
		str = str.substring(0,i);
		
		System.out.println(str);
		
	}

}
