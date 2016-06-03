package classes;

import interfaces.IPacient;

public class Pacient implements IPacient {
	public String name;
	private String allergies;
	public int age;
	
	public Pacient(String name, int age) {
		super();
		this.name = name;
		if(age<0)
			throw new UnsupportedOperationException("Age can't be a negative value");
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Pacient's name is " + name + " and he is " + age + " yo.";
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void update(String message) {
		System.out.println(message);
	}
	
	public void orderFood(Food food) {
		System.out.println("The pacient wants to order " + food.getName() + ".");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Pacient other = (Pacient) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}