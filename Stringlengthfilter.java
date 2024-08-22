package tij;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Stringlengthfilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        // Initial list of strings
	        List<String> strings = new ArrayList<>();
	        strings.add("cat");
	        strings.add("sat");
	        strings.add("mat");
	        strings.add("python");
	        strings.add("java");
	        strings.add("R");
	        System.out.println("Orignal List: "+strings);

	        // Using filter method from stream API
	        List<String> filteredStrings = strings.stream()
	                .filter(s -> s.length() >= 4) // logic(length>=4)
	                .collect(Collectors.toList()); 

	        // Print filtered list
	        System.out.println("Filtered list: "+filteredStrings);

	}

}
