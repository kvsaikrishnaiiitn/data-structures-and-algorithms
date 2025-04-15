package com.cms.ds.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeStreamOperations {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Alice", 60000, "HR"));
		employeeList.add(new Employee("Bob", 75000, "Engineering"));
		employeeList.add(new Employee("Charlie", 90000, "Engineering"));
		employeeList.add(new Employee("David", 55000, "Marketing"));
		employeeList.add(new Employee("Eve", 80000, "Sales"));
		employeeList.add(new Employee("Frank", 60000, "HR")); // Same salary as Alice

		// 1. Print all employee names whose salary is greater than the average salary
		OptionalDouble averageSalaryOptional = employeeList.stream().mapToDouble(Employee::getSalary).average();
		if (averageSalaryOptional.isPresent()) {
			Double averageSalary = averageSalaryOptional.getAsDouble();
			employeeList.stream().filter(e -> e.getSalary() > averageSalary).map(Employee::getName)
					.collect(Collectors.toList()).forEach(System.out::println);
		}

		// 2. Print all employee details with Map<employeeId,employeeName>
		Map<String, Double> detailsMap = employeeList.stream()
				.collect(Collectors.toMap(Employee::getName, Employee::getSalary));
		System.out.println(detailsMap);

		// 3. Get the highest salary employee by department wise using Java8 Stream
		Map<String, Optional<Employee>> departmentWiseHighestSalaryEmployee = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
		// System.out.println(departmentWiseHighestSalaryEmployee);

		departmentWiseHighestSalaryEmployee.forEach((department, highestSalaryEmployeeOptional) -> {
			System.out.println("Department:" + department);
			if (highestSalaryEmployeeOptional.isPresent()) {
				System.out.println("Highest Salary Employee:" + highestSalaryEmployeeOptional.get());
			}
		});

		// 4. Frequency count of characters in the String
		String string = "aabbbccdddee";
		Map<Character, Long> frequencyMap = string.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		frequencyMap.entrySet().forEach(System.out::println);

	}

}
