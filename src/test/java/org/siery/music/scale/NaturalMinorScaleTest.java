package org.siery.music.scale;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import org.siery.music.pitch.Note;

public class NaturalMinorScaleTest {

	@Test
	public void testGetScaleNotes() {
		NaturalMinorScale aMinor = new NaturalMinorScale(Note.A);
		
		List<Note> notes = aMinor.getScaleNotes();
		
		assertEquals(7, notes.size());
		assertEquals(Note.A, notes.get(0));
		assertEquals(Note.B, notes.get(1));
		assertEquals(Note.C, notes.get(2));
		assertEquals(Note.D, notes.get(3));
		assertEquals(Note.E, notes.get(4));
		assertEquals(Note.F, notes.get(5));
		assertEquals(Note.G, notes.get(6));
	}

}
