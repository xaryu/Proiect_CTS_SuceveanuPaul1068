package classes;

import java.util.ArrayList;

import abstractClasses.AMenu;

public class FoodMenu extends AMenu {
	private String type;
	private ArrayList<AMenu> menuList = new ArrayList<>();
	public boolean withoutSalt;
	
	public FoodMenu(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void add(AMenu food) {
		menuList.add(food);
	}
	
	public ArrayList<AMenu> getMenulist() {
		return menuList;
	}
	
	public void remove(AMenu food) {
		menuList.remove(food);
	}
	
	public AMenu getChild(int i) {
		return menuList.get(i);
	}
	
	@Override
	public void description() {
		if(menuList.size() == 0)
			throw new UnsupportedOperationException("Empty menu!");
		System.out.println(type + ":");
		
		for(AMenu meniu: menuList) {
			meniu.description();
		}
	}


	@Override
	public String toString() {
		return "FoodMenu [type=" + type + ", menuList=" + menuList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((menuList == null) ? 0 : menuList.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		FoodMenu other = (FoodMenu) obj;
		if (menuList == null) {
			if (other.menuList != null)
				return false;
		} else if (!menuList.equals(other.menuList))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
}