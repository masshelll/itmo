import Enum.CardinalDirection;

import java.util.ArrayList;
import java.util.List;

public class Place {
    protected String name;
    protected int size;
    protected String description;
    protected CardinalDirection direction;
    protected List<Person> peopleInPlace;

    public Place(String name, int size, String description, CardinalDirection direction) {
        this.name = name;
        this.size = size;
        this.description = description;
        this.direction = direction;
        this.peopleInPlace = new ArrayList<>();
    }

    public void enter(Person person) {
        peopleInPlace.add(person);
        System.out.println(person.getName() + " вошел в " + name);
    }

    public void exit(Person person) {
        peopleInPlace.remove(person);
        System.out.println(person.getName() + " вышел из " + name);
    }

    public boolean isCrowded() {
        return peopleInPlace.size() > size;
    }

    public CardinalDirection getDirection() {
        return direction;
    }

    public String getName() {
        return name;
    }
    public List<Person> getPeople() {
        return new ArrayList<>(peopleInPlace);
    }
}
