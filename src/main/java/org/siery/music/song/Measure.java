package org.siery.music.song;

import java.util.ArrayList;
import java.util.List;

import org.siery.music.note.Note;

public class Measure {

	protected List<Note> notes;
	
	public Measure() {
		this.notes = new ArrayList<Note>();
	}
	
	public Measure add(Note note) throws InvalidMeasureLengthException {
		checkIfNoteCanBeAdded(note);
		
		notes.add(note);
		
		return this;
	}
	
	private void checkIfNoteCanBeAdded(Note note) throws InvalidMeasureLengthException {
		float totalLength = getDuration();
		totalLength += note.getDuration();

		checkTotalLenght(totalLength);
	}
	
	private void checkTotalLenght(float totalLength) throws InvalidMeasureLengthException {
		if(totalLength > 1.01) {
			throw new InvalidMeasureLengthException();
		}
	}
	
	public List<Note> getNotes() {
		return this.notes;
	}
	
	public float getDuration() {
		float totalLength = 0;
		
		for(Note n : notes) {
			totalLength += n.getDuration();
		}
		
		return totalLength;
	}
}
