package four;

public class Tester {
    public static void main(String[] args) {
        ContractEmployee c_emp = new ContractEmployee(1, "ram", 5, 10);
        c_emp.calculateSalary();
        System.out.println(c_emp.getSalary());
        PermanentEmployee p_emp = new PermanentEmployee(2, "shyam", 10000,5000 , 2);
        p_emp.MonthlySalary();
        System.out.println(p_emp.getSalary());
    }
}
