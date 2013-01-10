package org.siery.music.pitch;

import static org.junit.Assert.*;
import org.junit.Test;
import org.siery.music.pitch.Pitch;

public class PitchTest {

	@Test
	public void test() {
		assertEquals(0, Pitch.C.getInterval());
		assertEquals(4, Pitch.E.getInterval());
		assertEquals(11, Pitch.B.getInterval());
	}
	
	@Test
	public void testIncrementBy() {
		assertEquals(Pitch.C, Pitch.C.incrementBy(0));
		assertEquals(Pitch.C, Pitch.C.incrementBy(12));
		assertEquals(Pitch.C, Pitch.C.incrementBy(-12));
		
		assertEquals(Pitch.A, Pitch.C.incrementBy(9));
		assertEquals(Pitch.C, Pitch.A.incrementBy(-9));
		assertEquals(Pitch.A, Pitch.C.incrementBy(-3));
		
		assertEquals(Pitch.E, Pitch.A.incrementBy(7));
		assertEquals(Pitch.A, Pitch.E.incrementBy(-7));
		assertEquals(Pitch.E, Pitch.A.incrementBy(-5));
	}
	
	@Test
	public void testGetIntervalDifference() {
		assertEquals(2, Pitch.C.getIntervalTo(Pitch.D));
		assertEquals(10, Pitch.D.getIntervalTo(Pitch.C));
		assertEquals(4, Pitch.F.getIntervalTo(Pitch.A));
		assertEquals(8, Pitch.A.getIntervalTo(Pitch.F));
	}

}
