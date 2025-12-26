package customJar;

import ru.ifmo.se.pokemon.*;

public class Noibat extends Pokemon{
    public Noibat(String name, int lvl) {
        super(name, lvl);
        setType(Type.FLYING, Type.DRAGON);
        setStats(40, 30, 35, 45, 40, 55);
        setMove(new LeechLife(), new WildCharge(), new AirCutter());

    }

}


