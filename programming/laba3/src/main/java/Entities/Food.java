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
//    Food bread = new Food("Хлеб") {
//        @Override
//        public void consume() {
//            System.out.println("Выпечен хлеб");
//        }
//    };
//    public class Water{
//        public void drink(){
//            System.out.println("");
//        }
//    }


}
