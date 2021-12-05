package tablestate.transitions;

import tablestate.DigitalClock;
import tablestate.states.DisplayHour;

public class DS2DHTransition implements ITransition{
    private static DS2DHTransition instance = null;

    private DS2DHTransition() {}

    public static DS2DHTransition getInstance() {
        if(instance ==null) instance = new DS2DHTransition();
        return instance;
    }
    @Override
    public void applyTransition(DigitalClock context) {
        context.switchTo(DisplayHour.getInstance());
    }
}
