package Entities;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		
	}
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setSalaryIncrease(double increase) {
		this.salary += increase / 100 * this.salary;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	@Override
	public String toString() {
		return id + ", " + name + ", " + salary;
	}
	

}
