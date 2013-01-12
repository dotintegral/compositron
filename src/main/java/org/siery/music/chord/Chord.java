package org.siery.music.chord;

import java.util.ArrayList;
import java.util.List;

import org.siery.music.pitch.Pitch;
import org.siery.music.pitch.Tone;

public class Chord {

	protected List<Tone> tones;
	protected ChordType type = null;
	
	protected Chord() {
		this.tones = new ArrayList<Tone>();
	}
	
	public static Chord fromList(List<Tone> tones) {
		Chord chord = new Chord();
		
		for(Tone t : tones) {
			chord.tones.add(t);
		}
		
		return chord;
	}
	
	private void checkType() {
		if(tones.size() == 3) {
			checkChordOf3();
		} else {
			this.type = ChordType.UNKNOWN;
		}
	}
	
	private void checkChordOf3() {
		Pitch root = tones.get(0).getPitch();
		Pitch second = tones.get(1).getPitch();
		Pitch third = tones.get(2).getPitch();
		
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
	
	public List<Tone> getTones() {
		return tones;
	}
}
