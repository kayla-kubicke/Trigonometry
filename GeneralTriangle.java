/*
* The GeneralTriangle interface contains skeleton methods
* for all Triangle objects.
*/

public interface GeneralTriangle {
	// Type methods will contain logic to determine type.
	// public String getType();
	// public String determineType(); // Returns a String, for now.


	// Ovderloaded validation methods
	// public boolean isValidTriangle(Line sideA, Line sideB, Line sideC);
	// public boolean isValidTriangle(double angleA, double angleB, double angleC);
	// public boolean isValidTriangle(Line side, double angle, double sumOfOtherSides);
	// public boolean isValidTriangle (double angle, Line side, double differenceOfOtherSides);


	// Triangle comparison Boolean methods
	// public boolean areSimilar(Triangle comparisonTriangle);
	// public boolean areCongruent(Triangle comparisonTriangle);


	// Initial calculation methods
	// (!) FIX: Design with respect to constructors.
	// Overloaded solveUnknownInformation(...)
	// public void solveUnknownInformation(Line sideA, Line sideB, Line sideC);
	// public void solveUnknownInformation(double angleA, double angleB, double angleC);
	// public void solveUnknownInformation(Line side, double associatedAngle, double sumOfOtherSides);
	// public void solveUnknownInformation(double associatedAngle, Line side, double differenceOfOtherSides);
	// public void solveUnknownInformation(Line sideA, Line sideB, double angleBetween);
	// public void solveUnknownInformation(Line sideA, double angleA, double angleB);
	// public double calculateSideLength(Line side);
	// public double calculateTriangleHeight();
	// public double portionOfBase(); // Rename?

	//
	// Calculation methods
	public double calculateSideLength(double[] startingPoint, double[] endpoint);
	// public double getArea();
	// public double getPerimeter();

	//
	// ADD: Configuration Information

	//
	// Get Methods
	public double[] getSideAendpoint1();
	public double[] getSideAendpoint2();
	public double[] getSideBendpoint1();
	public double[] getSideBendpoint2();
	public double[] getSideCendpoint1();
	public double[] getSideCendpoint2();
	public double getSideAlength();
	public double getSideBlength();
	public double getSideClength();
	public double getAngleA();
	public double getAngleB();
	public double getAngleC();
	public String getTriangleType();
	public String getAngleType();
}