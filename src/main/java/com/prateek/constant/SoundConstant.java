
package com.prateek.constant;

public enum SoundConstant {

	DUCK_SOUND("Quack, quack"),
	CHICKEN_SOUND("Cluck, cluck"),
	ROOSTER_SOUND("Cock-a-doodle-doo"),
	PARROT_NEIGHBOR_DOG("Woof, woof"),
	PARROT_NEIGHBOR_CAT("Meow"),
	PARROT_NEIGHBOR_ROOSTER("Cock-a-doodle-doo"),
	PARROT_DEFAULT("screech"),
	DEFAULT("Chirp");

	String sound;

	SoundConstant(final String sound){
		this.sound = sound;
	}

	/**
	 * @return the value of sound
	 */
	public String getSound() {
		return sound;
	}
}