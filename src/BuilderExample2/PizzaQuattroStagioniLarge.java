package BuilderExample2;

public class PizzaQuattroStagioniLarge extends Food{

	@Override
	public String name() {
		return "PizzaQuattroStagioni";
	}

	@Override
	public String size() {
		return "Large";
	}

	@Override
	public int price() {
		return 25;
	}

}
