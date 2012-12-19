package org.siery.music.scale;

import java.util.ArrayList;
import java.util.List;

import org.siery.music.pitch.Pitch;

public abstract class Scale {
	
	protected Pitch rootNote;
	protected List<Integer> intervals;
	
	public Scale(Pitch note) {
		this.rootNote = note;
		intervals = new ArrayList<Integer>();
	}
	
	public List<Pitch> getScalePitches() {
		List<Pitch> notes = new ArrayList<Pitch>();
		
		for(Integer interval : intervals) {
			notes.add(rootNote.incrementBy(interval));
		}
		
		return notes;
	}
	
	// TODO: Create obj, eg. ChordNotes, use instead of List of Notes
	public List<Pitch> getChordPitches(Pitch root) throws NotInScaleException {
	
		List<Pitch> scaleNotes = getScalePitches();
		
		if(!scaleNotes.contains(root)) {
			throw new NotInScaleException();
		}

		int rootNoteIndex = scaleNotes.indexOf(root);
		int scaleSize = scaleNotes.size();
		
		List<Pitch> chordNotes = new ArrayList<Pitch>();
		chordNotes.add(scaleNotes.get(rootNoteIndex));
		chordNotes.add(scaleNotes.get( (rootNoteIndex+2) % scaleSize ));
		chordNotes.add(scaleNotes.get( (rootNoteIndex+4) % scaleSize ));
		
		return chordNotes;
	}
}
