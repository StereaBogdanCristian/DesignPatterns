package Singleton;



public class ClassMain {
	
	public static void main(String[] args) {
		
		User u1 = new User("AAA", 10, "aaa@mail.com");
		User u2 = new User("BBB", 15, "bbb@mail.com");
		User u3 = new User("CCC", 20, "ccc@mail.com");
		
		//Obtinerea instantei
		JdbcSingleton jdbcSingleton = JdbcSingleton.getInstance();
		
		//Scriere useri
		jdbcSingleton.write(u1);
		jdbcSingleton.write(u2);
		jdbcSingleton.write(u3);
		
		//Afisarea tuturor inregistrarilor din tabel
		jdbcSingleton.listAllRecords();
		
		
		//Modificare user + citire si afisare user updatat
		User u3Update = new User("CCCUpdate", 20, "ccc@mail.com");
		jdbcSingleton.update("CCC", u3Update);
		
		User userDB = jdbcSingleton.read("CCCUpdate");
		System.out.println("Citire user updatat: " + userDB);
		
	}

}
