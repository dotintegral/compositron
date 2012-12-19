package org.siery.music.pitch;

public class Tone {
	
	private Pitch note;
	private Octave octave;
	
	public Tone(Pitch note, Octave octave) {
		this.note = note;
		this.octave = octave;
	}
	
	public int getMidiNote() {
		return 24 + (octave.getValue()-1)*12 + note.getInterval();
	}
}
