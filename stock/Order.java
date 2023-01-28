package stock;

import java.util.Scanner;
import java.util.stream.Stream;

import stock.material.Accessories;
import stock.material.Laptops;

public class Order {
    public static void main(String[] args) {
        Laptops l1 = new Laptops(1,"dell",256,20000);
        Laptops l2 = new Laptops(1,"macbook",256,200000);
        Laptops l3 = new Laptops(1,"asus",512,30000);
        Laptops l4 = new Laptops(1,"lenovo",256,40000);
        Laptops l5 = new Laptops(1,"hp",256,50000);

        for(int i =0;i<10;i++){
            Accessories accessories = new Accessories(i, "keyboard");
        }
        int n = 3;
        Laptops l = new Laptops();
        l.placeOrder(n,);
    }
}
