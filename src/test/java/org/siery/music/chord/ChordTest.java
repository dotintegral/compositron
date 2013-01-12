package org.siery.music.chord;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.siery.music.pitch.Octave;
import org.siery.music.pitch.Pitch;
import org.siery.music.pitch.Tone;

public class ChordTest {

	@Test
	public void testCheckType() {
		
		Chord Amin = Chord.fromList(new ArrayList<Tone>(){{
			add(new Tone(Pitch.A, Octave._4) );
			add(new Tone(Pitch.C, Octave._4));
			add(new Tone(Pitch.E, Octave._4));
		}});
		assertEquals(ChordType.MINOR, Amin.getType());
		
		Chord Dmin = Chord.fromList(new ArrayList<Tone>(){{
			add(new Tone(Pitch.D, Octave._4));
			add(new Tone(Pitch.F, Octave._4));
			add(new Tone(Pitch.A, Octave._4));
		}});
		assertEquals(ChordType.MINOR, Dmin.getType());
		
		Chord Cmaj = Chord.fromList(new ArrayList<Tone>(){{
			add(new Tone(Pitch.C, Octave._4));
			add(new Tone(Pitch.E, Octave._4));
			add(new Tone(Pitch.G, Octave._4));
		}});
		assertEquals(ChordType.MAJOR, Cmaj.getType());

		Chord Fmaj = Chord.fromList(new ArrayList<Tone>(){{
			add(new Tone(Pitch.F, Octave._4));
			add(new Tone(Pitch.A, Octave._4));
			add(new Tone(Pitch.C, Octave._4));
		}});
		assertEquals(ChordType.MAJOR, Fmaj.getType());

		Chord Bdim = Chord.fromList(new ArrayList<Tone>(){{
			add(new Tone(Pitch.B, Octave._4));
			add(new Tone(Pitch.D, Octave._4));
			add(new Tone(Pitch.F, Octave._4));
		}});
		assertEquals(ChordType.DIMINISHED, Bdim.getType());

	}

}
