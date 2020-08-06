
package com.prateek.assignment.logic.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.prateek.assignment.Animal;
import com.prateek.assignment.Bird;
import com.prateek.assignment.Chicken;
import com.prateek.assignment.ClownFish;
import com.prateek.assignment.Dolphin;
import com.prateek.assignment.Duck;
import com.prateek.assignment.Fish;
import com.prateek.assignment.Parrot;
import com.prateek.assignment.Rooster;
import com.prateek.assignment.Shark;
import com.prateek.assignment.logic.CountAnimal;
import com.prateek.constant.SoundConstant;

/**
 * This class is Unit test of CountAnimal
 */
@RunWith(MockitoJUnitRunner.class)
public class CountAnimalTest {

	@Mock
	CountAnimal countAnimal;

	@Before
	public void init(){
		countAnimal = Mockito.spy(new CountAnimal()); 
	}

	@Test
	public void logicCountAnimalTest() {
		final Animal[] animalArr = new Animal[]{
				new Bird(SoundConstant.DEFAULT.getSound()),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new ClownFish(),
				new Dolphin()
		};
		Mockito.doNothing().when(countAnimal).logicCountAnimal(animalArr);
	}
}