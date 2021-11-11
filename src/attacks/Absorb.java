package attacks;
import ru.ifmo.se.pokemon.*;

public class Absorb extends SpecialMove {
    public Absorb(){
        super(Type.GRASS, 20, 100);
    }
    @Override
    protected String describe() {return "выпил полисорб";}
    protected void applySelfEffects(Pokemon p){
        double damage = p.getStat(Stat.HP) - p.getHP();
        p.setMod(Stat.HP, -(int)Math.round(damage*0.5));
    }
}
