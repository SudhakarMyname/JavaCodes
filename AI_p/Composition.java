package AI_p;

//Composition example

//Engine class
class Engine {
 public void start() {
     System.out.println("Engine started");
 }
}

//Car class using composition
class Car {
 private Engine engine; // Composition

 public Car() {
     this.engine = new Engine(); // Creating an Engine object within Car
 }

 public void startCar() {
     engine.start(); // Delegating the start operation to the Engine object
     System.out.println("Car started");
 }
}

//Main class

public class Composition {
	 public static void main(String[] args) {
	     Car car = new Car();
	     car.startCar();
	 }
}
