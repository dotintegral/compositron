package org.siery.music.scale;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import org.siery.music.pitch.Note;

public class NaturalMajorScaleTest {

	@Test
	public void testGetScaleNotes() {
		NaturalMajorScale cMajor = new NaturalMajorScale(Note.C);
		
		List<Note> notes = cMajor.getScaleNotes();
		
		assertEquals(7, notes.size());
		assertEquals(Note.C, notes.get(0));
		assertEquals(Note.D, notes.get(1));
		assertEquals(Note.E, notes.get(2));
		assertEquals(Note.F, notes.get(3));
		assertEquals(Note.G, notes.get(4));
		assertEquals(Note.A, notes.get(5));
		assertEquals(Note.B, notes.get(6));
	}

}
