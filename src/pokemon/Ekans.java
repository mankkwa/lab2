package pokemon;
import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Ekans extends Pokemon {
    public Ekans(String name, int level){
        super(name, level);
        setStats(35, 60, 44, 40, 54, 55);
        setType(Type.POISON);
        setMove(new Facade(), new Rest(), new Swagger());
    }

}
