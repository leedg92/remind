package remind;

public class Cooking {

	public Cook makeCook(MenuItem menuItem) {
		
		Cook cook = new Cook(menuItem);
		
		return cook;
		

		
	}

	public String makePayment(int price, MenuItem menuItem) {
				
		
		if(menuItem.getPrice() == price) {
			System.out.println("결제 되었습니다.");
			return "결제 되었습니다.";
		}else {
			System.out.println("결제 실패(금액이 다릅니다)");
			return "결제 실패(금액이 다릅니다)";
		}
		
//		return menuItem.getPrice() == price;
		
	}

}
