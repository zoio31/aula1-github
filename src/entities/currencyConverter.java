package entities;

public class currencyConverter {
	
	public static double dollar;
	public static double bought;
	public static double IOF = 6.0/100;
	
	public static double convert() {
		double value = dollar * bought;
		return value += value * IOF;
	}
}
