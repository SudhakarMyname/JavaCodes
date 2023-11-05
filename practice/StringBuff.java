package practice;

public class StringBuff {
	
	    public static void main(String[] args) {
	        StringBuffer stringBuffer = new StringBuffer();
	        StringBuilder stringBuilder = new StringBuilder();

	        Runnable task = new Runnable()
	      {
	            @Override
	            public void run() {
	            	 for (int i = 0; i < 1000; i++) {
	 	                stringBuffer.append("a");
	 	                stringBuilder.append("a");
	 	            }
	            }
	        };

	       // Runnable task = () -> {
	     
	        Thread thread1 = new Thread(task);
	        Thread thread2 = new Thread(task);

	        thread1.start();
	        thread2.start();

	        try {
	            thread1.join();
	            thread2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("StringBuffer length: " + stringBuffer.length());
	        System.out.println("StringBuilder length: " + stringBuilder.length());
	    }
	}


