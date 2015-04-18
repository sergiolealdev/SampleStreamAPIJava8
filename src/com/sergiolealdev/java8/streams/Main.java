package com.sergiolealdev.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.sergiolealdev.java8.streams.beans.Employee;

public class Main {

	public static void main(String[] args) {
		List<Employee> listEmployees = getEmployees();
		

		//We want all items that start with T
		listEmployees
	    .stream()
	    .filter(e -> e.getName().startsWith("T"))
	    .forEach(e -> System.out.println(e.getName())); 
		
		//But at the end, the employees list remains intact
		System.out.println(listEmployees.size());
		
		
		//FILTERING
		Stream<Employee> streamEmployees = listEmployees.stream();
		Stream <Employee> employeesFiltered = streamEmployees.filter(e -> e.getName().contains("Attitude"));
		employeesFiltered.forEach(s -> System.out.println(s.getName()));
		
		//employeesFiltered cannot be used again!!!! Throws exception
		employeesFiltered.forEach(s -> System.out.println(s));

	}

	private static List<Employee> getEmployees() {
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		Employee employee4 = new Employee();

		employee1.setName("John \"Hannibal\" Smith");
		employee1.setAge(62);
		employee1.setPosition("Master of Disguise");
		
		employee2.setName("Templeton Peck");
		employee2.setAge(44);
		employee2.setPosition("Master of the Persuasive Arts");
		
		employee3.setName(" H.M. \"Howling Mad\" Murdock");
		employee2.setAge(39);
		employee2.setPosition("The A-Team's pilot");
				
		employee4.setName("\"Bad Attitude\", Baracus");
		employee4.setAge(41);
		employee4.setPosition("The muscle for the A-Team");
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		
		return list;
	}

}
