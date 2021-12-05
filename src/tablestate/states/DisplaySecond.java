package tablestate.states;

public class DisplaySecond extends ClockState {
	private static DisplaySecond instance = null;
	private DisplaySecond() {}
	public static DisplaySecond getInstance() {
		if(instance == null) instance = new DisplaySecond();
		return instance;
	}

	@Override
	public StateEnum getType() {
		return StateEnum.DISPLAY_SECOND;
	}
}
