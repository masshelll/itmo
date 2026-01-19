package Entities;

import Enum.CardinalDirection;
public class Ministry extends Place {
    private String ministryName;

    public Ministry(String name, String ministryName, int size, CardinalDirection direction) {
        super(name, size, "огромная мрачная пирамида", direction);
        this.ministryName = ministryName;
    }

    @Override
    public void enter(Person person) {
        if (!person.isInParty()) {
            System.out.println("пролам вход запрещен");
            return;
        }
        super.enter(person);
    }

}
