package org.siery.music.note;

import org.siery.music.pitch.Octave;
import org.siery.music.pitch.Pitch;
import org.siery.music.pitch.Tone;

public class ToneNote extends Tone implements Note {

	protected double duration;

	public ToneNote(Tone tone, double duration) {
		super(tone.getPitch(), tone.getOctave());
		this.duration = duration;
	}
	
	public ToneNote(Pitch pitch, Octave octave, double duration) {
		super(pitch, octave);
		this.duration = duration;
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
