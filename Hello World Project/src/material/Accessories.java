package material;

import stock.Inventory;

public class Accessories extends Inventory {
	int id;
	public Accessories(int quantity,int lowOrderLevelQuantity) {
		super(quantity,lowOrderLevelQuantity);
	}
	public static void main(String args[]) {
		Accessories obj = new Accessories(10,5);
	}
}
