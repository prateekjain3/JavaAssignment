
package com.prateek.assignment;

import com.prateek.constant.SoundConstant;
import com.prateek.inter.IFlyable;

/**
 * This class represents Chicken attributes 
 * that extends attributes of Bird and
 * implements IFlyable
 */
public class Chicken extends Bird implements IFlyable{

	/**
	 * This is constructor invoking bird class's
	 * parameterized constructor with it's own sound.
	 */
	public Chicken() {
		super(SoundConstant.CHICKEN_SOUND.getSound());
	}

	/**
	 * This is parameterized constructor invoking bird class's
	 * parameterized constructor with sound passed as parameter.
	 */
	public Chicken(final String sound) {
		super(sound);
	}

	/**
	 * This represents fly state of Chicken.
	 */
	@Override
	public void canFly() {
		System.out.println("Chicken : I cannot fly");
	}
}