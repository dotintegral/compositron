package org.siery.music.song;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.siery.music.note.ToneNote;
import org.siery.music.pitch.Octave;
import org.siery.music.pitch.Pitch;

public class MeasureTest {

	private Measure measure;
	
	@Before
	public void setUp() throws InvalidMeasureLengthException {
		measure = new Measure();
		measure
			.add( new ToneNote(Pitch.A, Octave._4, 1./2.) )
			.add( new ToneNote(Pitch.C, Octave._5, 1./4.) );
	}
	
	@Test
	public void testGetDuration() {
		float length = measure.getDuration();
		
		if(length > 0.751 || length < 0.749) {
			fail();
		}
	}

	@Test
	public void testAdd() throws InvalidMeasureLengthException {
		measure.add(new ToneNote(Pitch.E, Octave._4, 1./4.));
	}
	
	@Test
	public void testGetNotes() {
		assertEquals(2, measure.getNotes().size());
		assertEquals(Pitch.A, ( (ToneNote)measure.getNotes().get(0)).getPitch() );
	}
	

	@Test(expected=InvalidMeasureLengthException.class)
	public void testAddThrowsInvalidMeasureLengthExceprion() throws InvalidMeasureLengthException {
		measure.add(new ToneNote(Pitch.E, Octave._4, 1./4.));
		measure.add(new ToneNote(Pitch.E, Octave._4, 1./4.));
	}

}
