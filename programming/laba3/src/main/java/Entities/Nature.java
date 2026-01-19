package Entities;

public class Nature {
    private String name;
    private String description;

    public Nature(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void impress(Person person) {
        if (person.isInParty()) {
            System.out.println(person.getName() + " впечатлен" + this.name);
        }

    }
}
