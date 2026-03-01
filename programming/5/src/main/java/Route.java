public class Route implements Comparable<Route>{
    private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Location from; //Поле может быть null
    private Address to; //Поле не может быть null
    private long distance;//Значение поля должно быть больше 1

    public Route(long distance) {
        this.distance = distance;
    }

    public void setId(long id) {
        if (id < 0) throw new IllegalArgumentException("ID не может быть отрицательным");
        this.id = id;
    }

    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException("Имя не может быть null");
        if (name.isEmpty()) throw new IllegalArgumentException("Имя не может быть пустым");
        this.name = name;
    }

    public void setCoordinates(Coordinates coordinates) {
        if (coordinates == null) throw new IllegalArgumentException("Координаты не могут быть null");
        this.coordinates = coordinates;
    }

    public void setCreationDate(java.time.LocalDateTime creationDate) {
        if (creationDate == null) throw new IllegalArgumentException("Дата не может быть null");
        this.creationDate = creationDate;
    }
    
    public void setFrom(Location from) {
        if (to == null) throw new IllegalArgumentException("from не может быть null");
        this.from = from;
    }

    public void setTo(Address to) {
        if (to == null) throw new IllegalArgumentException("to не может быть null");
        this.to = to;
    }

    public void setDistance(long distance) {
        if (distance < 1) throw new IllegalArgumentException("Расстояние не может быть меньше 1");
        this.distance = distance;
    }

    long getId() {
        return id;
    }


    @Override
    public int compareTo(Route other) {
        int result = Long.compare(this.distance, other.distance);

        if (result == 0) {
            return Long.compare(this.id, other.id);
        }
        return result;
    }

}
