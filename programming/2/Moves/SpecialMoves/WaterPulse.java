package Moves.SpecialMoves;
import ru.ifmo.se.pokemon.*;

//Водный импульс наносит урон и с вероятностью 20% может сбить цель с толку.
public class WaterPulse extends SpecialMove{
    public WaterPulse() {
        super(Type.WATER, 60, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() < 0.2) {
            p.confuse();
        }
    }

    @Override 
    public String describe() {
        return "использует WaterPulse";
    }
}
