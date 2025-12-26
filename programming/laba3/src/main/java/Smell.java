import Enum.Time;
public class Smell {
    private String description;
    private int intensity;

    public Smell(String description, int intensity){
        this.description = description;
        if (intensity > 100) this.intensity = 100;
        else if (intensity < 0) this.intensity = 0;
        this.intensity = intensity;
    }

    public void dissipate(Time time) {
        switch (time) {
            case MOMENT:
                intensity = 0;
                break;
            case MINUT:
                intensity -= 10;
                break;
            case HOUR:
                intensity -= 60;
                break;
            default:
                intensity -= 20;
        }
    }

    public String getDescription() {
        return description;
    }

    public int getIntensity() {
        return intensity;
    }
}
