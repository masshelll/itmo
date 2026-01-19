package Enum;

public enum CardinalDirection {
    NORTH("Север"),
    WEST("Запад"),
    SOUTH("Юг"),
    EAST("Восток");

    private final String title;

    CardinalDirection(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
