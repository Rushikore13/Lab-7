package tij;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Person {
    String name;
    int age;
    String city;

    // Constructor
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    
    //Getter

public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}



	public String getCity() {
		return city;
	}
	  @Override
	public String toString() {
        return "Person{name='" + name + "', age=" + age + ", city='" + city + "'}";
}
}



public class FilterAgeCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Person> customers = new ArrayList<>();
	        customers.add(new Person("Vijay", 23, "New York"));
	        customers.add(new Person("Nerav", 17, "Los Angeles"));
	        customers.add(new Person("Daud", 19, "Chicago"));
	        customers.add(new Person("Viraj", 18, "New York"));
	        customers.add(new Person("Sam", 20, "Boston"));
	        
	        List<Person> filteredCustomers = customers.stream()
	                .filter(person -> person.getAge() > 18) // Filter adults
	                .filter(person -> !person.getCity().equalsIgnoreCase("New York")) // Filter city
	                .collect(Collectors.toList());
	        
	        
	        filteredCustomers.forEach(System.out::println);
	}

}

