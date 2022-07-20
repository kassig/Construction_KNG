
public class Business extends Building {
	// instance variables
	protected int numRentableUnits;

	// empty-argument constructor
	public Business() {
	super();
	numRentableUnits = 0;
	}

	// preferred constructor
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
	String subgroup, int numRentableUnits) {
	super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
	this.numRentableUnits = numRentableUnits;
	}

	public int getNumRentableUnits() {
	return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
	this.numRentableUnits = numRentableUnits;
	}

	public String toString() {
	return super.displayData() + "\nNumber of Rentable Units: " + numRentableUnits;
	}
}
