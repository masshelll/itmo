public class Leg {
    private boolean hasUlcer;

    Leg(boolean b) {
        this.hasUlcer = false;
    }

    public void pulsate(boolean isPulsating) {
        if (isPulsating) {
            System.out.println("Варикозная язва пульсировала на ноге");
        }
    }
}
