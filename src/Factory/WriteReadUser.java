package Factory;

public interface WriteReadUser {

	public void write (User user);
	
	public User read (String name);
	
	public void update (String name, User user);
	
	public void listAllRecords ();
	
}
