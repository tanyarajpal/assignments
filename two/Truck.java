package two;

public class Truck extends Vehicle{
	
	
	public Truck(String color, int no_of_wheels, String model) {
		super(color, no_of_wheels, model);
		// TODO Auto-generated constructor stub
	}

	void displayTruck()
	{
		super.display("Truck");
	}

}
