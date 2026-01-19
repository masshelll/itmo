public interface Openable {
    void open();
    boolean close(int force);
    boolean isOpen();
}
