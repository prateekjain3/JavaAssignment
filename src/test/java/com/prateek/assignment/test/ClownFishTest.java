
package com.prateek.assignment.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.prateek.assignment.ClownFish;

/**
 * This class is Unit test of ClownFish
 */
@RunWith(MockitoJUnitRunner.class)
public class ClownFishTest {

	@Mock
	ClownFish clownfish;

	@Before
	public void init(){
		clownfish = Mockito.spy(new ClownFish());
	}

	@Test
	public void bodyColorTest() {
		Mockito.doNothing().when(clownfish).bodyColor();
	}

	@Test
	public void habitTest() {
		Mockito.doNothing().when(clownfish).habit();
	}

	@Test
	public void bodyTypeTest() {
		Mockito.doNothing().when(clownfish).bodyType();
	}
}