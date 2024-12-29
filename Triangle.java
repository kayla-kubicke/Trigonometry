/*
* The Triangle class contains methods to build, manipulate,
* and retrieve information about triangle objects.
*/

// UPDATE: Break out into abstract class instead of directly extending GeneralTriangle.
// UPDATE: Push user interaction responsibilities to another class.
// (~) UPDATE: Default radians; account for degrees.
// REDUCE: Recalculations (isValidTriangle(...), etc)
// FOR DOUBLES: BigDecimal/Handling decisions?
// UPDATE: Account for tiny angles.
// REMOVE: Unnecessary parentheses from calculations.
// UPDATE: All data fields should be immutable... eventually.
// (!) UPDATE: Decided to use double[] instead of Line and/or Point.
	// MAY update to HashMap to call x/y keys; would be cleaner. Leave for now.

// import java.math.BigDecimal;

public class Triangle implements GeneralTriangle {
	//
	// START: (?) Constants
	//

	// ADD: String[] triangleTypeOptions of options?
	// static final private String[] TRIANGLETYPEOPTIONS ={POPULATE};

	//
	// END: (?) Constants
	//

	// 
	// START: Data Fields
	// 

	private double[] sideAendpoint1;
	private double[] sideAendpoint2;
	private double[] sideBendpoint1;
	private double[] sideBendpoint2;
	private double[] sideCendpoint1;
	private double[] sideCendpoint2;

	private double sideAlength;
	private double sideBlength;
	private double sideClength;

	private double height; // this.calculateTriangleHeight() inside constructor

	private double angleA;
	private double angleB;
	private double angleC;

	private String triangleTypeBySide;
	private String triangleTypeByAngle;
	private String angleType;

	//
	// END: Data Fields
	//

	//
	// START: Constructors
	//

	// Default Equilateral - 1 configuration
	public Triangle() {
		this.height = Math.sqrt(3)/2;

		this.sideAendpoint1 = new double[]{0.0, 0.0};
		this.sideAendpoint2 = new double[]{1.0, 0.0};
		this.sideBendpoint1 = new double[]{0.0, 0.0};
		this.sideBendpoint2 = new double[]{0.5, this.height};
		this.sideCendpoint1 = new double[]{1.0, 0.0};
		this.sideCendpoint2 = new double[]{0.5, this.height};
		this.sideAlength = this.calculateSideLength(this.sideAendpoint1, this.sideAendpoint2);
		this.sideBlength = this.calculateSideLength(this.sideBendpoint1, this.sideBendpoint2);
		this.sideClength = this.calculateSideLength(this.sideCendpoint1, this.sideCendpoint2);

		this.angleA = Math.PI / 3; // OR 60.0
		this.angleB = Math.PI / 3; // OR 60.0
		this.angleC = Math.PI / 3; // OR 60.0

		this.triangleTypeBySide = "equilateral";
		this.angleType = "radians";
	}

	// 3 sides - 6 possible configurations
	public Triangle(double sideAlength, double sideBlength, double sideClength) {
		if(this.isValidTriangle(sideAlength, sideBlength, sideClength)) {
			this.sideAlength = sideAlength;
			this.sideBlength = sideBlength;
			this.sideClength = sideClength;

			this.solveUnknownInformation(sideAlength, sideBlength, sideClength);
		}
	}

	// 3 angle - 6 possible configurations
	// NOTE: Only provides side ratios
	// public Triangle(double angleA, double angleB, double angleC) {
		// Validate
	// }

	// Side length, associated angle, sum of two other sides - 12 possible configurations
	// *NOTE: Respect order.
	// public Triangle(Line side, double associatedAngle, double sumOfOtherSides) {
		// Validate
	// }

	// Side length, associated angle, difference of two other sides - 12 possible configurations
	// *NOTE: Respect order.
	// public Triangle(double associatedAngle, Line side, double differenceOfOtherSides) {
		// Validate
	// }

	// 2 sides, angle between provided sides - 6 possible configurations
	// public Triangle(Line sideA, Line sideB, double angleBetween) {
		//
	// }

	// 2 angles, 1 side associated with given angles - 6 possible configurations
	// pubilc Triangle(Line sideA, double angleA, double angleB) {
		//
	// }

	//
	// END: Constructors
	//


	//
	// START: Methods 
	//


	// START: Type Methods
	// public String getType() {
		// return this.type;
	// }

	// public String determineType() {
		// Contains logic to determine:
			// Right triangle
			// Acute triangle
			// Equilateral triangle
			// Obtuse triangle
			// Isoceles triangle
	// }
	//  END: Type Methods


	// START: Validations
	// Could write own exception, but this is good enough for now.
	// FIX: Params only used to id method? -_-
	// Double check: Assignment works correctly for equilateral, isosceles, and scalene.
	public boolean isValidTriangle(double sideAlength, double sideBlength, double sideClength) throws IllegalArgumentException {
		double longestSide = Math.max(Math.max(sideAlength, sideBlength), sideClength);
		double shortestSide = Math.min(Math.min(sideAlength, sideBlength), sideClength);
		double medianSide = (sideAlength + sideBlength + sideClength) - (longestSide + shortestSide);

		if(shortestSide + medianSide <= longestSide) {
			// (?) ADD RESPONSIBILITY: Triangle type? Just want to avoid repeat calculations... Kinda makes sense to assign in validate.
			if(shortestSide == medianSide && shortestSide == longestSide) { // ACCOUNT FOR ROUNDING ERRRORS, percentage tolerance?
				this.triangleTypeBySide = "equilateral";
			} else if(shortestSide == medianSide) {
				this.triangleTypeBySide = "isosceles";
			} else {
				this.triangleTypeBySide = "scalene";
			}

			return false;
		}

		return true;
	}

