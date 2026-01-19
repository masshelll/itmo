package Moves.StatusMoves;
import ru.ifmo.se.pokemon.*;

//окружает себя завесой воды, которая восстанавливает 1⁄16 его максимального здоровья в конце каждого хода.
public class AquaRing extends StatusMove{
    public AquaRing() {
        super(Type.WATER, 60, 100);
    }

    @Override 
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, (int) (p.getStat(Stat.HP)/16 + p.getHP()));
    }

    @Override public String describe() {
        return "использует Aqua Ring";
    }
}