package interfaces;

import classes.EmailReservation;
import classes.Reservation;
import classes.Newsletter;

public interface IReservationBuilder {
	public Reservation build();
}