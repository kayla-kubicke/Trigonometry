/*
* The GeneralTriangle interface contains skeleton methods
* for all Triangle objects.
*/

public interface GeneralTriangle {
	//
	// Type methods will contain logic to determine type.
	public boolean isType(); // Unnecessary?
	public Triangle getType();
		// REFACTOR: Collapse into two method.
		// public boolean isRight();
		// public boolean isAcute();
		// public boolean isEquilateral();
		// public boolean isObtuse();
		// public boolean isIsoceles();


	//
	// Possible triangle methods will contain logic to determine if
	// proposed triangle is possible.
	public boolean isValidTriangle(Point sideA, Point sideB, Point sideC); // Triangle Inequality Theorem.
	public boolean isValidTriangle(Angle angleA, Angle angleB, Angle angleC); // Equals 180 degrees.
	// (POSSIBLE) UPDATE: isValidTriangle(...) combining known side and angle information.


	//
	// Triangle comparison Boolean method
	public boolean areSimilar(Triangle comparisonTriangle);
	// ADD: public boolean areCongruent(Triangle comparisonTriangle);


	//
	// Informational (get) methods
	public double getSideLength(Point side);
		// REFACTOR: Collapse into one method.
		// public double getSideLengthA();
		// public double getSideLengthB();
		// public double getSideLengthC();

	public double getAngle(double angle); // Build Angle object?
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