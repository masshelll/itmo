import Enum.Time;
public class Door {
    private boolean isOpen;
    private Entrance entrance;

    public Door(boolean isOpen, Entrance entrance) {
        this.isOpen = true;
        this.entrance = entrance;
    }

    public void close(int force) {
        this.isOpen = false;
        if (force >= 5) {
            System.out.println("Дверь хлопнула");
            Smell currentSmell = entrance.getSmell();
            if (currentSmell != null) {
                currentSmell.dissipate(Time.MOMENT);
            }
        } else {
            System.out.println("Дверь закрылась");
        }
    }
}