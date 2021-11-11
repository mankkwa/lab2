package pokemon;
import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Arbok extends Ekans {
    public Arbok(String name, int level){
        super(name, level);
        setStats(60, 95, 69, 65, 79, 80);
        setType(Type.POISON);
        setMove(new Facade(), new Rest(), new Swagger(), new FeintAttack());
    }

}
