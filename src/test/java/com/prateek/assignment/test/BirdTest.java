
package com.prateek.assignment.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.prateek.assignment.Bird;

/**
 * This class is Unit test of Bird
 */
@RunWith(MockitoJUnitRunner.class)
public class BirdTest {

	@Mock
	Bird bird;

	@Before
	public void init(){
		bird = Mockito.spy(new Bird());
	}

	@Test
	public void walk() {
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