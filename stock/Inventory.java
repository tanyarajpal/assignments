package stock;
public class Inventory {
    protected static int laptops_quantity;
    protected static int accessories_quantity;
    protected int lowOrderLevelQuantity;
    public Inventory(int quantity,String type){
        if(type == "laptops")
          laptops_quantity += quantity;
        else if(type == "accessories")
          accessories_quantity += quantity;
    }
    public Inventory(){


    }
    public static void placeOrder(int quantity,String brand,String type,int price){
        if(type == "laptop"){
        System.out.println(laptops_quantity);
            if(quantity <= laptops_quantity ){
                System.out.println("Bill ");
                System.out.println(quantity*price);
                return;
            }
        }   
        else if(type == "accessories"){
            System.out.println(accessories_quantity);
                if(quantity <= accessories_quantity ){
                    System.out.println("Bill ");
                    System.out.println(quantity*price);
                    return;
                }
            }   
        System.out.println("RequestForMaterial (RFM) is generated");
    }
}