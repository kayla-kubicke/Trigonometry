/*
* The TriangleTests class contains Triangle's unit tests.
* Tests will be written "by hand" for this project.
*/

public class TriangleTests {
	// Default constructor unit tests
	// UPDATE: Break up, clean up, remove calculateSideLength(double[] startingPoint, double[] endpoint) tests.
	public static boolean defaultConstructorCreatesTriangle() {
		Triangle testObject = new Triangle();

		// Justification for side length test choices.
		// https://en.wikipedia.org/wiki/0.999...#:~:text=Despite%20common%20misconceptions%2C%200.999..,represent%20exactly%20the%20same%20number.
		if(
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

	public static boolean threeSideLengthsProvidedConstructorCreatesValidTriangle() {
		Triangle testObject1 = new Triangle();
		// Triangle testObject2 = new Triangle(1.0, 0.9999999999999999, 0.9999999999999999);//1.0, 1.0);
		Triangle testObject2 = new Triangle(1.0, 1.0, 1.0);

		// System.out.println(testObject2.getSideAlength());
		// System.out.println(testObject2.getSideBlength());
		// System.out.println(testObject2.getSideClength());
		// System.out.println(testObject2.getAngleC());
		// System.out.println(testObject1.getAngleC());
		// System.out.println(testObject2.getAngleB());
		// System.out.println(testObject2.getAngleA()); // rounding error
		// System.out.println(testObject1.getAngleA());
		// System.out.println(testObject2.getTriangleTypeBySide());

		// if(testObject1.getSideAendpoint1()[0] == testObject2.getSideAendpoint1()[0]) {
		// 	System.out.println("getSideAendpoint1[0] is fine");
		// }

		// if(testObject1.getSideAendpoint1()[1] == testObject2.getSideAendpoint1()[1]) {
		// 	System.out.println("getSideAendpoint1[1] is fine");
		// }

		// if(testObject1.getSideAendpoint2()[0] == testObject2.getSideAendpoint2()[0]) {
		// 	System.out.println("getSideAendpoint2[0] is fine");
		// }

		// if(testObject1.getSideAendpoint2()[1] == testObject2.getSideAendpoint2()[1]) {
		// 	System.out.println("getSideAendpoint2[1] is fine");
		// }


		// if(testObject1.getSideBendpoint1()[0] == testObject2.getSideBendpoint1()[0]) {
		// 	System.out.println("getSideAendpoint2[0] is fine");
		// }

		// if(testObject1.getSideBendpoint1()[1] == testObject2.getSideBendpoint1()[1]) {
		// 	System.out.println("getSideAendpoint2[1] is fine");
		// }

		// START: FAILURE (0.5 =/= 0.49999)
		if(testObject1.getSideBendpoint2()[0] == testObject2.getSideBendpoint2()[0]) {
			System.out.println("getSideAendpoint2[0] is fine");
		} else {
			System.out.println(testObject1.getSideBendpoint2()[0]);
			System.out.println(testObject2.getSideBendpoint2()[0]);

			// System.out.println(testObject2.getSideBendpoint2()[0] / 0.000001);
		}
		// END: FAILURE

		// if(testObject1.getSideBendpoint2()[1] == testObject2.getSideBendpoint2()[1]) {
		// 	System.out.println("getSideAendpoint2[1] is fine");
		// }

		// if(testObject1.getSideCendpoint1()[0] == testObject2.getSideCendpoint1()[0]) {
		// 	System.out.println("getSideAendpoint2[0] is fine");
		// }

		// if(testObject1.getSideCendpoint1()[1] == testObject2.getSideCendpoint1()[1]) {
		// 	System.out.println("getSideAendpoint2[1] is fine");
		// }

		// START: ANOTHER FAILURE (0.5 =/= 0.49999)
		if(testObject1.getSideCendpoint2()[0] == testObject2.getSideCendpoint2()[0]) {
			System.out.println("getSideAendpoint2[0] is fine");
		} else {
			System.out.println(testObject1.getSideCendpoint2()[0]);
			System.out.println(testObject2.getSideCendpoint2()[0]);
		}
		// END: ANOTHER FAILURE


		if(testObject1.equals(testObject2)) {
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