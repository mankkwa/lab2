package pokemon;
import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Leavanny extends Swadloon {
    public Leavanny(String name, int level){
        super(name, level);
        setStats(45, 53, 70, 40, 60, 42);
        setType(Type.BUG,Type.GRASS);
        setMove(new Confide(), new Facade(), new CloseCombat());
    }

}
