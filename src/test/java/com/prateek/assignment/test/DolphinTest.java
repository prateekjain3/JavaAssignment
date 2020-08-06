
package com.prateek.assignment.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.prateek.assignment.Dolphin;

/**
 * This class is Unit test of Dolphin
 */
@RunWith(MockitoJUnitRunner.class)
public class DolphinTest {

	@Mock
	Dolphin dolphin;

	@Before
	public void init(){
		dolphin = Mockito.spy(new Dolphin());
	}

	@Test
	public void canSwimTest() {
		Mockito.doNothing().when(dolphin).canSwim();
	}
}