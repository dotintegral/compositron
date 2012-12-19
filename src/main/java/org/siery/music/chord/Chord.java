package org.siery.music.chord;

import java.util.ArrayList;
import java.util.List;

import org.siery.music.Type;
import org.siery.music.pitch.Pitch;

public class Chord {

	List<Pitch> pitches;
	Type type;
	
	public Chord() {
		this.pitches = new ArrayList<Pitch>();
	}
	
	public static Chord fromList(List<Pitch> pitches) {
		Chord chord = new Chord();
		
		for(Pitch p : pitches) {
			chord.pitches.add(p);
		}
		
		chord.checkType();
		
		return chord;
	}
	
	private void checkType() {
		if(pitches.size() >= 3) {
			Pitch root = pitches.get(0);
			Pitch second = pitches.get(1);
			Pitch third = pitches.get(2);
			
			
		}
	}
	
	public List<Pitch> getPitches() {
		return pitches;
	}
}
