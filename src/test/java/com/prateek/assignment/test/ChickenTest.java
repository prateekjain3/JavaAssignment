
package com.prateek.assignment.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.prateek.assignment.Chicken;

/**
 * This class is Unit test of Chicken
 */
@RunWith(MockitoJUnitRunner.class)
public class ChickenTest {

	@Mock
	Chicken chicken;

	@Before
	public void init(){
		chicken = Mockito.spy(new Chicken());
	}

	@Test
	public void canFly() {
		Mockito.doNothing().when(chicken).canFly();
	}
}