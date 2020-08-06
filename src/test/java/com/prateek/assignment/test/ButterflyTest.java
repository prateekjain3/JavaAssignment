
package com.prateek.assignment.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.prateek.assignment.Butterfly;

/**
 * This class is Unit test of Butterfly
 */
@RunWith(MockitoJUnitRunner.class)
public class ButterflyTest {

	@Mock
	Butterfly butterfly; 

	@Before
	public void init(){
		butterfly = Mockito.spy(new Butterfly()); 
	}

	@Test
	public void canFlyTest() {
		Mockito.doNothing().when(butterfly).canFly();
	}
}