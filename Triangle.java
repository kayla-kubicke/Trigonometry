/*
* The GeneralTriangle interface contains skeleton methods
* for all Triangle objects.
*/
public interface GeneralTriangle {
	// Single triangle Boolean methods
	public boolean isRight();
	public boolean isAcute();
	public boolean isEquilateral();
	public boolean isObtuse();
	public boolean isIsoceles();

	// Triangle comparison Boolean method
	public boolean areSimilar(Triangle comparisonTriangle);


	// Informational (get) methods
	public double getSideLengthA();
	public double getSideLengthB();
	public double getSideLengthC();

	public double getAngleAlpha();
	public double getAngleBeta();
	public double getAngleGamma();

	public String getInformation();
	public String getUnknownInformation();
	public String getKnownInformation();

	public double getArea();
	public double getPerimeter();
}