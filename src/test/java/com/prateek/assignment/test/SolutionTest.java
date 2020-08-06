
package com.prateek.assignment.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.prateek.assignment.Animal;
import com.prateek.assignment.Bird;

/**
 * This class is Unit test of Solution
 */
@RunWith(MockitoJUnitRunner.class)
public class SolutionTest {

	@Mock
	Animal animal;

	@Mock
	Bird bird;

	@Before
	public void init(){
		animal = Mockito.spy(new Animal()); 
		bird = Mockito.spy(new Bird(null));
	}

	@Test
	public void walk() {
		Mockito.doNothing().when(animal).walk();
		Mockito.doNothing().when(bird).walk();
	}

	@Test
	public void fly() {
		Mockito.doNothing().when(bird).fly();
	}

	@Test
	public void sing() {
		Mockito.doNothing().when(bird).sing();
	}
}