package attacks;

import ru.ifmo.se.pokemon.*;
//
public class Rest extends SpecialMove {
    public Rest(){
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected String describe() {return "уснув";}
    protected void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().condition(Status.SLEEP).turns(2));
        p.getStat(Stat.HP);
    }
}
