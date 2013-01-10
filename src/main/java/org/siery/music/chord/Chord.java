package org.siery.music.chord;

import java.util.ArrayList;
import java.util.List;

import org.siery.music.pitch.Pitch;

public class Chord {

	List<Pitch> pitches;
	ChordType type = null;
	
	private Chord() {
		this.pitches = new ArrayList<Pitch>();
	}
	
	public static Chord fromList(List<Pitch> pitches) {
		Chord chord = new Chord();
		
		for(Pitch p : pitches) {
			chord.pitches.add(p);
		}
		
		return chord;
	}
	
	private void checkType() {
		if(pitches.size() == 3) {
			checkChordOf3();
		} else {
			this.type = ChordType.UNKNOWN;
		}
	}
	
	private void checkChordOf3() {
		Pitch root = pitches.get(0);
		Pitch second = pitches.get(1);
		Pitch third = pitches.get(2);
		
		if(root.getIntervalTo(second) == 3 && second.getIntervalTo(third) == 4) {
			this.type = ChordType.MINOR;
		} else if(root.getIntervalTo(second) == 4 && second.getIntervalTo(third) == 3) {
			this.type = ChordType.MAJOR;
		} else if(root.getIntervalTo(second) == 3 && second.getIntervalTo(third) == 3 ){
			this.type = ChordType.DIMINISHED;
		} else {
			this.type = ChordType.UNKNOWN;
		}
	}
	
	public ChordType getType() {
		if(type == null) {
			checkType();
		}
		return type;
	}
	
	public List<Pitch> getPitches() {
		return pitches;
	}
}
