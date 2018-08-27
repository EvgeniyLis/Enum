package en.property.methods;

public enum Shapes {
	RECTANGLE(23, 14){
		public double getPerim(){
				return 2*(side1+side2);
	} public double getSquare() {
		return side1*side2;
	}
	},
	ELLIPS(13, 22){
		public double getPerim(){
				return Math.PI*(side1+side2)/2;
	} public double getSquare() {
				return Math.PI*side1*side2;
	}
	};
	
	int side1;
	int side2;
	
	private Shapes(int side1, int side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	public abstract double getPerim();
	public abstract double getSquare();
	
	public static void main(String[] args) {
		Shapes shapes;
		shapes=RECTANGLE;
		System.out.println("Perimetr of rectangle is "+shapes.getPerim());
		System.out.println("Square of rectangle is "+shapes.getSquare());
		shapes=ELLIPS;
		System.out.println("Perimetr of ellips is "+shapes.getPerim());
		System.out.println("Square of ellips is "+shapes.getSquare());
	}
}
