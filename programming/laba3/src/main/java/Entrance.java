import Enum.Time;
public class Entrance {
    private Smell smell;
    private String color;
    private Door door;

    public Entrance() {
        this.color = "Темный";
        this.smell = null;
        this.door = new Door(true);
    }
    public Smell getSmell() {
        return smell;
    }
    public void setSmell(Smell smell) {
        this.smell = smell;

    }
    public Door getDoor() {
        return door;
    }

    public void spreadSmell() {
        if (smell != null) {
            System.out.println("Из какого то подъезда пахло " + smell.getDescription());
        }
    }

    public void slamDoor(int force) {
        boolean isDoorSlammed = door.close(force);
        if (isDoorSlammed && smell != null) {
            smell.dissipate(Time.MOMENT);
        }
    }

}
