package customJar;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.*;

public class DragonPulse extends SpecialMove{
    public DragonPulse() {
        super(Type.DRAGON, 85, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1) {
            Effect.burn(p);
        }
    }

    @Override
    public String describe() {

        return "использует Dragon Pulse";
    }
}
