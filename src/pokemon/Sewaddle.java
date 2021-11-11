package pokemon;
import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Sewaddle extends Pokemon {
    public Sewaddle(String name, int level){
        super(name, level);
        setStats(75, 103, 80, 70, 80, 92);
        setType(Type.BUG,Type.GRASS);
        setMove(new Confide(), new Facade(), new CloseCombat(), new BrutalSwing());
    }

}
