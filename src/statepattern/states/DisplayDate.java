package statepattern.states;

import statepattern.DigitalClock;

public class DisplayDate implements ClockState {
	private static DisplayDate instance = null;
	private DisplayDate() {};
	public static DisplayDate Instance() {
		if(instance == null) instance = new DisplayDate();
		return instance;
	}
	@Override
	public void b1(DigitalClock context) {
		context.switchTo(DisplaySecond.Instance());
	}

	@Override
	public String toString() {
		return "Display_Date";
	}
}
