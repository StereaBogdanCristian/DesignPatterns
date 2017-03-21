package BuilderExample2;

public class PizzaQuattroStagioniSmall extends Food {

	@Override
	public String name() {
		return "QuattroStagioni";
	}

	@Override
	public String size() {
		return "Small";
	}

	@Override
	public int price() {
		return 18;
	}

}
