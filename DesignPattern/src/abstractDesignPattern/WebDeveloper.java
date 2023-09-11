package abstractDesignPattern;

public class WebDeveloper implements Employee{

	@Override
	public int salary() {
		return 5000;
	}

	@Override
	public String name() {
		return "Web Developer";
	}

}
