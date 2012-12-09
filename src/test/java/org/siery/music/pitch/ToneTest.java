package org.siery.music.pitch;

import static org.junit.Assert.*;

import org.junit.Test;
import org.siery.music.pitch.Note;
import org.siery.music.pitch.Octave;
import org.siery.music.pitch.Tone;

public class ToneTest {

	@Test
	public void test() {
		Tone c1Tone = new Tone(Note.C, Octave._1);
		assertEquals(24, c1Tone.getMidiNote());

		Tone a4Tone = new Tone(Note.A, Octave._4);
		assertEquals(69, a4Tone.getMidiNote());

		Tone b7Tone = new Tone(Note.B, Octave._7);
		assertEquals(107, b7Tone.getMidiNote());
	}

}
