package org.siery.music.chord;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.siery.music.pitch.Pitch;

public class ChordTest {

	@Test
	public void testCheckType() {
		
		Chord Amin = Chord.fromList(new ArrayList<Pitch>(){{
			add(Pitch.A);
			add(Pitch.C);
			add(Pitch.E);
		}});
		assertEquals(ChordType.MINOR, Amin.getType());
		
		Chord Dmin = Chord.fromList(new ArrayList<Pitch>(){{
			add(Pitch.D);
			add(Pitch.F);
			add(Pitch.A);
		}});
		assertEquals(ChordType.MINOR, Dmin.getType());
		
		Chord Cmaj = Chord.fromList(new ArrayList<Pitch>(){{
			add(Pitch.C);
			add(Pitch.E);
			add(Pitch.G);
		}});
		assertEquals(ChordType.MAJOR, Cmaj.getType());

		Chord Fmaj = Chord.fromList(new ArrayList<Pitch>(){{
			add(Pitch.F);
			add(Pitch.A);
			add(Pitch.C);
		}});
		assertEquals(ChordType.MAJOR, Fmaj.getType());

		Chord Bdim = Chord.fromList(new ArrayList<Pitch>(){{
			add(Pitch.B);
			add(Pitch.D);
			add(Pitch.F);
		}});
		assertEquals(ChordType.DIMINISHED, Bdim.getType());

	}

}
