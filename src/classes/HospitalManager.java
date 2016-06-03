package classes;

import abstractClasses.AConfirmDiscount;

public class HospitalManager extends AConfirmDiscount {
	private String name;
	private int salary;
	public int yearsOfExperience;
	private String speciality;
	
	public HospitalManager(String name, int salary, String speciality) {
		super();
		this.name = name;
		this.salary = salary;
		this.speciality = speciality;
	}

	@Override
	public void checkDiscount(int discount) {
		System.out.println("CHECKING DISCOUNT...");
		if(discount <= 60) {
			System.out.println("The discount of " + discount + "% for persons with social problems was granted by the mananger " + name);
		} else if(discount > 90) {
				System.out.println("You can't grant a discount larger than 90%");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
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
		HospitalManager other = (HospitalManager) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
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
		return "HospitalManager [name=" + name + ", salary=" + salary + ", speciality=" + speciality + "]";
	}
	
}