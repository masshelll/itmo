public class Address {
    private int x;
    private int y;
    private long z;
    private String name; //Длина строки не должна быть больше 385, Поле не может быть null

    public void setName(String name) {
        if (name.length() > 385) throw new IllegalArgumentException("Слишком длинное имя(>385)");
        this.name = name;
    }
}

