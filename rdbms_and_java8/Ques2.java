package rdbms_and_java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	 int id;
	 String name;
	 double salary;
	public Employee(int id, String name,double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return this.salary;
	}
}

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(101,"Tanya",40000));
		employeeList.add(new Employee(102,"Ankit",25000));
		employeeList.add(new Employee(103,"Abhinav",60000));
		employeeList.add(new Employee(104,"Shreya",30000));
		employeeList.add(new Employee(105,"Richa",40000));
		List<Double> incrementedList= new ArrayList<Double>();
		incrementedList = employeeList.stream().map(emp->emp.salary*1.10).collect(Collectors.toList());
//		for(Employee emp : incrementedList) {
//			System.out.print(emp.id);
//			System.out.print(emp.name);
//			System.out.print(emp.salary);
//			
//		}
//		for(Employee emp : employeeList) {
//			System.out.print(emp.id);
//			System.out.print(emp.name);
//			System.out.print(emp.salary);
//			
//		}
		System.out.println(incrementedList);

	}

}



