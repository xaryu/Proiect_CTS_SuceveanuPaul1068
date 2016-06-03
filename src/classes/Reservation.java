package classes;

import interfaces.IRequestReservation;

public class Reservation {
	IRequestReservation reservationScheduleType;
	Pacient pacient;
	int period;
	int roomNb;
	int discount;

	public Reservation(IRequestReservation reservationScheduleType, Pacient pacient, int period, int roomNb,
			int discount) {
		super();
		System.out.println("Reservation constructor");
		this.reservationScheduleType = reservationScheduleType;
		this.period = period;
		
		if(roomNb<1) {
			throw new UnsupportedOperationException("At least 1 room!");
		}
		this.pacient = pacient;
		if(period<1) {
			throw new UnsupportedOperationException("The reservation period can only be > 1");
		}		
		this.discount = discount;
		
		this.roomNb = roomNb;
		if(discount < 0)
			throw new UnsupportedOperationException("The discount value cannot be negative");
	}

	public Reservation() {
		super();
		System.out.println("Reservation constructor without params");
		this.reservationScheduleType = new EmailReservation();
		this.pacient = new Pacient("John Doe", 20);
		this.period = 1;
		this.roomNb = 1;
		this.discount = 0;
	}
	
	
	public int getPeriod() {
		return period;
	}

	public void setReservationScheduleType(IRequestReservation reservationScheduleType) {
		this.reservationScheduleType = reservationScheduleType;
	}
	
	
	public IRequestReservation getReservationScheduleType() {
		return reservationScheduleType;
	}
	
	public void setPacient(Pacient pacient) {
		this.pacient = pacient;
	}

	public Pacient getPacient() {
		return pacient;
	}

	
	public int getDiscount() {
		return discount;
	}

	public int getRoomNb() {
		return roomNb;
	}
	
	public float getTotal() {
		float total = 110 * period;
		float finalTotal = total - (total * discount/100);
		return finalTotal;
	}

	public void sendReservationRequest() {
		System.out.println(pacient.toString());
		reservationScheduleType.reserve();
	}
	
	@Override
	public String toString() {
		return pacient + " This patient should stay for " + period + " days." 
				+ " Having social problems, he has a discount of " + discount + "%."
				+ " The reservation was made throught" + reservationScheduleType.type() + ".";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + discount;
		result = prime * result + ((pacient == null) ? 0 : pacient.hashCode());
		result = prime * result + period;
		result = prime * result + ((reservationScheduleType == null) ? 0 : reservationScheduleType.hashCode());
		result = prime * result + roomNb;
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
		Reservation other = (Reservation) obj;
		if (discount != other.discount)
			return false;
		if (pacient == null) {
			if (other.pacient != null)
				return false;
		} else if (!pacient.equals(other.pacient))
			return false;
		if (period != other.period)
			return false;
		if (reservationScheduleType == null) {
			if (other.reservationScheduleType != null)
				return false;
		} else if (!reservationScheduleType.equals(other.reservationScheduleType))
			return false;
		if (roomNb != other.roomNb)
			return false;
		return true;
	}
}