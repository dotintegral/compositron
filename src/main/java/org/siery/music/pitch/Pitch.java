package org.siery.music.pitch;

public enum Pitch {
	C(0),
	Cs(1),
	D(2),
	Ds(3),
	E(4),
	F(5),
	Fs(6),
	G(7),
	Gs(8),
	A(9),
	As(10),
	B(11);
	
	// positive interval value from C
	private int interval;
	
	Pitch(int interval) {
		this.interval = interval;
	}
	
	public int getInterval() {
		return this.interval;
	}
	
	public Pitch incrementBy(int interval) {
		int newInterval = (this.interval + interval) % 12;
		
		if(newInterval < 0) {
			newInterval = newInterval + 12;
		}
		
		Pitch newNote = Pitch.C;
		
		for(Pitch enumNote : values()) {
			if(enumNote.getInterval() == newInterval) {
				newNote = enumNote;
				break;
			}
		}
		
		return newNote;
	}
}
