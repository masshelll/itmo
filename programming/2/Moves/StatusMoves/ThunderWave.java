package Moves.StatusMoves;

import ru.ifmo.se.pokemon.*;

//парализует противника
public class ThunderWave extends StatusMove{
    public ThunderWave() {
        super(Type.ELECTRIC, 0, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().turns(3).chance(1).condition(Status.PARALYZE);
        p.addEffect(e);
    }


    @Override public String describe() {
        return "использует Thunder Wave";
    }
}
