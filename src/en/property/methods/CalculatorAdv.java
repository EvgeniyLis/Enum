package en.property.methods;

public enum CalculatorAdv {
	ADD, SUB, MUL, DIV;
	public int getResult(int num1, int num2) {
		int res=0;
		switch (this) {
		case ADD:
			res=num1+num2;
			break;
		case SUB:
			res=num1-num2;
			break;
		case MUL:
			res=num1*num2;
			break;
		case DIV:
			res=num1/num2;
			break;

		default:
			break;
		}
		return res;
	}
}
