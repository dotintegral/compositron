package org.siery.music.scale;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;
import org.siery.music.pitch.Pitch;

public class NaturalMajorScaleTest {

	@Test
	public void testGetScalePitches() {
		NaturalMajorScale cMajor = new NaturalMajorScale(Pitch.C);
		
		List<Pitch> notes = cMajor.getScalePitches();
		
		assertEquals(7, notes.size());
		assertEquals(Pitch.C, notes.get(0));
		assertEquals(Pitch.D, notes.get(1));
		assertEquals(Pitch.E, notes.get(2));
		assertEquals(Pitch.F, notes.get(3));
		assertEquals(Pitch.G, notes.get(4));
		assertEquals(Pitch.A, notes.get(5));
		assertEquals(Pitch.B, notes.get(6));
	}
	
	@Test
	public void testGetChordPitches() throws NotInScaleException {
		NaturalMajorScale cMajor = new NaturalMajorScale(Pitch.C);
		
		List<Pitch> eChord = cMajor.getChordPitches(Pitch.C);
		assertEquals(Pitch.C, eChord.get(0));
		assertTrue( eChord.contains(Pitch.E) );
		assertTrue( eChord.contains(Pitch.G) );

		List<Pitch> aChord = cMajor.getChordPitches(Pitch.A);
		assertEquals(Pitch.A, aChord.get(0));
		assertTrue( aChord.contains(Pitch.C) );
		assertTrue( aChord.contains(Pitch.E) );
	}
	
	@Test(expected=NotInScaleException.class)
	public void testGetChordPitchesThrowsNotInScaleException () throws NotInScaleException {

		NaturalMajorScale cMajor = new NaturalMajorScale(Pitch.C);
		List<Pitch> chord = cMajor.getChordPitches(Pitch.Fs);
	}
}
