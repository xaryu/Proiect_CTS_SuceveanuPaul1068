package interfaces;

import classes.Reservation;
import classes.Pacient;
import classes.EmailReservation;

public interface INewsletter {
	void notify(String message);
	void removeObserver(Pacient client);
	void addObserver(Pacient client);
}
