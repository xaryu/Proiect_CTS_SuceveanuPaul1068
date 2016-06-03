package unit_testing;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import classes.Newsletter;
import classes.Pacient;


public class NewsletterTests {

	Newsletter newsletter = new Newsletter("June");
	Pacient pacient1 = new Pacient("Mihai", 29);
	Pacient pacient2 = new Pacient("Iene", 35);
	Pacient pacient3 = new Pacient("Mara", 44);
	Pacient pacient4 = new Pacient("Jonn", 34);
	Pacient pacient5 = new Pacient("Mihai", 33);
	ArrayList<Pacient> followers = new ArrayList<>();

	@Test
	public void testNewsletterMonth() {
		assertEquals("June", newsletter.getMonth());
	}
	
	@Test
	public void testNotifications() {
		try {
			newsletter.notify("Sent a newsletter for the month june");
			fail("Untreated case when the list is empty");
		} catch(UnsupportedOperationException ex) {
		}
	}
	
	@Test
	public void testAddFollowers() {
		followers.add(pacient1);
		followers.add(pacient2);
		assertEquals(2, followers.size());
	}
	
	
	
	public ArrayList<Pacient> getFollowers() {
		return followers;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Test
	public void testRemoveFollowers() {
		followers.add(pacient1);
		followers.add(pacient2);
		followers.add(pacient3);
		followers.remove(pacient2);
		assertEquals(2, followers.size());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public void setFollowers(ArrayList<Pacient> followers) {
		this.followers = followers;
	}

	public Newsletter getNewsletter() {
		return newsletter;
	}

	public void setNewsletter(Newsletter newsletter) {
		this.newsletter = newsletter;
	}

	public Pacient getPacient1() {
		return pacient1;
	}

	public void setPacient1(Pacient pacient1) {
		this.pacient1 = pacient1;
	}

	public Pacient getPacient2() {
		return pacient2;
	}

	public void setPacient2(Pacient pacient2) {
		this.pacient2 = pacient2;
	}

	public Pacient getPacient3() {
		return pacient3;
	}

	public void setPacient3(Pacient pacient3) {
		this.pacient3 = pacient3;
	}

	public Pacient getPacient4() {
		return pacient4;
	}

	public void setPacient4(Pacient pacient4) {
		this.pacient4 = pacient4;
	}

	public Pacient getPacient5() {
		return pacient5;
	}

	public void setPacient5(Pacient pacient5) {
		this.pacient5 = pacient5;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((followers == null) ? 0 : followers.hashCode());
		result = prime * result + ((newsletter == null) ? 0 : newsletter.hashCode());
		result = prime * result + ((pacient1 == null) ? 0 : pacient1.hashCode());
		result = prime * result + ((pacient2 == null) ? 0 : pacient2.hashCode());
		result = prime * result + ((pacient3 == null) ? 0 : pacient3.hashCode());
		result = prime * result + ((pacient4 == null) ? 0 : pacient4.hashCode());
		result = prime * result + ((pacient5 == null) ? 0 : pacient5.hashCode());
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
		NewsletterTests other = (NewsletterTests) obj;
		if (followers == null) {
			if (other.followers != null)
				return false;
		} else if (!followers.equals(other.followers))
			return false;
		if (newsletter == null) {
			if (other.newsletter != null)
				return false;
		} else if (!newsletter.equals(other.newsletter))
			return false;
		if (pacient1 == null) {
			if (other.pacient1 != null)
				return false;
		} else if (!pacient1.equals(other.pacient1))
			return false;
		if (pacient2 == null) {
			if (other.pacient2 != null)
				return false;
		} else if (!pacient2.equals(other.pacient2))
			return false;
		if (pacient3 == null) {
			if (other.pacient3 != null)
				return false;
		} else if (!pacient3.equals(other.pacient3))
			return false;
		if (pacient4 == null) {
			if (other.pacient4 != null)
				return false;
		} else if (!pacient4.equals(other.pacient4))
			return false;
		if (pacient5 == null) {
			if (other.pacient5 != null)
				return false;
		} else if (!pacient5.equals(other.pacient5))
			return false;
		return true;
	}
}