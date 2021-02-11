package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class Program {

	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("How many employees will be registered? ");
		int count = sc.nextInt();
		
		List<Employee> emp = new ArrayList<Employee>();
		
		for(int i = 0; i < count; i++) {
			
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while(hasId(emp, id)) {
				System.out.println();
				System.out.println("Id already taken! Try again: ");
				System.out.print("Id: ");
				id = sc.nextInt();
			}
		
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
		
			Employee empVl = new Employee(id, name, salary);
			emp.add(empVl);	
		}
		
		
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		Employee item = emp.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		// Integer pos = findEmp(emp, id);
		
		
		
		if (item == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			item.setSalaryIncrease(percentage);
		}
		
		System.out.println();
		System.out.println("List of Brown: ");
		for (Employee x : emp ) {
			System.out.println(x);
		}
		
		
		sc.close();
	}
	
	public static Integer findEmp(List<Employee> list, int count) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == count) {
				return i;
			}
			
		}
		return null;
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee vl = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return vl != null;
	}
	
}
