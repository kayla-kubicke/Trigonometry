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

	public boolean isPossibleTriangle(Line sideA, Line sideB, Line sideC); // Triangle Inequality Theorem.
	public boolean isPossibleTriangle(double angleA, double angleB, double angleC); // Equals 180 degrees.

	public boolean areSimilar(Triangle comparisonTriangle);

	public double getSideLength(Line side);

	public double getAngle(double angle);

	public String getInformation(); // Just use toString()?
	public String getUnknownInformation();
	public String getKnownInformation();

	public double getArea();
	public double getPerimeter();
}