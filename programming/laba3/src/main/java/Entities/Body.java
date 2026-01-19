package Entities;

public class Body {
    private Leg leg;

    public Body() {
        this.leg = new Leg(true);
    }

    public void feelPain() {
        leg.pulsate(true);
    }

    public Leg getLeg() {
        return leg;
    }

}
