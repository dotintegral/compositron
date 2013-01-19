package org.siery.music.note;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.siery.music.chord.Chord;
import org.siery.music.chord.ChordType;
import org.siery.music.pitch.Octave;
import org.siery.music.pitch.Pitch;
import org.siery.music.pitch.Tone;

public class ChordNoteTest {

	@Test
	public void testChordNote() {
			
		Chord Amin = Chord.fromList(new ArrayList<Tone>(){{
			add(new Tone(Pitch.A, Octave._4) );
			add(new Tone(Pitch.C, Octave._4));
			add(new Tone(Pitch.E, Octave._4));
		}});
		
		ChordNote AminNote = new ChordNote(Amin, 1./4.);
		
		assertEquals(ChordType.MINOR, AminNote.getType());
		

		if( Math.abs(1./4. - AminNote.getDuration()) > 0.001 ) {
			fail();
		}
	}

}
