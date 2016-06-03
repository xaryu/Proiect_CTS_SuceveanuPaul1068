package classes.rooms;

import interfaces.IRoomType;

public class TwoBedsRoom implements IRoomType {	
	
	public boolean isCleanedUp() {
		return true;
	}
	
	@Override
	public void roomType() {
		System.out.println("The pacient will be found in a two beds room.");
	}
	
	public boolean isFull() {
		return false;
	}
}