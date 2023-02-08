package four;

public class ContractEmployee extends Employee{
    double wage;
    float hoursWorked;
   public ContractEmployee(int empId,String name,double wage,float hoursWorked){
     super(empId,name);
     this.wage = wage;
     this.hoursWorked = hoursWorked;
   }
   public void calculateSalary(){
       double sal = this.hoursWorked * wage;
       double roundOff = Math.round(sal * 100.0) / 100.0;
       this.setSalary(roundOff); 
   }
   public double getWage(){
    return this.wage;
   }
   public void setWage(double wage){
    this.wage = wage;
   }
   public float getHoursWorked(){
    return this.hoursWorked;
   }
   public void setHoursWorked(float hoursWorked){
    this.hoursWorked = hoursWorked;
   }

}