	// public boolean isValidTriangle(double angleA, double angleB, double angleC) throws IllegalArgumentException {
		// ADD: Logic
	// }

	// public boolean isValidTriangle(Line side, double angle, double sumOfOtherSides) throws IllegalArgumentException {
		// ADD: Logic
	// }

	// public boolean isValidTriangle (double angle, Line side, double differenceOfOtherSides) throws IllegalArgumentException {
		// ADD: Logic
	// }
	// END: Validations


	// START: Triangle Comparison
	// public boolean areSimilar(Triangle comparisonTriangle) {
		// Comparison logic
	// }

	// public boolean areCongruent(Triangle comparisonTriangle) {
		// Maybe not needed... Previously calculated?
		// if(!this.areSimilar(comparisonTriangle)) {
			// return false;
		// }
		// Comparison logic
	// }
	// END: Triangle Comparison


	// START: Calculations
	public void solveUnknownInformation(double sideAlength, double sideBlength, double sideClength) {
		this.height = this.calculateTriangleHeight();

		this.sideAendpoint1 = new double[]{0.0, 0.0};
		this.sideAendpoint2 = new double[]{this.sideAlength, 0.0};
		this.sideBendpoint1 = new double[]{0.0, 0.0};
		this.sideBendpoint2 = new double[]{this.portionOfBase(), this.height}; // CHECK: portionOfBase()
		this.sideCendpoint1 = new double[]{this.sideAlength, 0.0};
		this.sideCendpoint2 = new double[]{this.portionOfBase(), this.height};

		// CHECK: calculateAngleWithLawOfConsines()
		this.angleC = calculateAngleWithLawOfConsines(this.sideClength, this.sideAlength, this.sideBlength);
		this.angleB = calculateAngleWithLawOfConsines(this.sideBlength, this.sideAlength, this.sideClength);
		this.angleA = 180.0 - (this.angleB + this.angleC);

		this.angleType = "radians";
	}

	public double calculateSideLength(double[] startingPoint, double[] endpoint) {
		return Math.sqrt(Math.pow((endpoint[0] - startingPoint[0]), 2) + Math.pow((endpoint[1] - startingPoint[1]), 2));

		//
		// START: BigDecimal version
		//

		// BigDecimal endpoint0 = new BigDecimal(endpoint[0]);
		// BigDecimal endpoint1 = new BigDecimal(endpoint[1]);

		// BigDecimal startingPoint0 = new BigDecimal(startingPoint[0]);
		// BigDecimal startingPoint1 = new BigDecimal(startingPoint[1]);

		// BigDecimal firstSubtraction = endpoint0.subtract(startingPoint0);
		// BigDecimal secondSubtraction = endpoint1.subtract(startingPoint1);

		// BigDecimal firstSubtractionSquared = firstSubtraction.multiply(firstSubtraction);
		// BigDecimal secondSubtractionSquared = secondSubtraction.multiply(secondSubtraction);

		// BigDecimal total = firstSubtractionSquared.add(secondSubtractionSquared);
		// double squaredTotal = Math.sqrt(total.doubleValue());

		//
		// END: BigDecimal version
		//
	}


	public double calculateTriangleHeight() {
		double perimeterHalf = (this.sideAlength + this.sideBlength + this.sideClength) / 2;

		return Math.sqrt(perimeterHalf * (perimeterHalf - this.sideAlength) * (perimeterHalf - this.sideBlength) * (perimeterHalf - this.sideClength));
	}

	public double calculateAngleWithLawOfConsines(double sideLengthOppositeOfDesiredAngle, double sideLengthRemaining, double otherSideLengthRemaining) {
		return (1 / cos((Math.pow(sideLengthRemaining, 2) + Math.pow(otherSideLengthRemaining, 2) - Math.pow(sideLengthOppositeOfDesiredAngle, 2)) / (2 * sideLengthRemaining * otherSideLengthRemaining)));
	}

	public double portionOfBase() {
		return Math.sqrt(Math.pow(this.sideBlength, 2) - Math.pow(this.height, 2)); // Assumes height and length is data field.
	}

	// END: Calculations

	//
	// START: Get Methods
	//

	public double[] getSideAendpoint1() {
		return this.sideAendpoint1;
	}

	public double[] getSideAendpoint2() {
		return this.sideAendpoint2;
	}

	public double[] getSideBendpoint1() {
		return this.sideBendpoint1;
	}

	public double[] getSideBendpoint2() {
		return this.sideBendpoint2;
	}

	public double[] getSideCendpoint1() {
		return this.sideCendpoint1;
	}

	public double[] getSideCendpoint2() {
		return this.sideCendpoint2;
	}

	public double getSideAlength() {
		return this.sideAlength;	
	}

	public double getSideBlength() {
		return this.sideBlength;	
	}

	public double getSideClength() {
		return this.sideClength;	
	}

	public double getAngleA() {
		return this.angleA;
	}

	public double getAngleB() {
		return this.angleB;
	}

	public double getAngleC() {
		return this.angleC;
	}

	public String getTriangleTypeBySide() {
		return this.triangleTypeBySide;
	}

	// public String getTriangleTypeByAngle() {}

	public String getAngleType() {
		return this.angleType;
	}

	//
	// END: Get Methods
	//

	//
	// END: Methods 
	//
}