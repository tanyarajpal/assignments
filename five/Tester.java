package five;

public class Tester {
    public static void main(String[] args) {
        BankA ba = new BankA();
        System.out.println( ba.getBalance());
        BankB bb = new BankB();
        System.out.println( bb.getBalance());
        BankC bc = new BankC();
        System.out.println( bc.getBalance());

        City city = new City();
        City.cityList.add(new City(123456,"Kolkata"));
        City.cityList.add(new City(876543,"Delhi"));
        City.cityList.add(new City(234567,"Bangalore"));
        City.cityList.add(new City(890123,"Mumbai"));
        City.cityList.add(new City(901234,"Jaipur"));
        city.findCityByZipCode(12345);
    
    }
}
