//Daily Challenge : Single Inheritance
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:In this exercise, you will implement single inheritance,
* create a base class with a method and
* then inherit the created base class into the derived class using the “extends” keyword.
* Then access the inherited method from the derived class object.
*/
package inheritance;

public class Main {
	
	
	public static void main(String[] args) {
		DerivedPlanet derivedPlanet = new DerivedPlanet("Earth",256.9, 9000000);
		System.out.println(derivedPlanet.showDerivedPlanet());
	}
	
	

}
