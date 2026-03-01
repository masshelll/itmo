public class Location {
    private Double x; //Поле не может быть null
    private Integer y; //Поле не может быть null
    private double z;

    public void setX(Double x) {
        if (x == null) throw new IllegalArgumentException("X не может быть null");
        this.x = x;
    }

    public void setY(Integer y) {
        if (y == null) throw new IllegalArgumentException("Y не может быть null");
        this.y = y;
    }

}
