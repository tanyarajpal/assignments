package Abstract_Interface_Exception;

public class BankB extends Bank{
    private int balance = 150;
    @Override
    public int getBalance() {
        // TODO Auto-generated method stub
        this.balance = 150;
        return this.balance;
    }
    
}
