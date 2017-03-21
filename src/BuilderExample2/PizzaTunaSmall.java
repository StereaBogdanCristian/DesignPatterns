package BuilderExample2;

public class PizzaTunaSmall extends Food {

	@Override
	public String name() {
		return "PizzaTuna";
	}

	@Override
	public String size() {
		return "Small";
	}

	@Override
	public int price() {
		return 15;
	}

}
