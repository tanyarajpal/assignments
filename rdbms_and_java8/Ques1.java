package rdbms_and_java8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques1 {

	public static void main(String[] args) {
		
		List<String> StringList = Arrays.asList("Hello", "Welcome", "Hi", "AntWalk", "Assignment");
		List<String> FilteredList = new ArrayList<String>();
		
		FilteredList = StringList.stream().filter(n->(n.length()>5&& n.length()<8)).collect(Collectors.toList());
		System.out.println(FilteredList);
		
	}

}

