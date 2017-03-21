package BuilderExample2;

public class ColaLarge extends Drink{

	@Override
	public String name() {
		return "Cola";
	}

	@Override
	public String size() {
		return "Large";
	}

	@Override
	public int price() {
		return 13;
	}

}
