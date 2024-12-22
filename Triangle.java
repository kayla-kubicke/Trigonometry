/*
* The Triangle class contains methods to build, manipulate,
* and retrieve information about triangle objects.
*/

// UPDATE: Break out into abstract class instead of directly extending GeneralTriangle.
// UPDATE: Push user interaction responsibilities to another class.
// (~) UPDATE: Default radians; account for degrees.
// REDUCE: Recalculations (isValidTriangle(...), etc)
// FOR DOUBLES: BigDecimal/Handling decisions?
// UPDATE: Side length calculations in constructor
// (SET DEFAULT) UPDATE: Set sides based on length comparisons. (sideA is largest, etc)
// UPDATE: Tiny angles.
// REMOVE: Unnecessary parentheses from calculations.


public class Triangle { // extends GeneralTriangle
	// 
	// START: Data Fields
	// 

	// private Line sideA;
	// private Line sideB;
	// private Line sideC;

	// private double sideAlength;
	// private double sideBlength;
	// private double sideClength;

	// (?) ADD: private double height; // this.calculateTriangleHeight() inside constructor

	// private double angleA;
	// private double angleB;
	// private double angleC;

	// private String triangleType; // ADD: String[] of options?
	// (?) ADD: private String angleType; // make int?

	//
	// END: Data Fields
	//

	//
	// START: Constructors
	//

	// No params
	// public Triangle() {
		// this.sideA = 1.0;
		// this.sideB = 1.0;
		// this.sideC = 1.0;

		// this.angleA = Math.PI/3; // OR 60.0
		// this.angleB = Math.PI/3; // OR 60.0
		// this.angleC = Math.PI/3; // OR 60.0

		// this.triangleType = "equalateral";
		// this.angleType = "radians";
	// }

	// 3 sides - 6 possible configurations
	// public Triangle(Line sideA, Line sideB, Line sideC) {
		// Validate
	// }

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
			// Equalateral triangle
			// Obtuse triangle
			// Isoceles triangle
	// }
	//  END: Type Methods


	// START: Validations
	// public boolean isValidTriangle(Line sideA, Line sideB, Line sideC) { // FIX: Params only used to id method? -_-
		// double longestSide = Math.max(Math.max(sideAlength, sideBlength), sideClength);
		// double shortestSide = Math.min(Math.min(sideAlength, sideBlength), sideClength);
		// double medianSide = (sideAlength + sideBlength + sideClength) - (longestSide + shortestSide);

		// if(shortestSide + medianSide < longestSide) {
			// return false;
		// }

		// return true;
	// }

	// public boolean isValidTriangle(double angleA, double angleB, double angleC) {
		// ADD: Logic
	// }

	// public boolean isValidTriangle(Line side, double angle, double sumOfOtherSides) {
		// ADD: Logic
	// }

	// public boolean isValidTriangle (double angle, Line side, double differenceOfOtherSides) {
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
	// public HashTable solveUnknownInformation(Line sideA, Line sideB, Line sideC) {
		// if(isValidTriangle(Line sideA, Line sideB, Line sideC)) {
			// Logic:
				// Side lengths
				// *NOT THIS METHOD'S RESPONSIBILITY - (!) MOVE* Set points
				// Depends on sides being reassigned by length...
					// if sideA: Point a1 = (0,0), Point a2 = (sideAlength, 0)
					// if sideB: a1 = (0,0), Points b2,c2 = (this.portionOfBase(), height)
					// if sideC: a2 = (sideAlength, 0), b2,c2 = (this.portionOfBase(), height)

				// Angles
					// UPDATE: Make law of cosines method since calculation is used multiple times.
					// this.angleC = 1 / (Math.cos((Math.pow.(sideAlength, 2) + Math.pow(sideBlength, 2) -  Math.pow(sideClength, 2)) / (2 * sideAlength * sideBlength)));
					// this.angleB = 1 / (Math.cos((Math.pow(sideClength, 2) + Math.pow(sideAlength, 2) - Math.pow(sideBlength, 2)) / (2 * sideClength * sideAlength)));
					// this.angleC = 180.0 - (angleB + angleC);
		// }
	// }


	// public double calculateSideLength(Line side) {
		// return Math.sqrt(Math.pow((side.endX + side.startX), 2) - Math.pow((side.endY + side.startY), 2));
	// }


	// public double calculateTriangleHeight() {
		// double perimeterHalf = (sideAlength + sideBlength + sideClength) / 2;

		// return Math.sqrt(perimeterHalf * (perimeterHalf - sideAlength) * (perimeterHalf - sideBlength) * (perimeterHalf - sideClength));
	// }

	// Do not like method name...
	// public double portionOfBase() {
		// return Math.sqrt(Math.pow(sideBlength, 2) - Math.pow(height, 2)); // Assumes height and length is data field.
	// }

	// END: Calculations


	//
	// END: Methods 
	//
}