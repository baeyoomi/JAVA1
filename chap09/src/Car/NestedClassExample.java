package Car;

public class NestedClassExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		Car.Tire tire =  new Car.Tire() ;
		Car.Engine engine = new Car.Engine();
	}
}