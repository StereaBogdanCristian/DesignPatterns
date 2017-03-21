package BuilderExample2;

public class FantaLarge extends Drink {

	@Override
	public String name() {
		return "Fanta";
	}

	@Override
	public String size() {
		return "Large";
	}

	@Override
	public int price() {
		return 12;
	}

}
