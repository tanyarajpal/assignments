package four;

public class Employee {
     private int employeeId;
     private String employeeName;
     private double salary;

     public Employee(int e_id,String e_name){
        this.employeeId = e_id;
        this.employeeName = e_name;
     }

     public int getEmployee(){
        return this.employeeId;
     }

     public void setEmployeeId(int employeeId){
            this.employeeId = employeeId;
     }

     public String getEmplyeeName(){
        return this.employeeName;
     }

     public void setEmployeeName(String employeeName){
            this.employeeName = employeeName;
     }

     public double getSalary(){
        return this.salary;
     }

     public void setSalary(double salary){
        this.salary = salary;
     }
     

}
