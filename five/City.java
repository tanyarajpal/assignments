package five;

import java.util.ArrayList;
import java.util.List;

class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}


public class City {
    int zipCode;
    String city;
    static ArrayList<City>cityList;
    static{
        cityList = new ArrayList<City>();
    }
    public City(){
        
    }
    public City(int zipCode, String city){
        this.zipCode = zipCode;
        this.city = city;
    }
    public void findCityByZipCode(int zipCode){
        try{
            Boolean flag = false;
            for(City city : cityList){
                if(city.zipCode == zipCode){
                    flag = true;
                    System.out.println("City found");
                    break;
                }
            }
            if(!flag){
                throw new MyException("City not found");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
   
}

