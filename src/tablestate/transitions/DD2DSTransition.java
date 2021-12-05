package tablestate.transitions;

import tablestate.DigitalClock;
import tablestate.states.DisplayDate;
import tablestate.states.DisplaySecond;

public class DD2DSTransition implements ITransition{
    private static DD2DSTransition instance = null;

    private DD2DSTransition() {}

    public static DD2DSTransition getInstance() {
        if(instance ==null) instance = new DD2DSTransition();
        return instance;
    }


    @Override
    public void applyTransition(DigitalClock context) {
        context.switchTo(DisplaySecond.getInstance());
    }
}
