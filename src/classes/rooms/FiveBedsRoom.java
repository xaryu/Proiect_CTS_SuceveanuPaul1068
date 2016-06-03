package classes.rooms;

import interfaces.IRoomType;

public class FiveBedsRoom implements IRoomType {

	@Override
	public void roomType() {
		System.out.println("The pacient will be found in a five beds room");
	}
	
	public boolean isCleanedUp() {
		return true;
	}
	
	public boolean isFull() {
		return false;
	}
}