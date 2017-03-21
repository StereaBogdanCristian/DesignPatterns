package BuilderExample2;

public class PizzaTunaLarge extends Food {

	@Override
	public String name() {
		return "PizzaTuna";
	}

	@Override
	public String size() {
		return "Large";
	}

	@Override
	public int price() {
		return 27;
	}

}
