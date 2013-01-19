package org.siery.music.song;

import java.util.ArrayList;
import java.util.List;

public class Phrase {

	protected int tempo;
	protected ArrayList<Measure> measures;
	
	public Phrase(int tempo) {
		this.tempo = tempo;
		this.measures = new ArrayList<Measure>();
	}
	
	public Phrase add(Measure measure) {
		this.measures.add(measure);
		
		return this;
	}
	
	public List<Measure> getMeasures() {
		return this.measures;
	}
	
	public int getTempo() {
		return tempo;
	}
}
