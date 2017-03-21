package Factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class FileWriteReadUser implements WriteReadUser {
	
	//Pt a putea salva mai multi useri, la serializare se utilizeaza o lista ce contine fiecare user.
	List<User> users = new LinkedList<>();
	
	//Mecanism salvare user: se citeste lista cu useri salvati anterior, apoi se adauga noul user,
	//se salveaza lista updatata, ce include si noul user.
	@SuppressWarnings("unchecked")
	public void readList() {
			
		ObjectInputStream ois;
		
		try {
			FileInputStream fis = new FileInputStream("C:\\EclipseWorkspace\\DesignPatterns\\Users.save");
			ois = new ObjectInputStream(fis);
			users = (LinkedList<User>)ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			System.out.println("Nu au existat useri salvati anterior. S-a creat fisierul in care sunt salvati useri.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			
	}

	
	@Override
	public void write(User user) {
		
		readList();
		
		users.add(user);
		
		ObjectOutputStream oos;
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\EclipseWorkspace\\DesignPatterns\\Users.save");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(users);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//Mecanism citire user: se citeste intreaga lista de useri, dupa care se cauta userul indicat prin nume
	@Override
	public User read(String name) {
		
		readList();
		
		User userFromList = null;
		
		for (User user : users) {
			if (user.getName().equalsIgnoreCase(name)) {
				userFromList = user;
			}
		}
		return userFromList;
	}

	//Mecanism update: se identifica indexul userului salvat (este diferit de user.id)
	// se inlocuieste userul pe baza indexului, se salveaza lista in fisier.
	@Override
	public void update(String name, User user) {
		
		readList();
		
		ListIterator<User> iterator = users.listIterator();
		int position = -1;
		
		while (iterator.hasNext()) {
			if (iterator.next().name.equals(name)) {
				position = iterator.nextIndex() - 1;
				break;
			}
		}
		
		if (position > 0) {
			users.set(position, user);
		} else {
			System.out.println("Update neefectuat! Userul nu a fost gasit!");
		}
		
		ObjectOutputStream oos;
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\EclipseWorkspace\\DesignPatterns\\Users.save");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(users);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}


	@Override
	public void listAllRecords() {

		for (User user : users) {
			System.out.println(user);
		}
	}

}
