import Enum.Time;
public class Door implements Openable{
    private boolean isOpen;
    private Entrance entrance;

    public Door(boolean isOpen, Entrance entrance) {
        this.isOpen = true;
        this.entrance = entrance;
    }

    @Override
    public void open() {
        this.isOpen = true;
        System.out.println("Дверь открылась");
    }
    @Override
    public void close() {
        close(1);
    }
    @Override
    public boolean isOpen() {
        return isOpen;
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