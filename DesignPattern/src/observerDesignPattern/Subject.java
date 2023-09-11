package observerDesignPattern;

interface Subject {
	
	public void subscribe(Observer ob);
	public void unsubscribe(Observer ob);
	public void newVideoAdded(String videoTitle);
	
}
