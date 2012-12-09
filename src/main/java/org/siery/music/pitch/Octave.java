package org.siery.music.pitch;

public enum Octave {
	_1(1),
	_2(2),
	_3(3),
	_4(4),
	_5(5),
	_6(6),
	_7(7);
	
	private int value;
	
	Octave(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
