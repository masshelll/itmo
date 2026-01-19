package Entities;

public abstract class Food {
    private String typeFood;

    public Food(String typeFood) {
        this.typeFood = typeFood;
    }

    public String getTypeFood() {
        return typeFood;
    }

    public Smell getSmell() {
        return new Smell("Запах" + typeFood, 10);
    }

    public void setSmell(String typeFood) {
        this.typeFood = typeFood;
    }

    public abstract void consume();


}
