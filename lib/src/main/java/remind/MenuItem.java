package remind;

import java.util.Objects;

public class MenuItem {

	private final String name;
	private final int price;

	public MenuItem(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public boolean matches(String name) {
		return this.name == name;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
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
		MenuItem other = (MenuItem) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}


	
	
	
	

}
