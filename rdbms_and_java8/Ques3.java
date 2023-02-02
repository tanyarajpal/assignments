package rdbms_and_java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	 int id;
	 String name;
	 double price;
	public Product(int id, String name,double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productList1 = new ArrayList<Product>();
		productList1.add(new Product(101,"HP",40000));
		productList1.add(new Product(102,"APPLE",25000));
		productList1.add(new Product(103,"LENOVO",40000));
		
		List<Product> productList2 = new ArrayList<Product>();
		productList2.add(new Product(101,"iphone",40000));
		productList2.add(new Product(102,"redme",25000));
		productList2.add(new Product(103,"realme",40000));
		
		List<Product> productList3 = new ArrayList<Product>();
		productList3.add(new Product(101,"canon",40000));
		productList3.add(new Product(102,"sony",25000));
		productList3.add(new Product(103,"leica",40000));
		
		List<List<Product>> productList = new ArrayList<List<Product>>();
		productList.add(productList1);
		productList.add(productList2);
		productList.add(productList3);
		for(List<Product> product : productList) {
			for(Product pname : product) {
				System.out.print(pname.name);
			}
		}
		
		List<Product> products = productList.stream().flatMap(pList->pList.stream()).collect(Collectors.toList());
		for(Product p : products) {
			System.out.print(p.name+" ");
		}
//		System.out.println(productNames);
		

	}

}
