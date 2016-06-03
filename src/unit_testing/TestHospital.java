package unit_testing;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Hospital;

public class TestHospital {
	Hospital hosp1 = Hospital.getHospital("Floreasca", 100);
	Hospital hosp2 = Hospital.getHospital("Colentina", 85);

	@Test
	public void testCapacity() {
		assertEquals(100, hosp1.getCapacity());
	}
	
	@Test
	public void testName() {
		assertEquals("Floreasca", hosp1.getName());
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Test
	public void testSingletonCapacitate() {
		assertEquals(hosp1.getCapacity(), hosp2.getCapacity());
	}
	
	@Test
	public void testSingletonName() {
		assertEquals(hosp1.getName(), hosp2.getName());
	}

	@Test
	public void testSingleton() {
		assertSame(hosp1, hosp2);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}