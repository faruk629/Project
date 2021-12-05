package switchcase;

public enum StateEnum {
    DisplayHour("Display_Hour"),
    DisplayDate("Display_Date"),
    DisplaySecond("Display_Second");

    public final String label;
    StateEnum(String label) {
        this.label = label;
    }
}
