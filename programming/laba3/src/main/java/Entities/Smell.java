package Entities;

import Enum.Time;
public class Smell {
    private String description;
    private int intensity;
    private String secondDescription;

    public Smell(String description, int intensity){
        this.description = description;
        this.intensity = intensity;
        this.secondDescription = null;
    }

    public void setSecondDescription(Smell otherSmell) {
        this.secondDescription = otherSmell.getDescription();
    }

    public void dissipate(Time time) {
        switch (time) {
            case MOMENT:
                intensity = 0;
                System.out.println("и аромат отсекло так внезапно, как будто это был звук, а не запах");
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
        if (secondDescription != null) {
            return description + ", не " + secondDescription;
        }
        return description;
    }

    public int getIntensity() {
        return intensity;
    }


}
