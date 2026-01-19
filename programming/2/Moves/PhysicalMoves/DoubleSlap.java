package Moves.PhysicalMoves;
import ru.ifmo.se.pokemon.*;

public class DoubleSlap extends PhysicalMove{
    public DoubleSlap() {
        super(Type.NORMAL, 15, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        this.power = 15;
        double r = Math.random();
        if (r < 3.0/8) {
            this.power = 30;
        }
        if (r < 6.0/8 && r >= 3.0/8) {
            this.power = 45;
        }
        if (r < 7.0/8 && r >= 6.0/8) {
            this.power = 60;
        }
        if (r >= 7.0/8) {
            this.power = 75;
        }
    }

    @Override 
    public String describe() {
        return "использует Double Slap";
        
    }
}
