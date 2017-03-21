package BuilderExample2;

public class ColaSmall extends Drink {

	@Override
	public String name() {
		return "Cola";
	}

	@Override
	public String size() {
		return "Small";
	}

	@Override
	public int price() {
		return 8;
	}

}
