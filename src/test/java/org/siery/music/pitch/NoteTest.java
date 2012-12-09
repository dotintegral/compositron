package org.siery.music.pitch;

import static org.junit.Assert.*;
import org.junit.Test;
import org.siery.music.pitch.Note;

public class NoteTest {

	@Test
	public void test() {
		assertEquals(0, Note.C.getInterval());
		assertEquals(4, Note.E.getInterval());
		assertEquals(11, Note.B.getInterval());
	}
	
	@Test
	public void testIncrementBy() {
		assertEquals(Note.C, Note.C.incrementBy(0));
		assertEquals(Note.C, Note.C.incrementBy(12));
		assertEquals(Note.C, Note.C.incrementBy(-12));
		
		assertEquals(Note.A, Note.C.incrementBy(9));
		assertEquals(Note.C, Note.A.incrementBy(-9));
		assertEquals(Note.A, Note.C.incrementBy(-3));
		
		assertEquals(Note.E, Note.A.incrementBy(7));
		assertEquals(Note.A, Note.E.incrementBy(-7));
		assertEquals(Note.E, Note.A.incrementBy(-5));
	}

}
