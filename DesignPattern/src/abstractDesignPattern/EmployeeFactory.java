package abstractDesignPattern;

public class EmployeeFactory {
	
	public static Employee getEmployee(EmployeeAbstractFactory empAbstractFactory) {
		return empAbstractFactory.createEmployee();
	}
}
