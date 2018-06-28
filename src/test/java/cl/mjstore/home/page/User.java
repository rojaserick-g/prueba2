package cl.mjstore.home.page;

public class User {
	private String username;
	  private String password;
	  
	  public String getUsername() {
		  return username;
	  }
	  
	  public String getPassword() {
		  return password;
	  }
	  
	  @Override
	  public String toString() {
		  return String.format("My user name is %s, but my pass is secret...", this.username);
	  }
}
