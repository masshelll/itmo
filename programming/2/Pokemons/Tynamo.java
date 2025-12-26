package Pokemons;

import Moves.SpecialMoves.ChargeBeam;
import Moves.StatusMoves.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tynamo extends Pokemon{
    public Tynamo(String name, int lvl) {
        super(name, lvl);
        setType(Type.ELECTRIC);
        setStats(35, 55, 40, 45, 40, 60);
        setMove(new ChargeBeam(), new ThunderWave());

    }

}
