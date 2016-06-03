package classes.rooms;

import enums.hopistalRoomTypes;
import interfaces.IRoomType;

public class RoomFactory {
	public IRoomType reserveRoom(hopistalRoomTypes type) {
		switch(type) {
		case OneBedRoom: return new OneBedRoom();
		case TwoBedsRoom: return new TwoBedsRoom();
		case FiveBedsRoom: return new FiveBedsRoom();
		}
		return null;
	}
}