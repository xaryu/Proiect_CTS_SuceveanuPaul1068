package classes;

public class Hospital {
	private String name;
	private int capacity;
	private static Hospital singleton = null;
	
	private Hospital(String name, int capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
	}
	

	public int getCapacity() {
		return capacity;
	}
	
	public String getName() {
		return name;
	}

	public static Hospital getHospital(String name, int capacity) {
		if(singleton == null) {
			singleton = new Hospital(name, capacity);
		}
		return singleton;
	}
	

	@Override
	public String toString() {
		return "The hospital named " + name + " has a capacity of " + capacity + " rooms";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacity;
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
		Hospital other = (Hospital) obj;
		if (capacity != other.capacity)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
