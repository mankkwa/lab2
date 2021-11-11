package attacks;
import ru.ifmo.se.pokemon.*;

public class BrutalSwing extends PhysicalMove {
    public BrutalSwing() {
        super(Type.DARK, 60, 100);
    }
    @Override
    protected String describe() {return "нанес брутальный удар";}
    protected void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.HP, (int)Math.round(damage));
    }
}