package statepattern.states;

import statepattern.DigitalClock;

public class DisplayDate implements ClockState {
	private static DisplayDate instance = null;
	private DisplayDate() {};
	public static DisplayDate getInstance() {
		if(instance == null) instance = new DisplayDate();
		return instance;
	}
	@Override
	public void b1(DigitalClock context) {
		context.switchTo(DisplaySecond.getInstance());
	}

	@Override
	public void b2(DigitalClock context) {
		context.switchTo(DisplayHour.getInstance());
	}

	@Override
	public String toString() {
		return "DISPLAY_DATE";
	}
}
