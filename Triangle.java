/*
* The Triangle class contains methods to build, manipulate,
* and retrieve information about triangle objects.
*/

// POSSIBLE UPDATE: Triangle build handler for constructors?

public class Triangle extends GeneralTriangle {
	private Line sideA;
	private Line sideB;
	private Line sideC;

	private double angleA;
	private double angleB;
	private double angleC;

	//
	// START CONSTRUCTOR HANDLER NOTES
	//

	// START: REQUIRE VALIDATION
		// 3 sides
		// (???) sideA assumed to be base, sideB assumed to be attached to left of base, sideC to the right
			// I.D data type - (Line sideA, Line sideB, Line sideC)
			// Validity check
				// Rotate and assemble, regardless of current placement, at origin (just care about the
				// length of the sides)
				// Do sides touch correctly? (No overextension, no gaps)
				// Calculate angles from triangle created
				// Call constructor

		// 3 angles
		// (?) technically, would represent side ratios, not specific triangle.
			// I.D data type - (double angleA, double angleB, double angleC)
			// Validity check
				// Add up to 180 or pi? Any zeros? // BigDecimal for radians.
				// Call constructor

		// Base, base angle, sum of other two sides
			// I.D data type - (Line base, double angle, double sumOfOtherSides)*
			// Validity check
				// Can the sumOfOtherSides reach sideB's ray?
				// Call constructor

		// base, base angle, difference of other two sides
			// I.D data type - (Line base, double angle, double differenceOfOtherSides)*
			// Validity check
				// Does the differenceOfOtherSides reach sideB's (on either side of) ray?
	// END: REQUIRE VALIDATION

	// 2 sides, 1 angle (Line sideA, Line sideB, double angleA)
		// I.D data type
			// Place one side starting at origin, attach other side based on provided angle,
			// add remaining side, and angles.

	// 2 angles, 1 side (Line sideA, double angleA, double angleB)*
		// I.D data type
		// Place side starting at origin, "add" angles to side, and calculate remaining sides.
		// Call constructor

	// * How should this be handled?

	// END CONSTRUCTOR HANDLER NOTES

	// Default; build equalateral triangle.
	public Triangle() {
	// this(...);
	}

	// If valid triangle, build triangle based on angles provided.
	public Triangle(Line sideA, Line sideB, Line sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;

		// this.angleA = calculateAngle(...);
		// this.angleB = calculateAngle(...);
		// this.angleC = calculateAngle(...);
	}

	// If valid triangle, build triangle based on sides provided.
	// Minimizes side length...?
	public Triangle(double angleA, double angleB, double angleC) {
		// this.sideA = calculateSide(...);
		// this.sideB = calculateSide(...);
		// this.sideC = calculateSide(...);

		this.angleA = angleA;
		this.angleB = angleB;
		this.angleC = angleC;
	}

	public boolean isType();
	public Triangle getType();

	// Valid
	public boolean isValidTriangle(Line sideA, Line sideB, Line sideC); // Triangle Inequality Theorem.
	public boolean isValidTriangle(double angleA, double angleB, double angleC); // Equals 180 degrees.

	public boolean areSimilar(Triangle comparisonTriangle);

	public double getSideLength(Line side);

	public double getAngle(double angle);

	public String getInformation(); // Just use toString()?
	public String getUnknownInformation();
	public String getKnownInformation();

	public double getArea();
	public double getPerimeter();
}