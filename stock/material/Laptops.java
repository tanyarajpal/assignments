package stock.material;
import stock.Inventory;

public class Laptops extends Inventory{
    private int laptop_id;
    private String brand;
    private int storage;
    private int price;
    public Laptops(int no_of_laptops,int id,String brand,int storage,int price){
        super(no_of_laptops,"laptops");
        this.lowOrderLevelQuantity = 3;
        this.laptop_id = id;
        this.brand = brand;
        this.storage = storage;
        this.price = price;
    }
    public Laptops(){

    }
    
}
