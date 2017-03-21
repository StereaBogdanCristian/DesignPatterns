package BuilderExample2;

public class FantaSmall extends Drink {

	@Override
	public String name() {
		return "Fanta";
	}

	@Override
	public String size() {
		return "Small";
	}

	@Override
	public int price() {
		return 7;
	}

}
