package five;

public class Tester {
    public static void main(String[] args) {
        BankA ba = new BankA();
        System.out.println( ba.getBalance());
        BankB bb = new BankB();
        System.out.println( bb.getBalance());
        BankC bc = new BankC();
        System.out.println( bc.getBalance());
    }
}
