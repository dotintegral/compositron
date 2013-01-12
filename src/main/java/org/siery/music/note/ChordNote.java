package org.siery.music.note;

import org.siery.music.chord.Chord;

public class ChordNote extends Chord implements Note {

	protected float duration;
	
	public ChordNote(Chord chord, float duration) {
		this.duration = duration;
		this.tones = chord.getTones();
	}
	
	@Override
	public float getDuration() {
		return duration;
	}

}
