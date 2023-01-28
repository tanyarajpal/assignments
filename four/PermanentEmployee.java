package four;

public class PermanentEmployee extends Employee{
    double basicPay;
    double hra;
    float experience;
   public PermanentEmployee(int empId,String name,double basicPay,double hra,float experience){
     super(empId,name);
     this.basicPay = basicPay;
     this.hra = hra;
     this.experience = experience;
   }
   public void MonthlySalary(){
      double sal = this.basicPay + this.hra ;
      if(this.experience >= 3 && this.experience < 5){
        sal = sal + ((5*this.basicPay)/100) ;
      }
      else if(this.experience >= 5 && this.experience < 10){
        sal = sal + ((7*this.basicPay)/100) ;
      }
      else if(this.experience >= 10){
        sal = sal + ((12*this.basicPay)/100) ;
      }
      double roundOff = Math.round(sal * 100.0) / 100.0;
      this.setSalary(roundOff); 
   }
   public double getBasicPay(){
    return this.basicPay;
   }
   public void setBasicPay(double basicPay){
    this.basicPay = basicPay;
   }
   public double getHra(){
    return this.hra;
   }
   public void setHra(double hra){
    this.hra = hra;
   }
   public float getExperience(){
    return this.getExperience();
   }
   public void setExperience(float experience){
        this.experience = experience; 
   }



}
