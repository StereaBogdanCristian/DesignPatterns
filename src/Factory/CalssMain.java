package Factory;

public class CalssMain {

	public static void main(String[] args) {
		
		
		//Alegerea mecanismului de salvare in fisier (serializare)
		WriteReadUser writeReadUserFile = FactoryWriteReadUser.chooseMethod("FILE");
		
		
		//Alegerea mecanismului de salvare in DB
		WriteReadUser DBReadUserFile = FactoryWriteReadUser.chooseMethod("DB");
		
		
		
		
		//Operatii de test cu cele doua variante:
		
		User u1 = new User(1, "AAA", 10, "aaa@mail.com");
		User u2 = new User(2, "BBB", 15, "bbb@mail.com");
		User u3 = new User(3, "CCC", 20, "ccc@mail.com");
		User u4 = new User(4, "DDD", 25, "ddd@mail.com");
		
		//Scriere in fisier
		writeReadUserFile.write(u1);
		writeReadUserFile.write(u2);
		writeReadUserFile.write(u3);
		writeReadUserFile.write(u4);
		
		writeReadUserFile.listAllRecords();
		
		//Citire din fisier
		User uRead = writeReadUserFile.read("AAA");
		System.out.println("Citire user AAA " + uRead);
		
		//Update user in fisier
		User u3Update = new User(3, "CCCUpdate", 20, "ccc@mail.com");
		writeReadUserFile.update("CCC", u3Update);
		User uUpdateRead = writeReadUserFile.read("CCCUpdate");
		System.out.println("Citire user update " + uUpdateRead);
		
	
		
		//Citirea unui user din DB
		User userDB = DBReadUserFile.read("AAA");
		System.out.println(userDB);
		
		//Scrierea unui user in DB
		User u3DB = new User(3, "CCC", 20, "ccc@mail.com");
		DBReadUserFile.write(u3DB);
		
		//Update user in DB
		User u3UpdateDB = new User(3, "CCC", 20, "cccUPDATE@mail.com");
		DBReadUserFile.update("CCC", u3UpdateDB);
		
		DBReadUserFile.listAllRecords();
	}
}
