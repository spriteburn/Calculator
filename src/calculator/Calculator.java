package calculator;

public class Calculator {

	public int add(int i, int j) {
		return i + j;
	}

	public int multiply(int i, int j) {
		return i * j;
	}

	public int subtract(int i, int j) {
		return i - j;
	}

	public int average(int i, int j) {
		return (i + j) / 2;
	}

	public double power(double i, double j) {
		double power = 1;
		for (int k = 0; k < j; k++) {
			power *= i;
		}
		return power;
	}

	public double factorial(double i) {
		double factorial = 1;
		for (double k = i; k > 0; k--) {
			factorial *= k;
		}

		return factorial;
	}

}