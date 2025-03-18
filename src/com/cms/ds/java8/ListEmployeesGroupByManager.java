package com.cms.ds.java8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {

	public Employee(String name, String managerName) {
		super();
		this.name = name;
		this.managerName = managerName;
	}

	private String name;
	private String managerName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", managerName=" + managerName + "]";
	}
}

public class ListEmployeesGroupByManager {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("Vijay", "Bob"), new Employee("Bob", "John"),
				new Employee("Krishna", "Bob"), new Employee("Laxman", "John"));

		// 1.a Bob->[Vijay, Krishna], John->[Bob, Laxman]
		Map<String, List<Employee>> employeesGroupedByManager = employees.stream()
				.collect(Collectors.groupingBy(Employee::getManagerName, Collectors.toList()));

		Map<String, List<String>> employeeNamesGroupedByManager = new HashMap<>();
		for (Map.Entry<String, List<Employee>> eachEntry : employeesGroupedByManager.entrySet()) {
			List<String> employeeNames = new ArrayList<>();
			for (Employee eachEmployee : eachEntry.getValue()) {
				employeeNames.add(eachEmployee.getName());
			}
			employeeNamesGroupedByManager.put(eachEntry.getKey(), employeeNames);
		}

		System.out.println(
				"1.a) ListEmployeesGroupByManager.main()...employeeNamesGroupedByManager:" + employeeNamesGroupedByManager);

		// 1.b Bob -> 2, John -> 4
		Map<String, Long> employeeCountGroupedByManager = employees.stream()
				.collect(Collectors.groupingBy(Employee::getManagerName, Collectors.counting()));

		for (Map.Entry<String, List<Employee>> eachManagerEntry : employeesGroupedByManager.entrySet()) {
			String managerName = eachManagerEntry.getKey();
			List<Employee> reportees = eachManagerEntry.getValue();
			employeeCountGroupedByManager = countAllReportees(managerName, reportees, employees,
					employeeCountGroupedByManager);
		}

		System.out.println("1.b) ListEmployeesGroupByManager.main()...FINAL employeeCountGroupedByManager:"
				+ employeeCountGroupedByManager);

	}

	static Map<String, Long> countAllReportees(String maangerName, List<Employee> reportees, List<Employee> employees,
			Map<String, Long> employeeCountGroupedByManager) {
		for (Employee eachReportee : reportees) {
			long indirectReportees = findIndirectReportees(eachReportee.getName(), employees);
			if (indirectReportees > 0) {
				// System.out.println(eachEmployee.getName() + "->" + indirectEmployees);
				employeeCountGroupedByManager.put(maangerName,
						employeeCountGroupedByManager.getOrDefault(maangerName, 0L) + indirectReportees);
			}
		}
		return employeeCountGroupedByManager;
	}

	private static long findIndirectReportees(String eachReporteeName, List<Employee> employees) {
		long count = 0;
		for (Employee eachEmployee : employees) {
			if (eachReporteeName.equalsIgnoreCase((eachEmployee).getManagerName())) {
				count++;
			}
		}
		return count;
	}
}
