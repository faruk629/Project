package statepattern.states;

import statepattern.DigitalClock;

public interface ClockState {
	public void b1(DigitalClock context); // button 1 pressed
	public void b2(DigitalClock context); // button 2 pressed
}
