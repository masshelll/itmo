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
//    @Override
//    public void close() {
//        close(1);
//    }
    @Override
    public boolean isOpen() {
        return isOpen;
    }
    @Override
    public boolean close(int force) {
        if (force < 0) {
            throw new IllegalArgumentException("Сила не может быть отрицательной");
        }
        this.isOpen = false;
        if (force >= 5) {
            System.out.println("Дверь хлопнула");
            return true;
        }
        else {
            System.out.println("Дверь закрылась");
            return false;
        }
    }
}