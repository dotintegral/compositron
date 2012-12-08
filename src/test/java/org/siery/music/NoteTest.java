package org.siery.music;

import static org.junit.Assert.*;
import org.junit.Test;

public class NoteTest {

	@Test
	public void test() {
		assertEquals(0, Note.C.getInterval());
		assertEquals(4, Note.E.getInterval());
		assertEquals(11, Note.B.getInterval());
	}

}
