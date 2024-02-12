package pro8;

public class Room {
	private final int roomId;
	private final String roomNumber;
	private final int capacity;

	public Room(int roomId, String roomNumber, int capacity) {
		this.roomId = roomId;
		this.roomNumber = roomNumber;
		this.capacity = capacity;
	}
    int getRoomId() {
		return this.roomId;
	}

	public String getRoomNumber() {
		return this.roomNumber;
	}
	public int getRoomCapacity() {
		return this.capacity;
	}
}
