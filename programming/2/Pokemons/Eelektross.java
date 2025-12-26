package Pokemons;

import Moves.SpecialMoves.ZapCannon;
import ru.ifmo.se.pokemon.Type;

public class Eelektross extends Eelektrik{
    public Eelektross(String name, int lvl) {
        super(name, lvl);
        setType(Type.ELECTRIC);
        setStats(85, 115, 80, 105, 80, 50);
        addMove(new ZapCannon());;

    }
}
