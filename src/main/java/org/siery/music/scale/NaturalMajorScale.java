package org.siery.music.scale;

import org.siery.music.pitch.Pitch;

public class NaturalMajorScale extends Scale {

	public NaturalMajorScale(Pitch note) {
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
