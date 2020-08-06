
package com.prateek.assignment.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.prateek.assignment.UniqueAnimal;

/**
 * This class is Unit test of UniqueAnimal
 */
@RunWith(MockitoJUnitRunner.class)
public class UniqueAnimalTest {

	@Mock
	UniqueAnimal uniqueAnimal; 

	@Before
	public void init(){
		uniqueAnimal = Mockito.spy(new UniqueAnimal());
	}

	@Test
	public void canSoundTest() {
		Mockito.doNothing().when(uniqueAnimal).canSound();
	}

	@Test
	public void canWalkTest() {
		Mockito.doNothing().when(uniqueAnimal).canWalk();
	}

	@Test
	public void canFlyTest() {
		Mockito.doNothing().when(uniqueAnimal).canFly();
	}
}