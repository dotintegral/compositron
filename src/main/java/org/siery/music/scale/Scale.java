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
	
	// TODO: Create obj, eg. ChordNotes, use instead of List of Notes
	public List<Note> getChordNotes(Note root) throws NotInScaleException {
	
		List<Note> scaleNotes = getScaleNotes();
		
		if(!scaleNotes.contains(root)) {
			throw new NotInScaleException();
		}

		int rootNoteIndex = scaleNotes.indexOf(root);
		int scaleSize = scaleNotes.size();
		
		List<Note> chordNotes = new ArrayList<Note>();
		chordNotes.add(scaleNotes.get(rootNoteIndex));
		chordNotes.add(scaleNotes.get( (rootNoteIndex+2) % scaleSize ));
		chordNotes.add(scaleNotes.get( (rootNoteIndex+4) % scaleSize ));
		
		return chordNotes;
	}
}
