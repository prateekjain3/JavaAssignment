
package com.prateek.assignment;

import com.prateek.inter.ISwimable;

/**
 * This class represents Dolphin attributes 
 * that extends attributes of Animal and
 * implements ISwimable interface.
 */
public class Dolphin extends Animal implements ISwimable {

	@Override
	public void canSwim() {
		System.out.println("Dolphin : I can swim");
	}
}