package org.siery.music.scale;

import java.util.List;

import org.siery.music.pitch.Note;

public abstract class Scale {
	
	private Note rootNote;
	
	public Scale(Note note) {
		this.rootNote = note;
	}
	
	public abstract List<Note> getScaleNotes();
}
