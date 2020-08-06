
package com.prateek.assignment.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.prateek.assignment.Animal;

/**
 * This class is Unit test of Animal
 */
@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {

	@Mock
	Animal animal;

	@Before
	public void init(){
		animal = Mockito.spy(new Animal()); 
	}

	@Test
	public void walk() {
		Mockito.doNothing().when(animal).walk();
	}
}