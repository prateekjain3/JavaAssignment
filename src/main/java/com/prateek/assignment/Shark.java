
package com.prateek.assignment;

import com.prateek.inter.IFishSpecialize;

/**
 * This class represents Shark attributes 
 * that extends attributes of Fish and
 * implements IFishSpecialize interface.
 */
public class Shark extends Fish implements IFishSpecialize {

	@Override
	public void bodyColor() {
		System.out.println("Shark : Body is grey");
	}

	@Override
	public void habit() {
		System.out.println("Shark : eat other fish");
	}

	@Override
	public void bodyType() {
		System.out.println("Shark : Body is large");
	}
}