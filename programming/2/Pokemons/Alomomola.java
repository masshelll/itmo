package Pokemons;

import Moves.PhysicalMoves.DoubleSlap;
import Moves.SpecialMoves.WaterPulse;
import Moves.StatusMoves.AquaRing;
import Moves.StatusMoves.HealPulse;
import ru.ifmo.se.pokemon.*;

public class Alomomola extends Pokemon{
    private int creationIndex;
    public Alomomola (String name, int lvl) {
        super(name, lvl);
        setType(Type.WATER);
        setStats(165, 75, 80, 40, 45, 65);
        setMove(new AquaRing(), new DoubleSlap(), new HealPulse(), new WaterPulse());
        this.creationIndex = 1;
    }
    public int getCreationIndex() {
        return this.creationIndex;
    }

}
