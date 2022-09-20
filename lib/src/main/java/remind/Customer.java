package remind;

public class Customer {


	public void order(String name, Menu menu, Cooking cooking) {
		MenuItem menuItem = menu.choose(name);
		
		cooking.makeCook(menuItem);
//		
//		cooking.makeCook(menu);
		
	}

	public String pay(String name, int price, Menu menu, Cooking cooking) {
		MenuItem menuItem = menu.choose(name);
		
		
		return cooking.makePayment(price, menuItem);
	}

}
