package switchcase;

public enum StateEnum {
    DisplayHour("DISPLAY_HOUR"),
    DisplayDate("DISPLAY_DATE"),
    DisplaySecond("DISPLAY_SECOND");

    public final String label;
    StateEnum(String label) {
        this.label = label;
    }
}
