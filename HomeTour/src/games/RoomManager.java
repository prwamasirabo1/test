package games;

public class RoomManager {
	private Room rooms;
	private String startingRoom;
	
	public RoomManager() {} 
	public RoomManager (Room rooms, String startingRoom) {
		this.rooms = rooms;
        this.startingRoom = startingRoom;
	}
	public Room Rooms() {
		
	System.out.println("The Foyer a small foyer the small "
			+ "entryway of a neo-colonial house. A dining room "
			+ "is open to the south, where a large table can be "
			+ "seen.The hardwood floor leads west into doorway,"
			+ " next to a staircase that leads up to a second floor"
			+ "	To the north is a small room, where you can see a piano.");
	return rooms;
	}
			//this.rooms[0] = "foyer";
	       // this.startingRoom = "foyer";
	
		//getters and setters
	    Room getRooms(){ return this.rooms; }
	    public void setRooms(Room rooms){ this.rooms = rooms; }

	    public String startingRoom() { return this.startingRoom; }
	   // public void setstartingRoom(short pstartingRoom) {this.propellers = propellers; }

	    public void turn(){
	        System.out.println("Turning...");
	   
	}
	
}
