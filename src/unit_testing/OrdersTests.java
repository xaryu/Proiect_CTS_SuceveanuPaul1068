package unit_testing;

import static org.junit.Assert.*;

import classes.Food;
import classes.Medic;
import classes.Pacient;
import java.util.ArrayList;
import org.junit.Test;

public class OrdersTests {
	Food coffee = new Food("coffee", 300, 3);
	Pacient pacient = new Pacient("Mirel", 25);
	Pacient pacient2 = new Pacient("Ionel", 16);
	Medic medic = new Medic("Mihaita", "ortopedie");
	Medic medic2 = new Medic("Buhlea", "orl");
	static ArrayList<Food> ALfood = new ArrayList<Food>();
	
	@Test
	public void testTotalQuantity() {
		assertEquals(300, coffee.getQuantity());
	}
	
	@Test
	public void testFoodName() {
		assertEquals("coffee", coffee.getName());
	}
	
	@Test
	public void testFoodPrice() {
		System.out.println("Testing food price");
		assertEquals(3, coffee.getPrice());
	}
	
	@Test
	public void testTotalPayment() {
		System.out.println("Entering total payment test...");
		medic.insertPreferences(pacient, coffee, ALfood);
		medic.insertPreferences(pacient, new Food("water", 600, 4), ALfood);
		medic.insertPreferences(pacient, new Food("soup", 400, 6), ALfood);
		medic.insertPreferences(pacient, new Food("desert", 450, 9), ALfood);
		System.out.println("Testing total payment price");
		assertEquals(44, medic.totalPayment(ALfood));
	}
	
	@Test 
	public void testTotalPaymentCrossCheck() {
		assertEquals(4+6+9+3, medic.totalPayment(ALfood));
	}
	
	@Test
	public void testCoffeePrice() {
		System.out.println("Testing coffee price");
		assertEquals(26, medic.totalPayment(ALfood) - 6 - 9 - 3);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coffee == null) ? 0 : coffee.hashCode());
		result = prime * result + ((medic == null) ? 0 : medic.hashCode());
		result = prime * result + ((medic2 == null) ? 0 : medic2.hashCode());
		result = prime * result + ((pacient == null) ? 0 : pacient.hashCode());
		result = prime * result + ((pacient2 == null) ? 0 : pacient2.hashCode());
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
		OrdersTests other = (OrdersTests) obj;
		if (coffee == null) {
			if (other.coffee != null)
				return false;
		} else if (!coffee.equals(other.coffee))
			return false;
		if (medic == null) {
			if (other.medic != null)
				return false;
		} else if (!medic.equals(other.medic))
			return false;
		if (medic2 == null) {
			if (other.medic2 != null)
				return false;
		} else if (!medic2.equals(other.medic2))
			return false;
		if (pacient == null) {
			if (other.pacient != null)
				return false;
		} else if (!pacient.equals(other.pacient))
			return false;
		if (pacient2 == null) {
			if (other.pacient2 != null)
				return false;
		} else if (!pacient2.equals(other.pacient2))
			return false;
		return true;
	}

	@Test
	public void testArraySize() {
		assertEquals(4, ALfood.size());
	}

	public Pacient getPacient() {
		return pacient;
	}

	public void setPacient(Pacient pacient) {
		this.pacient = pacient;
	}

	public Pacient getPacient2() {
		return pacient2;
	}

	public void setPacient2(Pacient pacient2) {
		this.pacient2 = pacient2;
	}

	public Medic getMedic() {
		return medic;
	}

	public void setMedic(Medic medic) {
		this.medic = medic;
	}

	public Medic getMedic2() {
		return medic2;
	}

	public void setMedic2(Medic medic2) {
		this.medic2 = medic2;
	}
}