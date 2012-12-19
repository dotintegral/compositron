package org.siery.music.scale;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.siery.music.pitch.Pitch;

public class NaturalMinorScaleTest {

	@Test
	public void testGetScalePitches() {
		NaturalMinorScale aMinor = new NaturalMinorScale(Pitch.A);
		
		List<Pitch> notes = aMinor.getScalePitches();
		
		assertEquals(7, notes.size());
		assertEquals(Pitch.A, notes.get(0));
		assertEquals(Pitch.B, notes.get(1));
		assertEquals(Pitch.C, notes.get(2));
		assertEquals(Pitch.D, notes.get(3));
		assertEquals(Pitch.E, notes.get(4));
		assertEquals(Pitch.F, notes.get(5));
		assertEquals(Pitch.G, notes.get(6));
	}
	
	@Test
	public void testGetChordPitches() throws NotInScaleException {
		NaturalMinorScale aMinor = new NaturalMinorScale(Pitch.A);
		
		List<Pitch> aChord = aMinor.getChordPitches(Pitch.A);
		assertEquals(Pitch.A, aChord.get(0));
		assertTrue( aChord.contains(Pitch.C) );
		assertTrue( aChord.contains(Pitch.E) );

		List<Pitch> fChord = aMinor.getChordPitches(Pitch.F);
		assertEquals(Pitch.F, fChord.get(0));
		assertTrue( fChord.contains(Pitch.A) );
		assertTrue( fChord.contains(Pitch.C) );
	}
	
	@Test(expected=NotInScaleException.class)
	public void testGetChordPitchesThrowsNotInScaleException () throws NotInScaleException {

		NaturalMinorScale aMinor = new NaturalMinorScale(Pitch.A);
		List<Pitch> chord = aMinor.getChordPitches(Pitch.As);
	}

}
