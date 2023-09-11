package abstractDesignPattern;

public class Manager implements Employee{

	@Override
	public int salary() {
		return 20000;
	}

	@Override
	public String name() {
		return "Manager";
	}
	
}
