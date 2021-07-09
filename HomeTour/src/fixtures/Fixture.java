package fixtures;

public abstract class Fixture {

	protected String name;  
	
	protected String shortDesc; 
	
	protected String longDesc; 
	
	// Getters and Setters:
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortDesc() {
		return shortDesc;
	}
	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}
	public String getLongDesc() {
		return longDesc;
	}
	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}

	// Overridden toString method
	public String toString() {
		return "Fixture [name=" + name + ", shortDesc=" + shortDesc + ", longDesc=" + longDesc + "]";
	}
}
