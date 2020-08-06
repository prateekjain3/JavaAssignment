
package com.prateek.assignment;

import com.prateek.constant.SoundConstant;

/**
 * This is solution class for execution of main method
 */
public class Solution {
	public static void main(final String[] args) {
		final Bird bird = new Bird(SoundConstant.DEFAULT.toString());
		bird.walk();
		bird.fly();
		bird.sing();
	}
}