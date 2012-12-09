package org.siery.music.scale;

import java.util.ArrayList;
import java.util.List;

import org.siery.music.pitch.Note;

public abstract class Scale {
	
	protected Note rootNote;
	protected List<Integer> intervals;
	
	public Scale(Note note) {
		this.rootNote = note;
		intervals = new ArrayList<Integer>();
	}
	
	public List<Note> getScaleNotes() {
		List<Note> notes = new ArrayList<Note>();
		
		for(Integer interval : intervals) {
			notes.add(rootNote.incrementBy(interval));
		}
		
		return notes;
	}
}
