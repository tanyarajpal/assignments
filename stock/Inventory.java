package stock;
public class Inventory {
    protected static int laptops_quantity;
    protected static int accessories_quantity;
    protected int lowOrderLevelQuantity;
    public Inventory(int quantity){
        this.quantity += quantity;
    }
    public Inventory(){

    }
}