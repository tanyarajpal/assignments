package two;

public class Road {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus = new Bus("blue",4,"top");
		bus.displayBus();
		Truck truck = new Truck("black",5,"top");
		truck.displayTruck();
		Car car = new Car("red",6,"top");
		car.displayCar();

	}
}
