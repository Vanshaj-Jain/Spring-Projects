package abstractDesignPattern;

public class Client {
	public static void main(String[] args) {
		Employee emp1 = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
		System.out.println(emp1.name());
		System.out.println(emp1.salary());
		Employee emp2 = EmployeeFactory.getEmployee(new WebDeveloperFactory());
		System.out.println(emp2.name());
		System.out.println(emp2.salary());
		Employee emp3 = EmployeeFactory.getEmployee(new ManagerFactory());
		System.out.println(emp3.name());
		System.out.println(emp3.salary());
	}
}
