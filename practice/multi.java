package practice;

public class multi implements Runnable{
	
	public void run() {
	
		
	System.out.println("helolo");	
		
	}

	public static void main(String[] args) {
		
		
		multi obj = new multi();
		Thread th = new Thread(obj);
		
		th.start();
	}

	

}
