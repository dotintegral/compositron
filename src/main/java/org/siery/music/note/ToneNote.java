package org.siery.music.note;

import org.siery.music.pitch.Octave;
import org.siery.music.pitch.Pitch;
import org.siery.music.pitch.Tone;

public class ToneNote extends Tone implements Note {

	protected float duration;

	public ToneNote(Tone tone, float duration) {
		super(tone.getPitch(), tone.getOctave());
		this.duration = duration;
	}
	
	public ToneNote(Pitch pitch, Octave octave, float duration) {
		super(pitch, octave);
		this.duration = duration;
	}
	
	@Override
	public float getDuration() {
		return duration;
	}

}
