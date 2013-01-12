package org.siery.music.pitch;

public class Tone {
	
	private Pitch pitch;
	private Octave octave;
	
	public Tone(Pitch pitch, Octave octave) {
		this.pitch = pitch;
		this.octave = octave;
	}
	
	public Pitch getPitch() {
		return pitch;
	}
	
	public int getMidiNote() {
		return 24 + (octave.getValue()-1)*12 + pitch.getInterval();
	}
}
