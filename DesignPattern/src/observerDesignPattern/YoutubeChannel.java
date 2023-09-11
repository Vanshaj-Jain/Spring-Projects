package observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{

	List<Observer> list = new ArrayList<>();
	@Override
	public void subscribe(Observer ob) {
		this.list.add(ob);
	}

	@Override
	public void unsubscribe(Observer ob) {
		this.list.remove(ob);
		System.out.println(ob + "unsubscribed sucessfully");
		System.out.println("Now list of subscribers" +list);
	}

	@Override
	public void newVideoAdded(String videoTitle) {
		for(Observer ob:list) {
			ob.getNotified(videoTitle);
		}
	}
	
}
