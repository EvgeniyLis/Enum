package en.property.methods;

public enum Calculator {
	ADD{public int getResult(int num1, int num2){
		return num1+num2;
	}}, SUB{public int getResult(int num1, int num2){
		return num1-num2;
	}}, MUL{public int getResult(int num1, int num2){
		return num1*num2;
	}}, DIV{public int getResult(int num1, int num2){
		return num1/num2;
	}};
	public abstract int getResult(int num1, int num2);
}
