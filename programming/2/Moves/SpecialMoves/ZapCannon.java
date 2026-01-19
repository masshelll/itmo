package Moves.SpecialMoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
//наносит урон и парализует цель при попадании.
public class ZapCannon extends SpecialMove{
    public ZapCannon() {
        super(Type.WATER, 120, 50);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.paralyze(p);
        }

    @Override 
    public String describe() {
        return "использует Zap Cannon";
    }
}
