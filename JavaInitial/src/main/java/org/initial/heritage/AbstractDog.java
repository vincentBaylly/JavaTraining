package org.initial.heritage;

interface Dog {

	void toGetOld();

	void bark();
}

public abstract class AbstractDog implements Dog {
	// Champs
	// On met les champs en protected pour que les classes filles
	// puissent les manipuler directement
	protected int age;
	protected String color;
	
	public AbstractDog() {
		
	}
	
	// Constructeur
	// Pourra �tre utilis� par les classes filles pour initialiser les champs.
	public AbstractDog(int age, String color) {
		this.age = age;
		this.color = color;
	}

	// M�thode

	// On donne l'impl�mentation qui est commune � tous les chiens
	public void toGetOld() {
		age++;
	}

	// Cette m�thode n'est d�finie que par les classes filles
	// Elle est donc laiss�e abstract.
	public abstract void bark();

}

//public class BullDog implements Dog{
//
//protected int age;
//
//public void toGetOld() {
//	age++;
//}
//}
