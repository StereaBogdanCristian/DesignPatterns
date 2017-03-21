package BuilderExample2;

public class ClassMain {

	public static void main(String[] args) {
		
		OrderdListBuilder olBuilder = new OrderdListBuilder();
		
		olBuilder.addItem(new PizzaQuattroStagioniLarge());
		olBuilder.addItem(new PizzaTunaSmall());
		olBuilder.addItem(new ColaSmall());
		olBuilder.addItem(new FantaLarge());
		
		olBuilder.showItems();
		System.out.println("Total cost= " + olBuilder.getCost());
	}
}
