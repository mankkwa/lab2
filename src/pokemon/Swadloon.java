package pokemon;
import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Swadloon extends Sewaddle {
    public Swadloon(String name, int level){
        super(name, level);
        setStats(55, 63, 90, 50, 80, 42);
        setType(Type.BUG,Type.GRASS);
        setMove(new Confide(), new Facade());
    }

}