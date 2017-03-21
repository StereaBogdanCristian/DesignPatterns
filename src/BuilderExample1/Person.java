package BuilderExample1;

public class Person {
	
	private String name; 
	private int weight;
	private int height;
	private int age;
	
	
	public Person(PersonBuilder builder) {
		name = builder.name;
		weight = builder.weight;
		height = builder.height;
		age = builder.age;
	}


	public String getName() {
		return name;
	}


	public int getWeight() {
		return weight;
	}


	public int getHeight() {
		return height;
	}


	public int getAge() {
		return age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", weight=" + weight + ", height=" + height + ", age=" + age + "]";
	}
	
	

}
