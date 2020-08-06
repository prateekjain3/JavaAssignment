
package com.prateek.assignment;

import com.prateek.inter.ISwimable;

/**
 * This class represents Fish attributes 
 * that extends attributes of Animal and
 * implements swimable interface.
 */
public class Fish extends Animal implements ISwimable {

	@Override
	public void canSwim() {
		System.out.println("Fish : I can swim");
	}
}