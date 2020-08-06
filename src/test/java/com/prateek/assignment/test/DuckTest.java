
package com.prateek.assignment.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.prateek.assignment.Duck;

/**
 * This class is Unit test of Duck
 */
@RunWith(MockitoJUnitRunner.class)
public class DuckTest {

	@Mock
	Duck duck;

	@Before
	public void init(){
		duck = Mockito.spy(new Duck());
	}

	@Test
	public void swim() {
		Mockito.doNothing().when(duck).canSwim();
	}
}