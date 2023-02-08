package rdbms_and_java8;

@FunctionalInterface
interface MyPersonInterface{
	Person getPerson(String name, Integer age);
}

public class Assign3_Ques2_tester {

public static void main(String[] args) {
		
		MyPersonInterface obj = Person :: new;
		System.out.println(obj.getPerson("Tanya", 21));
        System.out.println(obj.getPerson("Richa", 21));
}
}