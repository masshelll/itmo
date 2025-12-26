package customJar;

import ru.ifmo.se.pokemon.*;

public class AirCutter extends SpecialMove{
    public AirCutter() {
        super(Type.FLYING, 60, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().turns(-1).condition(Status.SLEEP);
        p.addEffect(e);
        p.setMod(Stat.HP, (int) + p.getStat(Stat.HP));
    }

    @Override 
    public String describe() {
        return "использует Air Cutter";
    }
}
