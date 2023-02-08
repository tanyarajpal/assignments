package generic_multithreading_gof;

import java.util.ArrayList;
import java.util.List;

class GenericClass<T>{
    public void display(List<T>list){
        for(T ele : list){
            System.out.print(ele+" ");
        }
    }
}

public class ques2 {
    public static void main(String[] args) {

        List<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        
        List<Float> arr2 = new ArrayList<Float>();
        arr2.add(4.2f);
        arr2.add(5.7f);
        arr2.add(6.54f);
      
        List<Double> arr3 = new ArrayList<Double>();
        arr3.add(1.3425);
        arr3.add(2.232432);
        arr3.add(3.2321);       
       
        List<String> arr4 = new ArrayList<String>();
        arr4.add("tanya");
        arr4.add("shreya");
        arr4.add("richa");

        System.out.println("Integer values");
        GenericClass<Integer> obj1 = new GenericClass<Integer>();
        obj1.display(arr1);
        System.out.println();

        System.out.println("Float values");
        GenericClass<Float> obj2 = new GenericClass<Float>();
        obj2.display(arr2);
        System.out.println();

        System.out.println("Double values");
        GenericClass<Double> obj3 = new GenericClass<Double>();
        obj3.display(arr3);
        System.out.println();

        System.out.println("String values");
        GenericClass<String> obj4 = new GenericClass<String>();
        obj4.display(arr4);
        System.out.println();
    }
}
