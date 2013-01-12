package org.siery.music.pitch;

public class Tone {
	
	protected Pitch pitch;
	protected Octave octave;
	
	public Tone(Pitch pitch, Octave octave) {
		this.pitch = pitch;
		this.octave = octave;
	}
	
	public Pitch getPitch() {
		return pitch;
	}
	
	public Octave getOctave() {
		return octave;
	}
	
	public int getMidiNote() {
		return 24 + (octave.getValue()-1)*12 + pitch.getInterval();
	}
}
