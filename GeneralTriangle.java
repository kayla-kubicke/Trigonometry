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
	public boolean isValidTriangle(Angle angleA, Angle angleB, Angle angleC);
	public boolean isValidTriangle(Line side, double angle, double sumOfOtherSides);
	public boolean isValidTriangle (double angle, Line side, double differenceOfOtherSides);


	// Triangle comparison Boolean methods
	public boolean areSimilar(Triangle comparisonTriangle);
	public boolean areCongruent(Triangle comparisonTriangle);


	// Calculation methods
	public double calculateSideLength(Line side);
		// REFACTOR: Collapse into one method.
		// public double getSideLengthA();
		// public double getSideLengthB();
		// public double getSideLengthC();

	// 12/19 - LIST ALL VARIATIONS
	public double calculateAngle(double firstAngle, double secondAngle); // Build Angle object?


		// REFACTOR: Collapse into one method.
		// public double getAngleAlpha();
		// public double getAngleBeta();
		// public double getAngleGamma();

	// ADD: Set methods.

	public String getInformation(); // Just use toString()?
	public String getUnknownInformation();
	public String getKnownInformation();

	//
	// Calculation methods
	public double getArea();
	public double getPerimeter();
	// ADD: public calculateAngle(...); // Build handler/validation
	// ADD: public calculateSide(...); // Build handler/validation
}