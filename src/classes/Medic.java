package classes;

import java.util.ArrayList;

public class Medic {
	private String name;
	private String yearsOfExperience;
	private String speciality;
	
	public Medic(String name, String speciality) {
		super();
		this.name = name;
		this.speciality = speciality;
	}
	
	public int totalPayment(ArrayList<Food> fd) {
		int total = 0;
		for(Food al:fd){
			total = total + al.getPrice();
		}
		return total;
	}
	
	public void insertPreferences(Pacient pacient, Food food, ArrayList<Food> fd) {
		fd.add(food);
		System.out.println("The medic " + name + ", specialized in " + speciality + 
				" recommanded a special menu for the pacient with the following info: " + pacient.toString());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((speciality == null) ? 0 : speciality.hashCode());
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
		Medic other = (Medic) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (speciality == null) {
			if (other.speciality != null)
				return false;
		} else if (!speciality.equals(other.speciality))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Medic [name=" + name + ", speciality=" + speciality + "]";
	}
	
	
}
