package com.cms.ds.java8;

class Employee {
	private String name;
	private double salary;
	private String department; // Example of another field

	public Employee(String name, double salary, String department) {
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", salary=" + salary + ", department='" + department + '\'' + '}';
	}
}
