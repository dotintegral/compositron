package org.siery.music.song;

import java.util.ArrayList;
import java.util.List;

public class Song {
	protected ArrayList<Phrase> phrases;
	
	public Song() {
		phrases = new ArrayList<Phrase>();
	}
	
	public Song add(Phrase phrase) {
		this.phrases.add(phrase);
		
		return this;
	}
	
	public List<Phrase> getPhrases() {
		return this.phrases;
	}
}
