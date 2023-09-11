package observerDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
	public static void main(String[] args) throws IOException{
		YoutubeChannel channel = new YoutubeChannel();
		/*Subscriber s1 = new Subscriber("Vanshaj");
		Subscriber s2 = new Subscriber("Ramu");
		channel.subscribe(s1);
		channel.subscribe(s2);
		channel.newVideoAdded();*/
		BufferedReader y = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Enter 1 to subscribe");
			System.out.println("Enter 2 to unsubscribe");
			System.out.println("Enter 3 to add a new video");
			int a = Integer.parseInt(y.readLine());
			if(a==1) {
				System.out.println("Enter name to be Subscribed");
				String name = y.readLine();
				Subscriber s3 = new Subscriber(name);
				channel.subscribe(s3);
			}
			else if(a==2) {
				System.out.println("Enter Name to be unsubscribed");
				String name = y.readLine();
				Subscriber s3 = new Subscriber(name);
				channel.unsubscribe(s3);
			}
			else if(a==3) {
				System.out.println("Add title of the video");
				String videoTitle = y.readLine();
				channel.newVideoAdded(videoTitle);
			}
			else {
				break;
			}
		}
	}
}
