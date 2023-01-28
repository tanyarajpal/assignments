package stock.material;
import stock.Inventory;

public class Laptops extends Inventory{
    private int laptop_id;
    private String brand;
    private int storage;
    private int price;
    public Laptops(int no_of_laptops,String brand,int storage,int price){
        super(no_of_laptops);
        this.lowOrderLevelQuantity = 3;
        this.brand = brand;
        this.storage = storage;
        this.price = price;
    }
    public Laptops(){

    }
    public void placeOrder(int quantity,String brand){
        System.out.println(this.quantity);
        if(quantity <= this.quantity){
            System.out.println("Bill ");
            System.out.println(quantity*this.price);
            return;
        }
        System.out.println("RequestForMaterial (RFM) is generated");
    }
}
