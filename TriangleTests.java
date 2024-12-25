/*
* The TriangleTest class contains Triangle's unit tests.
*/

// NOTE: Can I access Triangle.java?
// UPDATE: Incorporate new changes.

// package Trigonometry.triangle;
// import triangle.*;
// import triangle;

public class TriangleTest {
	// Default constructor unit tests
	public static boolean createsDefaultTriangleConstructor() {
		try {
		Triangle testObject = new Triangle();

		System.out.println(testObject.getSideAlength());
		System.out.println(testObject.getSideBlength()); // FAIL due to double rounding
		System.out.println(testObject.getSideClength()); // FAIL due to double rounding

		if(
			testObject.getSideAendpoint1()[0] == 0.0 &&
			testObject.getSideAendpoint1()[1] == 0.0 &&
			testObject.getSideAendpoint2()[0] == 1.0 &&
			testObject.getSideAendpoint2()[1] == 0.0 &&
			testObject.getSideBendpoint1()[1] == 0.0 &&
			testObject.getSideBendpoint1()[1] == 0.0 &&
			testObject.getSideBendpoint2()[0] == 0.5 &&
			testObject.getSideBendpoint2()[1] == Math.sqrt(3)/2 &&
			testObject.getSideCendpoint1()[0] == 1.0 &&
			testObject.getSideCendpoint1()[1] == 0.0 &&
			testObject.getSideCendpoint2()[0] == 0.5 &&
			testObject.getSideCendpoint2()[1] == Math.sqrt(3)/2 &&
			testObject.getSideAlength() == 1.0 &&
			testObject.getSideBlength() == 1.0 &&
			testObject.getSideClength() == 1.0 &&
			testObject.getAngleA() == Math.PI / 3 &&
			testObject.getAngleB() == Math.PI / 3 &&
			testObject.getAngleC() == Math.PI / 3 &&
			testObject.getTriangleType().equals("equalateral") &&
			testObject.getAngleType().equals("radians")
		) {
			return true;
		}

		return false;
		} catch (Exception error) {
			// System.out.println("Default constructor does not create Triangle object.");
			throw new IllegalArgumentException("Default constructor does not create Triangle object.");
		}
	}

	public static void main(String[] args) {
		System.out.println("Creates default triangle constructor: " + createsDefaultTriangleConstructor());
	}
}