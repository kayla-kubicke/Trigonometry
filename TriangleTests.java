/*
* The TriangleTests class contains Triangle's unit tests.
* Tests will be written "by hand" for this project.
*/

public class TriangleTests {
	// Default constructor unit test
	// UPDATE: Break up, clean up, remove calculateSideLength(double[] startingPoint, double[] endpoint) tests.
	public static boolean defaultConstructorCreatesTriangle() {
		Triangle testObject = new Triangle();

		if(
			testObject.getHeight() == GeneralTriangle.formatDouble(Math.sqrt(3)/2) &&
			testObject.getSideAendpoint1()[0] == 0.0 &&
			testObject.getSideAendpoint1()[1] == 0.0 &&
			testObject.getSideAendpoint2()[0] == 1.0 &&
			testObject.getSideAendpoint2()[1] == 0.0 &&
			testObject.getSideBendpoint1()[0] == 0.0 &&
			testObject.getSideBendpoint1()[1] == 0.0 &&
			testObject.getSideBendpoint2()[0] == 0.5 &&
			testObject.getSideBendpoint2()[1] == GeneralTriangle.formatDouble(Math.sqrt(3)/2) &&
			testObject.getSideCendpoint1()[0] == 1.0 &&
			testObject.getSideCendpoint1()[1] == 0.0 &&
			testObject.getSideCendpoint2()[0] == 0.5 &&
			testObject.getSideCendpoint2()[1] == GeneralTriangle.formatDouble(Math.sqrt(3)/2) &&
			testObject.getSideAlength() == 1.0 &&
			testObject.getSideBlength() == 1.0 &&
			testObject.getSideClength() == 1.0 &&
			testObject.getAngleA() == GeneralTriangle.formatDouble(Math.PI / 3) &&
			testObject.getAngleB() == GeneralTriangle.formatDouble(Math.PI / 3) &&
			testObject.getAngleC() == GeneralTriangle.formatDouble(Math.PI / 3) &&
			testObject.getTriangleTypeBySide().equals("equilateral") &&
			testObject.getAngleType().equals("radians")
		) {
			return true;
		}

		return false;
	}

	// public static boolean calculatesExpectedSideLength() {}

	// Three side lengths provided constructor unit test
	public static boolean threeSideLengthsProvidedConstructorCreatesValidTriangle() {
		Triangle testObject1 = new Triangle();
		Triangle testObject2 = new Triangle(1.0, 1.0, 1.0);

		if(
			testObject1.getHeight() == testObject2.getHeight() &&
			testObject1.getSideAendpoint1()[0] == testObject2.getSideAendpoint1()[0] &&
			testObject1.getSideAendpoint1()[1] == testObject2.getSideAendpoint1()[1] &&
			testObject1.getSideAendpoint2()[0] == testObject2.getSideAendpoint2()[0] &&
			testObject1.getSideAendpoint2()[1] == testObject2.getSideAendpoint2()[1] &&
			testObject1.getSideBendpoint1()[0] == testObject2.getSideBendpoint1()[0] &&
			testObject1.getSideBendpoint1()[1] == testObject2.getSideBendpoint1()[1] &&
			testObject1.getSideBendpoint2()[0] == testObject2.getSideBendpoint2()[0] &&
			testObject1.getSideBendpoint2()[1] == testObject2.getSideBendpoint2()[1] &&
			testObject1.getSideCendpoint1()[0] == testObject2.getSideCendpoint1()[0] &&
			testObject1.getSideCendpoint1()[1] == testObject2.getSideCendpoint1()[1] &&
			testObject1.getSideCendpoint2()[0] == testObject2.getSideCendpoint2()[0] &&
			testObject1.getSideCendpoint2()[1] == testObject2.getSideCendpoint2()[1] &&
			testObject1.getSideAlength() == testObject2.getSideAlength() &&
			testObject1.getSideBlength() == testObject2.getSideBlength() &&
			testObject1.getSideClength() == testObject2.getSideClength() &&
			testObject1.getAngleA() == testObject2.getAngleA() &&
			testObject1.getAngleB() == testObject2.getAngleB() &&
			testObject1.getAngleC() == testObject2.getAngleC() &&
			testObject1.getTriangleTypeBySide().equals(testObject2.getTriangleTypeBySide()) &&
			testObject1.getAngleType().equals(testObject2.getAngleType())
		) {
			return true;
		}

		return false;
	}

	// public static boolean threeSideLengthsProvidedConstructorDoesNotCreateInvalidTriangle() {}

	// public static boolean validatesThreeSideLengthsProvidedEquilateralTriangle() {

	// }

	// public static boolean validatesThreeSideLengthsProvidedIsoscelesTriangle() {}
	// ADD: Invalid one
	// public static boolean validatesThreeSideLengthsProvidedScaleneTriangle() {}
	// ADD: Invalid one

	// ADD: solveUnknownInformation(double sideAlength, double sideBlength, double sideClength) Test Suite

	// ADD: calculateTriangleHeight()

	// ADD: calculateAngleWithLawOfConsines(double sideLengthOppositeOfDesiredAngle, double sideLengthRemaining, double otherSideLengthRemaining) Test Suite

	// ADD: portionOfBase() Test Suite

	// Test Runner
	public static void main(String[] args) {
		System.out.println("Creates default triangle constructor: " + defaultConstructorCreatesTriangle());
		System.out.println("Creates equilateral triangle given three equal sides: " + threeSideLengthsProvidedConstructorCreatesValidTriangle());
	}
}