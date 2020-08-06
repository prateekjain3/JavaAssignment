
package com.prateek.assignment.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.prateek.assignment.Caterpillar;

/**
 * This class is Unit test of Caterpillar
 */
@RunWith(MockitoJUnitRunner.class)
public class CaterpillarTest {

	@Mock
	Caterpillar caterpillar; 

	@Before
	public void init(){
		caterpillar = Mockito.spy(new Caterpillar());
	}

	@Test
	public void canWalkTest() {
		Mockito.doNothing().when(caterpillar).canWalk();
	}
}