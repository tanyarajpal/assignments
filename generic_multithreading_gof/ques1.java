package generic_multithreading_gof;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
   // static ArrayList<Employee>EmployeeList = new ArrayList<Employee>();
    int empId;
    String empName;
    double salary;
    Employee(int empId,String empName,double salary){
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
    public static void deleteEmployee(int empId,ArrayList<Employee>EmployeeList){
        for(Employee emp : EmployeeList){
            if(emp.empId == empId){
                EmployeeList.remove(emp);
            }
        }
        System.out.println("Employee deleted successfully");
    }
    public static void searchEmployee(int empId,ArrayList<Employee>EmployeeList){
        for(Employee emp : EmployeeList){
            if(emp.empId == empId){
                System.out.println("Employee found");
                return;
            }
        }
        System.out.println("Employee not found");
    }
    public static void updateName(int empId, String name,ArrayList<Employee>EmployeeList){
        for(Employee emp : EmployeeList){
            if(emp.empId == empId){
               emp.empName = name;
                return;
            }
        }
        System.out.println("Employee name updated successfully");
    }
    public static void updateSalary(int empId, Double salary,ArrayList<Employee>EmployeeList){
        for(Employee emp : EmployeeList){
            if(emp.empId == empId){
                emp.salary = salary;
                return;
            }
        }
        System.out.println("Employee salary updated successully");
    }
}

public class ques1{
    public static void main(String[] args) {
       ArrayList<Employee>EmployeeList = new ArrayList<Employee>();
        int choice = 0 ;
        while(choice!=-1){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice \n 1 to Insert\n 2 to Display\n 3 to Search\n 4 to Delete\n 5 to Update\n -1 to exit" );
        choice = sc.nextInt();
        switch(choice){
            case 1 : {
                System.out.println("Enter the empoyee id");
                int empId = sc.nextInt();
                System.out.println("Enter the empoyee name");
                sc.nextLine();
                String empName = sc.nextLine(); 
                System.out.println("Enter the empoyee salary");
                double salary = sc.nextDouble(); 
                EmployeeList.add(new Employee(empId,empName,salary));
                System.out.println("employee inserted successfully");
                break;
            }
            case 2 : {
                for(Employee emp:EmployeeList){
                    System.out.println(emp.empId+" "+emp.empName+" "+emp.salary);
                }
                break;
            }
            case 3 : {
                System.out.println("Enter the empoyee id");
                int empId = sc.nextInt();
                Employee.searchEmployee(empId,EmployeeList);
                break;
            }
            case 4 : {
                System.out.println("Enter the empoyee id");
                int empId = sc.nextInt();
                Employee.deleteEmployee(empId,EmployeeList);
                break;
            }
            case 5 : {

                  System.out.println("Enter \n 1 to update Employee Name\n 2  to update Employee salary");
                  int num = sc.nextInt();
                  System.out.println("Enter the empoyee id");
                  int empId = sc.nextInt();
                  if(num == 1){
                    System.out.println("Enter the empoyee new name");
                    String newName = sc.nextLine();
                    Employee.updateName(empId,newName,EmployeeList);
                  }
                  else if(num == 2){
                    System.out.println("Enter the empoyee new salary");
                    Double updatedSalary = sc.nextDouble();
                    Employee.updateSalary(empId,updatedSalary,EmployeeList);
                  }
                  break;
            }
            case 6 :{
                System.out.println("exited");
                break;
            }


         }
        }
    }
    
}