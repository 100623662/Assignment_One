/**
 * @author Drew Walsh 100623662
 */

public class PrintVoltageWater {

	static double R; // resistance in OHMS
	static final double Ro = 50;
	static final double K = 0.5;
	static double Vm; // voltage in V
	static final double Rs = 75;
	static final double Vs = 20;
	static int T;

	/**
	 * @param Ro
	 *            The initial Resistance at 50 ohms
	 * @param K
	 *            The constant value at 0.5
	 * @param T
	 *            The Temperature
	 * @return Returns the Resistance
	 */
	public static double GetR(double Ro, double K, int T) {
		R = Ro + (K * T);
		return R;
	}

	/**
	 * @param R
	 *            The resistance
	 * @param Rs
	 *            The initial resistance at 50 ohms
	 * @param Vs
	 *            The constant at 20 V
	 * @return Returns the Voltage
	 */
	public static double GetVm(double R, double Rs, double Vs) {
		Vm = (R / (Rs + R)) * Vs;
		return Vm;
	}

	public static void main(String[] args) {
		// output temperature and its corresponding voltage
		for (int T = 0; T < 101; T = T + 10) {
			GetR(Ro, K, T);
			GetVm(R, Rs, Vs);
			System.out.printf("%d \t %.2f\n", T, Vm);
		}
	}

}
