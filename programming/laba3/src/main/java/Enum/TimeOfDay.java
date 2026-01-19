package Enum;

public enum TimeOfDay {
    MORNING("Утро"),
    EVENING("Вечер"),
    NIGHT("Ночь");

    private final String title;

    TimeOfDay(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
