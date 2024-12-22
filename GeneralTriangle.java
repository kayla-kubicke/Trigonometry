/*
* The GeneralTriangle interface contains skeleton methods
* for all Triangle objects.
*/

public interface GeneralTriangle {
	// Type methods will contain logic to determine type.
	public String getType();
	public String determineType(); // Returns a String, for now.


	// Ovderloaded validation methods
	public boolean isValidTriangle(Line sideA, Line sideB, Line sideC);
	public boolean isValidTriangle(double angleA, double angleB, double angleC);
	public boolean isValidTriangle(Line side, double angle, double sumOfOtherSides);
	public boolean isValidTriangle (double angle, Line side, double differenceOfOtherSides);


	// Triangle comparison Boolean methods
	public boolean areSimilar(Triangle comparisonTriangle);
	public boolean areCongruent(Triangle comparisonTriangle);


	// Initial calculation methods
	// (!) FIX: Design with respect to constructors.
	// (!) BUT: How to return? HashTable?
	// Overloaded solveUnknownInformation(...)
	// public HashTable solveUnknownInformation(...);
		// Collapse responsibility into solveUnknownInformation(...)
			// public double calculateAngle(...);

	//
	// REMOVE
	//
	public HashTable solveUnknownInformation(Line sideA, Line sideB, Line sideC);
	// public HashTable solveUnknownInformation(double angleA, double angleB, double angleC);
	// public HashTable solveUnknownInformation(Line side, double associatedAngle, double sumOfOtherSides);
	// public HashTable solveUnknownInformation(double associatedAngle, Line side, double differenceOfOtherSides);
	// public HashTable solveUnknownInformation(Line sideA, Line sideB, double angleBetween);
	// public HashTable solveUnknownInformation(Line sideA, double angleA, double angleB);
	public double calculateSideLength(Line side);
	public double calculateTriangleHeight();
	public double portionOfBase(); // Rename?
	//
	// REMOVE
	//

	//
	// Calculation methods
	public double getArea();
	public double getPerimeter();

	//
	// ADD: Configuration Information

	//
	// Get Methods
	// public String getTriangleType();
	// public String getAngleType();
}