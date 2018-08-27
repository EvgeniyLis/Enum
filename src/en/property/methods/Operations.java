package en.property.methods;

public enum Operations {
	ADD("+"){public double getOperations(double num1, double num2) {
		return num1+num2;
	}}, SUBTR("-"){public double getOperations(double num1, double num2) {
		return num1-num2;
	}}, MULTIPLU("*"){public double getOperations(double num1, double num2) {
		return num1*num2;
	}}, DIVID("/"){public double getOperations(double num1, double num2) {
		return num1/num2;
	}};
	final String name;
	private Operations(String name) {
		this.name = name;
	}
	public abstract double getOperations(double num1, double num2);
}
