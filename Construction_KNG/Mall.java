
public class Mall extends Business {
	// instance variables
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;

	// empty argument constructor
	public Mall() {
	super();
	numParkingSpaces = 0;
	numRentableUnits = 0;
	medianUnitSize = 0.0;
	}

	// preferred constructor
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
	String subgroup, int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
	super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentedUnits);
	this.medianUnitSize = medianUnitSize;
	this.numParkingSpaces = numParkingSpaces;
	}

	// what is drawn
	public void draw() {
	System.out.println("Drawing code for " + this.getClass().getSimpleName());
	}

	public String displayData() {
	String str = "";
	str += super.toString() + "\nNumber of Rented Units: " + numRentedUnits + "\nMedian Unit Size: "
	+ medianUnitSize + "\nNumber of Parking Spaces: " + numParkingSpaces;
	return str;
	}

	// setters and getters
	public int getNumRentedUnits() {
	return numRentedUnits;
	}

	public void setNumRentedUnits(int numRentedUnits) {
	this.numRentedUnits = numRentedUnits;
	}

	public double getMedianUnitSize() {
	return medianUnitSize;
	}

	public void setMedianUnitSize(double medianUnitSize) {
	this.medianUnitSize = medianUnitSize;
	}

	public int getNumParkingSpaces() {
	return numParkingSpaces;
	}

	public void setNumParkingSpaces(int numParkingSpaces) {
	this.numParkingSpaces = numParkingSpaces;
	}	
}
