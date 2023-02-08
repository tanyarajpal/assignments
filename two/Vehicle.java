package two;

public class Vehicle {
	String color;
	int no_of_wheels;
	String model;
	Vehicle(String color, int no_of_wheels,String model)
	{
		this.color=color;
		this.no_of_wheels = no_of_wheels;
		this.model=model;
	}
	void display(String name)
	{
		System.out.print(name+" ");
		System.out.print(color+ " ");
		System.out.print(no_of_wheels+" ");
		System.out.println(model);
	}
}
