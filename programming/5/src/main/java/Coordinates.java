public class Coordinates {
    private int x; //Значение поля должно быть больше -414
    private int y; //Значение поля должно быть больше -275

    public void setX(int x) {
        if (x <= -414) throw new IllegalArgumentException("Слишком маленькое значение x(<=-414)");
        this.x = x;
    }

    public void setY(int y) {
        if (y <= -275) throw new IllegalArgumentException("Слишком маленькое значение y(<=-275)");
        this.y = y;
    }
}
