public class Prole extends Person{
    private boolean isHope;
    private int age;
    private String appearance;

    public Prole(String name, int age, String appearance) {
        super(name, false);
        this.isHope = true;
        this.age = age;
        this.appearance = appearance;
    }

    public void playInPuddle(Puddle puddle) {
        if (age < 13) {
            System.out.println(getName() + " дети играют в" + puddle.getDescription());
        }
    }

    public void speak() {
        System.out.println(getName() + " беседовали");
    }

    public void react(Person person) {
        if (Math.random() > 0.5) {
            System.out.println(getName() + "не обращал никакого внимания на " + person.getName());
        } else {
            System.out.println(getName() + "глядит на " + person.getName() + " осторожным любопытством");
        }
    }
    public String getAppearance() {
        return getName() + appearance;
    }

    public boolean hasHope() {
        return isHope;
    }


}
