package attacks;

import ru.ifmo.se.pokemon.*;

public class CloseCombat extends PhysicalMove {
    public CloseCombat() {
        super(Type.FIGHTING, 120, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.HP, (int)Math.round(damage));
    }
    protected String describe() {return "тыщ по башке";}
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, -1);
        p.setMod(Stat.SPECIAL_DEFENSE, -1);
    }
}
