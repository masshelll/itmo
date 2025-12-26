import Enum.TimeOfDay;
import Enum.Time;
import Error.*;

import java.util.Objects;

public class Person {
    private String name;
    private boolean inParty;
    private boolean isAlone;
    private int suspicionScore;
    private Body body;
    private Memory memory;
    private Place currentPlace;

    public Person(String name, boolean inParty) {
        this.name = name;
        this.inParty = inParty;
        this.isAlone = false;
        this.body = new Body();
        this.currentPlace = null;
        this.suspicionScore = 0;
    }

    public String getName() {
        return name;
    }
    public boolean isAlone() {
        return isAlone;
    }
    public void setAlone(boolean alone) {
        isAlone = alone;
    }
    public boolean isInParty() {
        return inParty;
    }
    public int getSuspicion() {
        return suspicionScore;
    }

    public boolean go(Place destination, int distance, boolean isAlone, TimeOfDay time) {
        if (currentPlace != null) {
            currentPlace.exit(this);
        }
        //status in new place
        this.currentPlace = destination;
        this.isAlone = isAlone;
        this.currentPlace.enter(this);

        System.out.println(name + " идет в " + destination.getName() + " на " + distance + " километров");

        //pain in leg
        if (distance > 2) {
            body.getLeg().pulsate(true);
        }

        if (isAlone) {
            Party.getInstance().considerSuspicion(this, "Прогулка в одиночестве", 10);
        }
        return true;
    }

    public void remember(Memory memory, Time time) {
        if (time == Time.MOMENT) {
            System.out.println(name + " перенесся в" + memory.getDescription());
        }
    }

    public void writeInBook(Book book, String text) throws DiaryException {
       if (book == null) {
            throw new DiaryException("Дневника нет");
       }
       book.addContent(text);
    }

    public void addSuspicion(int score) {
        this.suspicionScore += score;
        if (this.suspicionScore >= 100) {
            throw new SuspicionException(name + " будет стерт!");
        }
    }

    public void eat(Food food) {
        System.out.println(name + " ест " + food.getTypeFood());
    }

    public void stay() {
        System.out.println(name + " невольно остановился");
    }

    public void work() {
        System.out.println(name + " работает");
    }

    public void sleep() {
        System.out.println(name + " спит");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return inParty == person.inParty && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, inParty);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", inParty=" + inParty +
                ", isAlone=" + isAlone +
                ", suspicionScore=" + suspicionScore +
                ", currentPlace=" + currentPlace.name +
                '}';
    }
}
