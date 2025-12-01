package customJar;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

//наносит урон, а пользователь восстанавливает 50% потерянного HP.
public class LeechLife extends PhysicalMove {

    public LeechLife() {
        super(Type.BUG, 80, 80);
    }

    // @Override
    // protected void applySelfEffects(Pokemon p){
    //     p.setMod(Stat.HP, (int) (p.getStat(Stat.HP) + (p.getHP() - p.getStat(Stat.HP))/2));
    // }


    @Override
    protected void applySelfEffects(Pokemon p) {
        System.out.println(p.getHP());
        System.out.println(p.getStat(Stat.ATTACK));
        System.out.println(p.getLevel());
        if (p.getLevel() < 24) {
            getNoMove();
        }
        else {
            if ((int) p.getStat(Stat.ATTACK) % 2 != 0) {
                p.setMod(Stat.HP, (int) -(p.getStat(Stat.ATTACK)));
                System.out.println("стало хп");
                System.out.println(p.getHP());
            }
        }
    }



    @Override
    public String describe() {
        return "использует Leech Life";

    }
}
