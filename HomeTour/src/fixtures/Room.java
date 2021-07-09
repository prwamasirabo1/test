package fixtures;

public class Room extends Fixture {
private Room[] exits = new Room[4];
	
	/*
	 * This Fixture array is a collection of the items we can potentially
	 * have in our room.
	 */
	private Fixture[] items;

	public Room(String name, String shortDesc, String longDesc) {
		super();
	}
	
	public Room[] getExits() {
		return this.exits;
	}
	
	/*
	 * This method can be used to obtain a specific Exit from
	 * the Room Object...
	 * 
	 * This method is used in the example to provide the arbitrary
	 * way to move north/south/east/west
	 */
	public Room getExit(String direction) { 
		// TODO: Implement Method
		return null;
	}
	
	// setter for exits
	public void setExits(Room[] exits) {
		this.exits = exits;
	}

	// Overloaded setter method. Allows us to set single exit based on index...
	public void setExits(Room exit, int index) {
		this.exits[index] = exit;
	}
	
	// Getter and Setter for Fixtures
	public Fixture[] getItems() {
		return items;
	}
	
	/*
	 * The setter method here uses VarArgs simply for ease of use
	 */
	public void setItems(Fixture... items) {
		this.items = items;
	}

}
