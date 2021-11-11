package attacks;
import ru.ifmo.se.pokemon.*;

public class FeintAttack extends PhysicalMove {
    public FeintAttack() {
        super(Type.DARK, 60, 999999999);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ACCURACY, -(int)(p.getStat(Stat.ACCURACY)));
        p.setMod(Stat.EVASION, -(int)(p.getStat(Stat.EVASION)));
    }
}
