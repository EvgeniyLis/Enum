package en.property.methods;

import java.util.Scanner;

public class PlanetOperations {

	public static void main(String[] args) {
		/*for (Planets pl : Planets.values()) {
			System.out.println(pl.getName()+ " has mass "+pl.getMass()+" and radius is "+pl.getRadius());
		}*/
		double humanMass;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your weight");
		humanMass=input.nextDouble();
		humanMass=humanMass/Planets.Earth.getSurfaceGravity();
		for (Planets pl : Planets.values()) {
			System.out.println("Your mass on planet "+pl.getName()+" is "+pl.getSurfaceWeight(humanMass)+" kg");
		}
	}

}
