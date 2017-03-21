package BuilderExample1;

public class CalssMain {
	
	public static void main(String[] args) {
		PersonBuilder pb = new PersonBuilder();
		Person robert = pb.name("Robert").age(22).weight(75).height(190).build();
		
		System.out.println(robert);
	}

}
