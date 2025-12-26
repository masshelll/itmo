package Moves.SpecialMoves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
//с вероятностью 70% повышает специальную атаку пользователя на одну ступень.
public class ChargeBeam extends SpecialMove{
    public ChargeBeam() {
        super(Type.ELECTRIC, 50, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() < 0.7) {
            p.setMod(Stat.SPECIAL_ATTACK, 1);
        }
    }

    @Override 
    public String describe() {
        return "использует Charge Beam";
    }
}
