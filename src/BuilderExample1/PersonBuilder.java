package BuilderExample1;

public class PersonBuilder {
	
	String name;

	int weight;
	int height;
	int age;
	
	
	public PersonBuilder() {
	}
	
	public PersonBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	public PersonBuilder weight(int weight) {
		this.weight = weight;
		return this;
	}
	
	public PersonBuilder height(int height) {
		this.height = height;
		return this;
	}

	public PersonBuilder age(int age) {
		this.age = age;
		return this;
	}
	
	public Person build() {
		return new Person(this);
	}
	
}
