package en.property.methods;

public class OperationsConstant {

	public static void main(String[] args) {
		double num1=23.4;
		double num2=-21.6;
		for (Operations op : Operations.values()) {
			System.out.println("Result of operation " +op.name+" is "+op.getOperations(num1, num2));
		}
	}

}