
package com.prateek.assignment;

import com.prateek.constant.SoundConstant;

/**
 * This class represents Rooster attributes 
 * that extends attributes of Chicken.
 */
public class Rooster extends Chicken {

	/**
	 * This is constructor invoking Chicken class's
	 * parameterized constructor with it's own sound.
	 */
	public Rooster(){
		super(SoundConstant.ROOSTER_SOUND.getSound());
	}

	/**
	 * This represents fly state of Rooster.
	 */
	@Override
	public void canFly() {
		System.out.println("Rooster : I cannot fly");
	}
}