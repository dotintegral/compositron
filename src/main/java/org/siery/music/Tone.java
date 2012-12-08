package org.siery.music;

public class Tone {
	
	private Note note;
	private Octave octave;
	
	public Tone(Note note, Octave octave) {
		this.note = note;
		this.octave = octave;
	}
	
	public int getMidiNote() {
		return 24 + (octave.getValue()-1)*12 + note.getInterval();
	}
}
