package BuilderExample2;

import java.util.ArrayList;
import java.util.List;

public class OrderdListBuilder {

	List<Item> items = new ArrayList<Item>();
	
	public void addItem (Item item) {
		items.add(item);
	}
	
	public int getCost () {
		int cost=0;
		for (Item item : items) {
			cost+=item.price();
		}
		return cost;
	}
	
	public void showItems() {
		for (Item item : items) {
			System.out.println("ITEM: " + item.name() + ",     SIZE: " 
								+ item.size() + ",       PRICE: " + item.price());
		}
	}
}
