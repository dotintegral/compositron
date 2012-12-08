package org.siery.music;

import static org.junit.Assert.*;

import org.junit.Test;

public class OctaveTest {

	@Test
	public void test() {
		assertEquals(1, Octave._1.getValue());
		assertEquals(7, Octave._7.getValue());
	}

}
