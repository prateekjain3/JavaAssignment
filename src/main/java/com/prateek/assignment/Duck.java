
package com.prateek.assignment;

import com.prateek.constant.SoundConstant;
import com.prateek.inter.ISwimable;

/**
 * This class represents Duck attributes 
 * that extends attributes of Bird and
 * implements Swimable
 */
public class Duck extends Bird implements ISwimable{

	/**
	 * This is constructor invoking bird class's
	 * parameterized constructor with it's own sound.
	 */
	public Duck() {
		super(SoundConstant.DUCK_SOUND.getSound());
	}

	/**
	 * This represents swim state of Chicken.
	 */
	@Override
	public void canSwim() {
		System.out.println("Duck : I can swim");
	}
}