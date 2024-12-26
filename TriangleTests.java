/*
* The TriangleTests class contains Triangle's unit tests.
* Tests will be written "by hand" for this project.
*/

public class TriangleTests {
	// Default constructor unit tests
	public static boolean createsDefaultTriangleConstructor() {
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
			testObject.getSideBendpoint2()[1] == Math.sqrt(3)/2 &&
			testObject.getSideCendpoint1()[0] == 1.0 &&
			testObject.getSideCendpoint1()[1] == 0.0 &&
			testObject.getSideCendpoint2()[0] == 0.5 &&
			testObject.getSideCendpoint2()[1] == Math.sqrt(3)/2 &&
			(testObject.getSideAlength() == 1.0 || testObject.getSideAlength() == 0.9999999999999999) &&
			(testObject.getSideBlength() == 1.0 || testObject.getSideBlength() == 0.9999999999999999) &&
			(testObject.getSideClength() == 1.0 || testObject.getSideBlength() == 0.9999999999999999) &&
			testObject.getAngleA() == Math.PI / 3 &&
			testObject.getAngleB() == Math.PI / 3 &&
			testObject.getAngleC() == Math.PI / 3 &&
			testObject.getTriangleType().equals("equilateral") &&
			testObject.getAngleType().equals("radians")
		) {
			return true;
		}

		return false;
	}


	// Test Runner
	public static void main(String[] args) {
		System.out.println("Creates default triangle constructor: " + createsDefaultTriangleConstructor());
	}
}