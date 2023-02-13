package material;

import stock.Inventory;

public class Laptops extends Inventory {
	int id;
	public Laptops(int quantity,int lowOrderLevelQuantity) {
		super(quantity,lowOrderLevelQuantity);
	}
	public static void main(String args[]) {
		Laptops obj1 = new Laptops(5,3);
		
	}
}
