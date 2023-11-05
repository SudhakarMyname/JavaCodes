package AI_p;

class Superclass {
    public static void display() {
        System.out.println("Superclass display()");
    }
}

class Subclass extends Superclass  {
    public static void display() {
        System.out.println("Subclass display()");
    }
}

public class methodhiding {

	
	 public static void main(String[] args) {
	        Superclass superObj = new Superclass();
	        Superclass subObj = new Subclass();
	        superObj.display(); // Calls Superclass display()
	        subObj.display(); // Calls Superclass display() due to static method hiding
	    }
	
}
