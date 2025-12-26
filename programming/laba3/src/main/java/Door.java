import Enum.Time;
public class Door implements Openable{
    private boolean isOpen;

    public Door(boolean isOpen) {
        this.isOpen = true;
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
    public boolean close(int force) {
        this.isOpen = false;
        if (force >= 5) {
            System.out.println("Дверь хлопнула");
            return true;
        } else {
            System.out.println("Дверь закрылась");
            return false;
        }
    }
}