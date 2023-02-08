package stock.material;

import stock.Inventory;

public class Accessories extends Inventory{
    private int accessory_id;
    private String name;
    private double price;
    public Accessories(int no_of_accessories, int accessory_id,String name,double price){
        super(no_of_accessories,"accessories");
        this.lowOrderLevelQuantity = 5;
        this.name = name;
        this.accessory_id = accessory_id;
        this.price = price;
    }
}
