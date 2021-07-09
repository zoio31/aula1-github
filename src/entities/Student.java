package entities;

public class Student {
	
	public String name;
	public double a;
	public double b;
	public double c;
	public double result;
	
	public double note() {
		result = a + b + c;
		
		if(result >= 60.0) {
			System.out.println("Final grade: " + result);
			System.out.println("PASSED");
		}else {
			System.out.println("Final grade: " + result);
			System.out.println("FAILED");
			System.out.println("MISSING: " + (60.0 - result) + " POINTS.");
		}
		return 0;
	}
}
