/*
* The Triangle class contains methods to build, manipulate,
* and retrieve information about triangle objects.
*/

// POSSIBLE UPDATE: Triangle build handler for constructors.
// UPDATE: Break out into abstract class instead of directly extending GeneralTriangle.
// UPDATE: Push user interaction responsibilities to another class.
// (~) UPDATE: Account for radians and degrees.
// REDUCE: Recalculations (I'm looking at you, isValidTriangle(...))


public class Triangle { // extends GeneralTriangle
	// 
	// START: Data Fields
	// 

	// private Line sideA;
	// private Line sideB;
	// private Line sideC;

	// ADD: Side lengths, to avoid recalculation?

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
	// public boolean isValidTriangle(Line sideA, Line sideB, Line sideC) {
		// double sideAlength = calculateSideLength(sideA); // NOTE/UPDATE: Will likely add as data field.
		// double sideBlength = calculateSideLength(sideB);
		// double sideClength = calculateSideLength(sideB);

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
		// Maybe not needed...
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
				// Calculate lengthA of sideA
				// *NOT THIS METHOD'S RESPONSIBILITY - MOVE!* Set points
				// Depends on sides being reassigned by length...
					// if sideA: Point a1 = (0,0), Point a2 = (lengthA, 0)
					// if sideB: a1 = (0,0), Points b2,c2 = (ratio of base, height)
					// if sideC: a2 = (lengthA, 0), b2,c2 = (ratio of base, height)

			// (!) ANGLES
		// }
	// }


	// public double calculateSideLength(Line side) {
		// return Math.sqrt(Math.pow((side.endX + side.startX), 2) - Math.pow((side.endY + side.startY), 2));
	// }

	// END: Calculations


	//
	// END: Methods 
	//
}