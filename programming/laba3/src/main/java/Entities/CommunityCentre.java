package Entities;

import Enum.CardinalDirection;
public class CommunityCentre extends Place {
    public CommunityCentre(String name, int size, String description, CardinalDirection direction) {
        super(name, size, description, direction);
    }
    public void organizeGame(String description){
        System.out.println(description);
        for (Person person: getPeople()){
            if (person.isAlone()){
                person.setAlone(false);
            }
        }
    }

    public void organizeLectures(String description){
        System.out.println(description);
        for (Person person: getPeople()){
            if (person.isAlone()){
                person.setAlone(false);
            }
        }
    }

}

