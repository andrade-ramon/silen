package user;

public class User {
	
	private long id;
	private String name;
	private String login;
	private String password;
	
	public User(long id, String name, String login){
		this.id = id;
		this.name = name;
		this.login = login;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLogin() {
		return login;
	}
}
