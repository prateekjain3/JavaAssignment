
package com.prateek.assignment;

/**
 * This class represents Bird attributes 
 * and extends attributes of Animal
 */
public class Bird extends Animal {

	/**
	 * This method represents fly behavior
	 */
	public void fly() {
		System.out.println("I am flying");
	}

	/**
	 * This method represents sing behavior
	 */
	public void sing() {
		System.out.println("I am singing");
	}

	/**
	 * This is parameterized constructor.
	 * @param sound
	 */
	public Bird(final String sound){
		System.out.println(sound);
	}
}