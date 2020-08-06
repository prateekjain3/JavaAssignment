
package com.prateek.assignment;

import com.prateek.inter.IFishSpecialize;

/**
 * This class represents ClownFish attributes 
 * that extends attributes of Fish and
 * implements IFishSpecialize interface.
 */
public class ClownFish extends Fish implements IFishSpecialize {

	@Override
	public void bodyColor() {
		System.out.println("ClownFish : Body is colourful (orange)");
	}

	@Override
	public void habit() {
		System.out.println("ClownFish : make jokes");
	}

	@Override
	public void bodyType() {
		System.out.println("ClownFish : Body is small");
	}
}