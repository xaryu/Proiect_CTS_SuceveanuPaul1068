package classes;

import interfaces.IRequestReservation;
import interfaces.IReservationBuilder;

public class ReservationBuilder implements IReservationBuilder {
	private IRequestReservation requestReservationType;
	private int period;
	private Pacient pacient;
	private int discount;
	private int roomsNumber;

	public ReservationBuilder() {
		super();
		this.requestReservationType = new EmailReservation();
		this.pacient = new Pacient("Pacient", 0);
		this.period = 1;
		this.roomsNumber = 1;
		this.discount = 0;
	}
	
	public ReservationBuilder setRequestReservationType(IRequestReservation requestReservationType) {
		this.requestReservationType = requestReservationType;
		return this;
	}

	public ReservationBuilder setPeriod(int period) {
		if(roomsNumber < 1)
			throw new UnsupportedOperationException("Reservation can be done for at least a day");
		this.period = period;
		return this;
	}
	
	public ReservationBuilder setPacient(Pacient pacient) {
		this.pacient = pacient;
		System.out.println("SetPacient");
		return this;
	}

	public ReservationBuilder setDiscount(int discount) {
		if(discount < 0)
			throw new UnsupportedOperationException("Non negative discount values!");
		this.discount = discount;
		System.out.println("DiscountSet");
		return this;
	}
	
	public ReservationBuilder setRoomsNumber(int roomsNumber) {
		if(roomsNumber < 1)
			throw new UnsupportedOperationException("At least 1 room!");
		this.roomsNumber = roomsNumber;
		System.out.println("RoomsSet");
		return this;
	}

	@Override
	public Reservation build() {
		return new Reservation(requestReservationType, pacient, period, roomsNumber, discount);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + discount;
		result = prime * result + ((pacient == null) ? 0 : pacient.hashCode());
		result = prime * result + period;
		result = prime * result + ((requestReservationType == null) ? 0 : requestReservationType.hashCode());
		result = prime * result + roomsNumber;
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
		ReservationBuilder other = (ReservationBuilder) obj;
		if (discount != other.discount)
			return false;
		if (pacient == null) {
			if (other.pacient != null)
				return false;
		} else if (!pacient.equals(other.pacient))
			return false;
		if (period != other.period)
			return false;
		if (requestReservationType == null) {
			if (other.requestReservationType != null)
				return false;
		} else if (!requestReservationType.equals(other.requestReservationType))
			return false;
		if (roomsNumber != other.roomsNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ReservationBuilder [requestReservationType=" + requestReservationType + ", pacient=" + pacient
				+ ", period=" + period + ", roomsNumber=" + roomsNumber + ", discount=" + discount + "]";
	}
	
}