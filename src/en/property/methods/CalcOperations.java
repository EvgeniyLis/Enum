package en.property.methods;

public class CalcOperations {

	public static void main(String[] args) {
		Calculator calc;
		int num1=23;
		int num2=-12;
		calc=Calculator.ADD;
		System.out.println("Use FIRST Enum");
		System.out.println("Summ is "+calc.getResult(num1, num2));
		calc=Calculator.SUB;
		System.out.println("Substr is "+calc.getResult(num1, num2));
		calc=Calculator.MUL;
		System.out.println("multiplu is "+calc.getResult(num1, num2));
		calc=Calculator.DIV;
		System.out.println("Dividing is "+calc.getResult(num1, num2));
		System.out.println("Use SECOND Enum");
		CalculatorAdv calcAdv;
		calcAdv=CalculatorAdv.ADD;
		System.out.println("Summ is "+calcAdv.getResult(num1, num2));
		calcAdv=CalculatorAdv.SUB;
		System.out.println("Substr is "+calcAdv.getResult(num1, num2));
		calcAdv=CalculatorAdv.MUL;
		System.out.println("multiplu is "+calcAdv.getResult(num1, num2));
		calcAdv=CalculatorAdv.DIV;
		System.out.println("Dividing is "+calcAdv.getResult(num1, num2));
	}

}
