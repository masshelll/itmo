import Enum.CardinalDirection;
public class House extends Place {
    private String color;
    private boolean isDestroyed;
    private int floors;
    private Entrance entrance;

    public House(String name, int size, String description, CardinalDirection direction, String color, boolean isDestroyed, int floors) {
        super(name, size, description, direction);
        this.color = color;
        this.isDestroyed = isDestroyed;
        this.floors = floors;
        this.entrance = new Entrance();
    }

    public Entrance getEntrance() {
        return entrance;
    }

    public String getDescription() {
        if (isDestroyed) return "Разрушен" + getName();
        return description;
    }
}
