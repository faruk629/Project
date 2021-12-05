package tablestate.transitions;

import tablestate.DigitalClock;
import tablestate.states.DisplayHour;

public class DD2DHTransition implements ITransition{
    private static DD2DHTransition instance = null;

    private DD2DHTransition() {}

    public static DD2DHTransition getInstance() {
        if(instance ==null) instance = new DD2DHTransition();
        return instance;
    }

    @Override
    public void applyTransition(DigitalClock context) {
        context.switchTo(DisplayHour.getInstance());
    }
}
