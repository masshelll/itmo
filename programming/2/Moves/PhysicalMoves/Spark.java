package Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
//с вероятностью 30% парализует цель
public class Spark extends PhysicalMove{
    public Spark() {
        super(Type.ELECTRIC, 65, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() < 0.3) {
            Effect.paralyze(p);
        }
    }

    @Override 
    public String describe() {
        return "использует Spark";
        
    }
}
