public class Coffee extends Food{
    private String name;

    public Coffee(String name) {
        super("Кофе");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Smell getSmell() {
        Smell resultSmell;
        if (this.name.equals("Настоящий")) {
            resultSmell = new Smell("Аромат настоящего кофе", 10);
        } else if (this.name.equals("Победа")) {
            resultSmell = new Smell("Кислый запах кофе 'Победа'", 10);
        } else {
            resultSmell = new Smell("Просто запах кофе", 10);
        }
        return resultSmell;
    }
}
