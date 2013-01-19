package org.siery.music.note;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.siery.music.pitch.Octave;
import org.siery.music.pitch.Pitch;
import org.siery.music.pitch.Tone;

public class ToneNoteTest {

	@Test
	public void testToneNote() {
		ToneNote toneNote = new ToneNote(Pitch.A, Octave._4, 1./4.); 
		
		assertEquals(Pitch.A, toneNote.getPitch());
		assertEquals(Octave._4, toneNote.getOctave());
		if( Math.abs(1./4. - toneNote.getDuration()) > 0.001 ) {
			fail();
		}
		
		toneNote = new ToneNote(new Tone(Pitch.C, Octave._3), 1./4.);
		
		assertEquals(Pitch.C, toneNote.getPitch());
		assertEquals(Octave._3, toneNote.getOctave());
		
		if( Math.abs(1./4. - toneNote.getDuration()) > 0.001 ) {
			fail();
		}
	}

}
