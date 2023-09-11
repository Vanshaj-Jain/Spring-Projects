package builderDesignPattern;

public class Client {
	public static void main(String[] args) {
		User user = new User.UserBuilder()//This is method Chaining and also a way of calling a static class which is made inside an outer class
					.setUserName("Vanshaj")
					.setUserId("5807055")
					.setUserEmail("vanshajjain2598@gmail.com")
					.build();
		System.out.println(user);
		
		User user1 = new User.UserBuilder()
					 .setUserName("Ramu")
					 .setUserId("76788")
					 .setUserEmail("Ramu@gmail.com")
					 .build();
		System.out.println(user1);
	}
}
