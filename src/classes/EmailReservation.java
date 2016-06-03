package classes;

import java.sql.Date;

import interfaces.IRequestReservation;

public class EmailReservation implements IRequestReservation {
	public String numberOfDays;
	public String emailAddr;
	public Date date;
	
	public String addedToNewsletter() {
		return "The email has been added to the newsletter" + "sending you monthly mails";
	}
	
	public String type() {
		return "Email";
	}

	public void reserve() {
		System.out.println("Email Res Chosen");
		System.out.println("You will recieve a confirmation email");
	}

	@Override
	public String toString() {
		return "EmailReservation [emailAddr=" + emailAddr + ", numberOfDays=" + numberOfDays + "]";
	}
	
	public boolean hasDiscountCard() {
		return true;
	}
}