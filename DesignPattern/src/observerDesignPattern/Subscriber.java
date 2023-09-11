package observerDesignPattern;

public class Subscriber implements Observer {
	String name;
	
	Subscriber(String name){
		this.name = name;
	}
	@Override
	public void getNotified(String videoTitle) {
		System.out.println(name + " A new video has been uploaded: " + videoTitle);
	}
	
}
