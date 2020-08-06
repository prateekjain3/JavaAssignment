
package com.prateek.assignment.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.prateek.assignment.Parrot;

/**
 * This class is Unit test of Parrot
 */
@RunWith(MockitoJUnitRunner.class)
public class ParrotTest {

	@Mock
	Parrot parrot;

	@Before
	public void init(){
		parrot = Mockito.spy(new Parrot());
	}

	@Test
	public void canFly() {
		Mockito.doNothing().when(parrot).canFly();
	}

	@Test
	public void neighborName1() {
		Mockito.doNothing().when(parrot).neighborName("DOG");
	}

	@Test
	public void neighborName2() {
		Mockito.doNothing().when(parrot).neighborName("CAT");
	}

	@Test
	public void neighborName3() {
		Mockito.doNothing().when(parrot).neighborName("ROOSTER");
	}

	@Test
	public void neighborName4() {
		Mockito.doNothing().when(parrot).neighborName("NONAME");
	}
}