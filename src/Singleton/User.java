package Singleton;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	String name;
	int age;
	String mail;
	
	
	public User(String name, int age, String mail) {
		this.name = name;
		this.age = age;
		this.mail = mail;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String toString () {
		return "name=" + name + ", age=" + age + ", email=" + mail;
	}
	
}
