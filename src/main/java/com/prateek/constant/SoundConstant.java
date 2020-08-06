
package com.prateek.constant;

public enum SoundConstant {

	DUCK_SOUND("Quack, quack"),
	CHICKEN_SOUND("Cluck, cluck"),
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