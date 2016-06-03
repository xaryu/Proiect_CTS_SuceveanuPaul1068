package classes;

import java.util.ArrayList;

import interfaces.INewsletter;

public class Newsletter implements INewsletter {
	private boolean isUnsubscribed;
	private String sentMonth;
	
	ArrayList<Pacient> followers = new ArrayList<>();
	
	public Newsletter(String sentMonth) {
		super();
		this.sentMonth = sentMonth;
	}

	@Override
	public void addObserver(Pacient pacient) {
		followers.add(pacient);
	}
	
	public String getMonth() {
		return sentMonth;
	}

	@Override
	public void removeObserver(Pacient pacient) {
		followers.remove(pacient);
	}

	
	@Override
	public String toString() {
		return "Sent newsletter for the month: " + sentMonth + "!";
	}

	@Override
	public void notify(String message) {
		if(followers.size() == 0) 
			throw new UnsupportedOperationException("No followers, can't send message!");
		for(Pacient pac : followers) {
			pac.update(message);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((followers == null) ? 0 : followers.hashCode());
		result = prime * result + ((sentMonth == null) ? 0 : sentMonth.hashCode());
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
		Newsletter other = (Newsletter) obj;
		if (followers == null) {
			if (other.followers != null)
				return false;
		} else if (!followers.equals(other.followers))
			return false;
		if (sentMonth == null) {
			if (other.sentMonth != null)
				return false;
		} else if (!sentMonth.equals(other.sentMonth))
			return false;
		return true;
	}
}