package org.siery.music.note;

import org.siery.music.chord.Chord;

public class ChordNote extends Chord implements Note {

	protected double duration;
	
	public ChordNote(Chord chord, double duration) {
		this.duration = duration;
		this.tones = chord.getTones();
	}
	
	@Override
	public double getDuration() {
		return duration;
	}

	@Override
	public void setDuration(double duration) {
		this.duration = duration;
	}

}
