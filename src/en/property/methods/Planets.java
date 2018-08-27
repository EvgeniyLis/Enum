package en.property.methods;

public enum Planets {
	Mercury("Меркурий" ,3.303e+23, 2.4397e6),
	Venus("Венера" ,4.869e+24, 6.0518e6),
	Earth("Земля" ,5.976e+24, 6.37814e6),
	Mars("Марс" ,6.421e+23, 3.3972e6),
	Jupiter("Юпитер" ,1.9e+27, 7.1492e7),
	Saturn("Сатурн" ,5.688e+26, 6.0268e7),
	Uranus("Уран" ,8.686e+25, 2.559e7),
	Neptune("Нептун" ,1.024e+26, 2.4746e7);
	final String name;
	final double mass;
	final double radius;
	private Planets(String name, double mass, double radius) {
		this.name = name;
		this.mass = mass;
		this.radius = radius;
	}
	public String getName() {
		return name;
	}
	public double getMass() {
		return mass;
	}
	public double getRadius() {
		return radius;
	}
	static final double J=6.67e-11;
	
	public double getSurfaceGravity() {
		return J*mass/(radius*radius);
	}
	
	public double getSurfaceWeight(double humanMass) {
		return humanMass*getSurfaceGravity();
	}
}
