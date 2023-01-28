package stock.material;

import stock.Inventory;

public class Accessories extends Inventory{
    private int accessory_id;
    private String name;
    public Accessories(int no_of_accessories, String name){
        super(no_of_accessories);
        this.lowOrderLevelQuantity = 5;
        this.name = name;
    }
}
