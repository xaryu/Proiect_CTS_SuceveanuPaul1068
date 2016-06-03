package classes;

public class Food extends abstractClasses.AMenu {
	private int quantity;
	private String name;
	public int expirationDate;
	private int price;
	
	public int getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public String getName() {
		return name;
	}
	
	public Food(String name, int quantity, int price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	@Override
	public void description() {
		System.out.println("- " + name + " : " + quantity + " g/ml.");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + quantity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}
	
	
}