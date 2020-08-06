
package com.prateek.assignment.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.prateek.assignment.Rooster;

/**
 * This class is Unit test of Rooster
 */
@RunWith(MockitoJUnitRunner.class)
public class RoosterTest {

	@Mock
	Rooster rooster;

	@Before
	public void init(){
		rooster = Mockito.spy(new Rooster());
	}

	@Test
	public void canFly() {
		Mockito.doNothing().when(rooster).canFly();
	}
}