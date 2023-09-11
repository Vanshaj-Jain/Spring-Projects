package builderDesignPattern;

public class User {
	private final String userId;
	private final String userName;
	private final String userEmail;
	public String getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	
	public User(UserBuilder builder){
		this.userId = builder.userId;
		this.userName = builder.userName;
		this.userEmail = builder.userEmail;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + "]";
	}

	static class UserBuilder{//Example of a static class build inside an outer class

		private String userId;
		private String userName;
		private String userEmail;
		public UserBuilder setUserId(String userId) {
			this.userId = userId;
			return this;
		}
		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}
		public UserBuilder setUserEmail(String userEmail) {
			this.userEmail = userEmail;
			return this;
		}
		
		public User build() {
			User user = new User(this);
			return user;
		}
	}
}
