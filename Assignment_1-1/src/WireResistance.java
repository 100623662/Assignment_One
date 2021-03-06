
/**
* @author Drew Walsh 100623662
*/
import java.util.Scanner;
import java.lang.Math;

public class WireResistance {
	public static double diameter, Diameter, Dmm, Rc, Ra,lengthM;
	static int Gauge,Gauge1;

	// Takes the write gauge and returns the corresponding wire diameter
	/**
	 * @param Gauge
	 * @return returns Diameter in meters
	 */
	public static double computeDiameter(int Gauge) {
		
		// Diameter in millimeters
		double Dmm = 0.127 *Math.pow(92.0,((36.0-Gauge)/39.0));
		
		// diameter in meters
		Diameter = Dmm / 1000;
		
		return (double) Diameter;
	}
	
	/**
	 * @param length Length in inches
	 * @return Length in meters
	 */
	public static double Lengthmeters(double length){
		
		//Length from inches to meters
		lengthM = length*0.0254;
		return (double) lengthM;
	}

	// Takes the length and gauge of a piece of copper wire and returns the
	// resistance of that wire.
	/**
	 * @param lengthM Length in meters
	 * @param Diameter Diameter in meters
	 * @return
	 */
	static public double computeCopperWireResistance(double lengthM, double Diameter) {
		Rc = (4 * lengthM * 1.678 * Math.pow(10, -8)) / (Math.PI * Diameter * Diameter);
		return (double) Rc;
	}

	// Takes the length and gauge of a piece of aluminum wire and returns the
	// resistance of that wire.
	/**
	 * @param lengthM Length in meters
	 * @param Diameter Diameter in meters
	 * @return
	 */
	static public double computeAlumWireResistance(double lengthM, double Diameter) {
		Ra = (4 * lengthM * 2.82 * Math.pow(10, -8)) / (Math.PI * Diameter * Diameter);
		return (double) Ra;
	}

	public static void main(String[] args) {
		System.out.println(
				"Enter wire gauge and length and press enter when promted to calculate resistance in a copper and aluminium wire.");
		System.out.print("Enter the wire gauge and press enter: ");
		Scanner in = new Scanner(System.in);
		int Gauge = in.nextInt();
		
	while(Gauge<0||!(Gauge==(int)Gauge)){
			System.out.print("Enter the wire gauge and press enter: ");
			int Gauge1 = in.nextInt();
	}
		Gauge = Gauge1;
		Diameter = computeDiameter(Gauge);
		System.out.print("Enter the wire length in inches: ");
		double length = in.nextDouble();
		in.close();
		lengthM = Lengthmeters(length);
		Rc = computeCopperWireResistance(lengthM, Diameter);
		Ra = computeAlumWireResistance(lengthM, Diameter);
		System.out.println(
				"The resistance of a " + length + " inch piece of " + Gauge + " gauge copper wire is " + Rc + "Ohms");
		System.out.println("The resistance of a " + length + " inch piece of " + Gauge + " gauge aluminium wire is "
				+ Ra + "Ohms");

	}
}
