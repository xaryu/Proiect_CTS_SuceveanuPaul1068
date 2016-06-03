package classes;

import abstractClasses.AConfirmDiscount;

public class FinancialDirector extends AConfirmDiscount {
	private String name;
	private int salary;
	private String job;
	private String attributions;
	
	public FinancialDirector(String name, int salary, String job) {
		super();
		this.name = name;
		this.salary = salary;
		this.job = job;
	}
	
	@Override
	public void checkDiscount(int discount) {
		if(discount <= 15) {
			if(discount >= 0) {
				System.out.println("The Financial Director named " + name + " accepted an extra discount of " + discount + ", for the pacient who could not afford the treatment.");
			} else {
				throw new UnsupportedOperationException("Invalid discount");
			}
		} else {
			System.out.println("Passing discount to manager");
			succesor.checkDiscount(discount);
		}
	}
	
	public String getJob() {
		return job;
	}

	public int getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((job == null) ? 0 : job.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
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
		FinancialDirector other = (FinancialDirector) obj;
		if (job == null) {
			if (other.job != null)
				return false;
		} else if (!job.equals(other.job))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	

	
}