package com.res;

public class EmployeeDAO {
java.util.List<Employee> emps;
private static final java.util.Map<String ,Employee> empmap = new java.util.HashMap<String,Employee>();
static {
	init();
}
public static void init() {
    Employee emp1 = new Employee("E01", "Smith", "Clerk");
    Employee emp2 = new Employee("E02", "Allen", "Salesman");
    Employee emp3 = new Employee("E03", "Jones", "Manager");
    empmap.put(emp1.getEmpNo(), emp1);
    empmap.put(emp2.getEmpNo(), emp2);
    empmap.put(emp3.getEmpNo(), emp3);
}
public static Employee getEmployee(String empNo) {
	return empmap.get(empNo);
}
public static Employee addEmployee(Employee emp) {
	empmap.put(emp.getEmpNo(), emp);
	return emp;
}
public static Employee updateEmployee(Employee empNo) {
	return empmap.get(empNo);
}
public static void deleteEmployee(String empNo) {
	empmap.remove(empNo);
}
public static java.util.List<Employee> getAllEmployee(){
	java.util.Collection<Employee> c= empmap.values();
	java.util.List<Employee> list= new java.util.ArrayList<Employee>();
	list.addAll(c);
	return list;
	}

}
