//Daily Challenge : Single Inheritance
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:In this exercise, you will implement single inheritance,
* create a base class with a method and
* then inherit the created base class into the derived class using the “extends” keyword.
* Then access the inherited method from the derived class object.
*/

package inheritance;

public class DerivedPlanet extends Planet {

	private Integer numberPopulation;

	public DerivedPlanet(String namePlanet, double dimension,Integer numberPopulation) {
		super(namePlanet, dimension);
		this.numberPopulation = numberPopulation;
	}

	public String showDerivedPlanet() {
		return "DerivedPlanet [numberPopulation=" + numberPopulation + ", ShowPlanet()=" + ShowPlanet()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
