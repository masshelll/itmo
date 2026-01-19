package Pokemons;

import Moves.PhysicalMoves.Spark;
import ru.ifmo.se.pokemon.Type;

public class Eelektrik extends Tynamo{
    public Eelektrik(String name, int lvl) {
        super(name, lvl);
        setType(Type.ELECTRIC);
        setStats(65, 85, 70, 75, 70, 40);
        addMove(new Spark());;

    }

}
