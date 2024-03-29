package java8;

import java.util.function.Supplier;

public class TestE {
public static void main(String[] args) {
	
	Supplier<Student> s = () -> new Student(2,"ajay",55.55);
	Student s1=s.get();
	System.out.println("Id is"+s1.id);
	System.out.println("Name is"+s1.name);
	System.out.println("Percentage is"+s1.percentage);
	
	
	Supplier<Integer> i = () -> 20;
	int val=i.get();
	System.out.println("Value is"+val);
	
	Supplier<String> sp= () ->"Good Evening";
	String v=sp.get();
	System.out.println("Value "+v);
	}
}
