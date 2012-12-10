package org.siery.music.scale;

import org.siery.music.pitch.Note;

public class NaturalMajorScale extends Scale {

	public NaturalMajorScale(Note note) {
		super(note);
		
		intervals.add(new Integer(0));
		intervals.add(new Integer(2));
		intervals.add(new Integer(4));
		intervals.add(new Integer(5));
		intervals.add(new Integer(7));
		intervals.add(new Integer(9));
		intervals.add(new Integer(11));
	}
}
