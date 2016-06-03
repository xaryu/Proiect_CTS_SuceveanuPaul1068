package classes.rooms;

import interfaces.IRoomType;

public class OneBedRoom implements IRoomType {
	
	public boolean isCleanedUp() {
		return true;
	}
	
	@Override
	public void roomType() {
		System.out.println("The pacient can be found in a room with one bed.");
	}
	
	public boolean isFull() {
		return true;
	}

}