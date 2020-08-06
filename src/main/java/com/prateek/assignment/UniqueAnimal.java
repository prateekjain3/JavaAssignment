
package com.prateek.assignment;

import com.prateek.inter.IFlyable;
import com.prateek.inter.ISoundable;
import com.prateek.inter.IWalkable;

/**
 * This class represents UniqueAnimal attributes which implements
 * flayable, walkable & soundable interfaces.
 */
public class UniqueAnimal implements IFlyable, IWalkable, ISoundable {

	@Override
	public void canSound() {
		System.out.println("UniqueAnimal : I can sound");
	}

	@Override
	public void canWalk() {
		System.out.println("UniqueAnimal : I can walk");
	}

	@Override
	public void canFly() {
		System.out.println("UniqueAnimal : I can fly");
	}
}