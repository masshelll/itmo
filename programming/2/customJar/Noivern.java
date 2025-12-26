package customJar;

import ru.ifmo.se.pokemon.Type;

public class Noivern extends Noibat {
    public Noivern(String name, int lvl) {
        super(name, lvl);
        setType(Type.FLYING, Type.DRAGON);
        setStats(85, 70, 80, 97, 80, 123);
        addMove(new DragonPulse());

    }
}

