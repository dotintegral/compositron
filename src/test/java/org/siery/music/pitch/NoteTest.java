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

}
