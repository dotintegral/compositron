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
	
	@Test
	public void testGetChordNotes() throws NotInScaleException {
		NaturalMinorScale aMinor = new NaturalMinorScale(Note.A);
		
		List<Note> aChord = aMinor.getChordNotes(Note.A);
		assertEquals(Note.A, aChord.get(0));
		assertTrue( aChord.contains(Note.C) );
		assertTrue( aChord.contains(Note.E) );

		List<Note> fChord = aMinor.getChordNotes(Note.F);
		assertEquals(Note.F, fChord.get(0));
		assertTrue( fChord.contains(Note.A) );
		assertTrue( fChord.contains(Note.C) );
	}
	
	@Test(expected=NotInScaleException.class)
	public void testGetChordNotesThrowsNotInScaleException () throws NotInScaleException {

		NaturalMinorScale aMinor = new NaturalMinorScale(Note.A);
		List<Note> chord = aMinor.getChordNotes(Note.As);
	}

}
