package customJar;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
//наносит урон, но пользователь получает лишь четверть от нанесённого урона в отдаче.
public class WildCharge extends PhysicalMove{
    public WildCharge() {
        super(Type.ELECTRIC, 90, 80);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.HP, (int) (p.getHP() - p.getStat(Stat.ATTACK)/4));
    }

    @Override 
    public String describe() {
        return "использует Wild Charge";
        
    }
}


