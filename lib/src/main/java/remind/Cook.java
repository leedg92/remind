package remind;

import java.util.Objects;

public class Cook {

	private final String name;
	private final int price;


	public Cook(String name, int price) {
		this.name = name;
		this.price = price;
				
	}


	public Cook(MenuItem menuItem) {
		this.name = menuItem.getName();
		this.price = menuItem.getPrice();
	}


	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cook other = (Cook) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}




	
	
}
