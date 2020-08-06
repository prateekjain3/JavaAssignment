
package com.prateek.assignment.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.prateek.assignment.Shark;

/**
 * This class is Unit test of Shark
 */
@RunWith(MockitoJUnitRunner.class)
public class SharkTest {

	@Mock
	Shark shark;

	@Before
	public void init(){
		shark = Mockito.spy(new Shark());
	}

	@Test
	public void bodyColorTest() {
		Mockito.doNothing().when(shark).bodyColor();
	}

	@Test
	public void habitTest() {
		Mockito.doNothing().when(shark).habit();
	}

	@Test
	public void bodyTypeTest() {
		Mockito.doNothing().when(shark).bodyType();
	}
}