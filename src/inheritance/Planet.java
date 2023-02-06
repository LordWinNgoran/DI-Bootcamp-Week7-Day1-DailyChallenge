//Daily Challenge : Single Inheritance
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:In this exercise, you will implement single inheritance,
* create a base class with a method and
* then inherit the created base class into the derived class using the “extends” keyword.
* Then access the inherited method from the derived class object.
*/
package inheritance;

public class Planet {

	private String namePlanet;
	private double dimension;
	public Planet() {
		super();
	}
	public Planet(String namePlanet, double dimension) {
		super();
		this.namePlanet = namePlanet;
		this.dimension = dimension;
	}
	public String ShowPlanet() {
		return "Planet [namePlanet=" + namePlanet + ", dimension=" + dimension + "]";
	}
	
	
	
}
