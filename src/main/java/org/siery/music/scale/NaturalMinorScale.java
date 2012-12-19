package org.siery.music.scale;

import java.util.List;

import org.siery.music.pitch.Pitch;

public class NaturalMinorScale extends Scale {

	public NaturalMinorScale(Pitch note) {
		super(note);
		
		intervals.add(new Integer(0));
		intervals.add(new Integer(2));
		intervals.add(new Integer(3));
		intervals.add(new Integer(5));
		intervals.add(new Integer(7));
		intervals.add(new Integer(8));
		intervals.add(new Integer(10));
	}

}
