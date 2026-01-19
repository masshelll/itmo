package Moves.StatusMoves;
import ru.ifmo.se.pokemon.*;

//восстанавливает половину максимального здоровья цели. Его можно использовать на товарищах по команде, но не на себя.
public class HealPulse extends StatusMove{
    public HealPulse() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override 
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, (int) (p.getStat(Stat.HP)/2 + p.getHP()));
    }

    @Override public String describe() {
        return "использует Heal Pulse";
    }
}
