package classes;

import interfaces.IRequestReservation;

public class phoneReservation implements IRequestReservation {
	
	public String type() {
		return "telephone";
	}
	
	@Override
	public void reserve() {
		System.out.println("The reservation has been made through the telephone");
	}
	
	public boolean hasDiscountCard() {
		return true;
	}
}