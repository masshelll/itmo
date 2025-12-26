package Enum;

public enum Time {
    MOMENT("сейчас"),
    MINUT("минута"),
    HOUR("час"),
    WEEK("неделя");

    private final String title;

    Time(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
