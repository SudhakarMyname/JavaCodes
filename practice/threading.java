package practice;

public class threading extends Thread{
	
	public void run()
	{
		System.out.println("hello world");
	}
	

	public static void main(String[] args) {
		
		new threading () . start();

	}

}
