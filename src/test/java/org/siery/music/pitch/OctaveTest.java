package org.siery.music.pitch;

import static org.junit.Assert.*;

import org.junit.Test;
import org.siery.music.pitch.Octave;

public class OctaveTest {

	@Test
	public void test() {
		assertEquals(1, Octave._1.getValue());
		assertEquals(7, Octave._7.getValue());
	}

}
