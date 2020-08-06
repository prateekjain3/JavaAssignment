
package com.prateek.assignment.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.prateek.assignment.Fish;

/**
 * This class is Unit test of Fish
 */
@RunWith(MockitoJUnitRunner.class)
public class FishTest {

	@Mock
	Fish fish;

	@Before
	public void init(){
		fish = Mockito.spy(new Fish());
	}

	@Test
	public void canSwim() {
		Mockito.doNothing().when(fish).canSwim();
	}
}