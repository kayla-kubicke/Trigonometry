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
	public boolean isPossibleTriangle(Side sideA, Side sideB, Side sideC); // Triangle Inequality Theorem.
	public boolean isPossibleTriangle(Angle angleA, Angle angleB, Angle angleC); // Equals 180 degrees.


	//
	// Triangle comparison Boolean method
	public boolean areSimilar(Triangle comparisonTriangle);


	//
	// Informational (get) methods
	public double getSideLength(Side side); // Build Side object?
		// REFACTOR: Collapse into one method.
		// public double getSideLengthA();
		// public double getSideLengthB();
		// public double getSideLengthC();

	public double getAngle(Angle angle); // Build Angle object?
		// REFACTOR: Collapse into one method.
		// public double getAngleAlpha();
		// public double getAngleBeta();
		// public double getAngleGamma();

	public String getInformation(); // Just use toString()?
	public String getUnknownInformation();
	public String getKnownInformation();

	//
	// Calculation methods
	public double getArea();
	public double getPerimeter();
}