package stock;

import java.util.Scanner;
import java.util.stream.Stream;

import stock.material.Accessories;
import stock.material.Laptops;

public class Order {
    public static void main(String[] args) {
        Laptops l1 = new Laptops(1,1,"dell",256,20000);
        Laptops l2 = new Laptops(1,2,"macbook",256,200000);
        Laptops l3 = new Laptops(1,3,"asus",512,30000);
        Laptops l4 = new Laptops(1,4,"lenovo",256,40000);
        Laptops l5 = new Laptops(1,5,"hp",256,50000);

 
        Accessories accessory1 = new Accessories(2,6, "keyboard",10000);
        Accessories accessory2 = new Accessories(3,6, "mouse",1000);
        Accessories accessory3 = new Accessories(4,6, "headphone",8000);
        Accessories accessory4 = new Accessories(5,6, "keyboard cover",500);
        Accessories accessory5 = new Accessories(6,6, "screen gaurd",1000);
        Accessories accessory6 = new Accessories(2,6, "charger",1000);
        Accessories accessory7 = new Accessories(1,6, "USB",2000);
        Accessories accessory8 = new Accessories(1,6, "CPU",10000);
        Accessories accessory9 = new Accessories(1,6, "keyboard",5000);
        Accessories accessor10 = new Accessories(4,6, "keyboard",6000);
 
        Inventory.placeOrder(2, "dell", "laptop", 40000);
        Inventory.placeOrder(2, "dell", "accessories", 6000);

    }
}
