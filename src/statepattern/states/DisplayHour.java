package statepattern.states;

import statepattern.DigitalClock;


public class DisplayHour implements ClockState {

	private static DisplayHour instance = null;
	private DisplayHour(){};
	public static DisplayHour getInstance() {
		if(instance == null) instance = new DisplayHour();
		return instance;
	}

	@Override
	public void b1(DigitalClock context) {
		context.switchTo(DisplayDate.getInstance());
	}

	@Override
	public void b2(DigitalClock context) {
		context.switchTo(DisplaySecond.getInstance());
	}

	@Override
	public String toString() {
		return "DISPLAY_HOUR";
	}
}
