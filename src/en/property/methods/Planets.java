package en.property.methods;

public enum Planets {
	Mercury("��������" ,3.303e+23, 2.4397e6),
	Venus("������" ,4.869e+24, 6.0518e6),
	Earth("�����" ,5.976e+24, 6.37814e6),
	Mars("����" ,6.421e+23, 3.3972e6),
	Jupiter("������" ,1.9e+27, 7.1492e7),
	Saturn("������" ,5.688e+26, 6.0268e7),
	Uranus("����" ,8.686e+25, 2.559e7),
	Neptune("������" ,1.024e+26, 2.4746e7);
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
