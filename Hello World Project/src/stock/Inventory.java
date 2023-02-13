package stock;

public class Inventory {
    protected int quantity;
	protected int lowOrderLevelQuantity;
	public Inventory(int quantity,int lowOrderLevelQuantity) {
		this.quantity = quantity;
		this.lowOrderLevelQuantity = lowOrderLevelQuantity;
	}
	
}
