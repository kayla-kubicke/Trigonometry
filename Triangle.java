/*
* The Triangle class contains methods to build, manipulate,
* and retrieve information about triangle objects.
*/

// POSSIBLE UPDATE: Triangle build handler for constructors.
// UPDATE: Break out into abstract class instead of directly extending GeneralTriangle.
// UPDATE: Push user interaction responsibilities to another class.


public class Triangle { // extends GeneralTriangle
	// 
	// START: Data Fields
	// 

	// private Line sideA;
	// private Line sideB;
	// private Line sideC;

	// private double angleA;
	// private double angleB;
	// private double angleC;

	// private String type;

	// 
	// END: Data Fields
	// 

	//
	// START: Constructors
	//

	// No params
	// public Triangle() {
		// Build default equalateral.
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
	// public Triangle(Line side, double angle, double sumOfOtherSides) {
		// Validate
	// }

	// Side length, associated angle, difference of two other sides - 12 possible configurations
	// *NOTE: Respect order.
	// public Triangle(double angle, Line side, double differenceOfOtherSides) {
		// Validate
	// }

	// 2 sides, angle between provided sides - 6 possible configurations
	// public Triangle(Line sideA, Line sideB, double angleA) {
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
		//
	// }

	// public boolean isValidTriangle(Angle angleA, Angle angleB, Angle angleC) {
		//
	// }

	// public boolean isValidTriangle(Line side, double angle, double sumOfOtherSides) {
		//
	// }

	// public boolean isValidTriangle (double angle, Line side, double differenceOfOtherSides) {
		//
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


	// 12/19 - LIST ALL VARIATIONS
	// START: Calculations
	// public double calculateSideLength(double firstAngle, double secondAngle) {
		// Does Line have a method for this?
	// }

	// public double calculateAngle
	// END: Calculations


	//
	// END: Methods 
	//
}