import pokemon.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {

        Battle b = new Battle();
        Pokemon echka = new Keldeo("Echka", 13);
        Pokemon grecha = new Ekans("Grecha", 5);
        Pokemon ksusha = new Arbok("Ksusha", 24);
        Pokemon jorik = new Sewaddle("Jorik", 4);
        Pokemon bolik = new Swadloon("Bolik", 5);
        Pokemon lelik = new Leavanny("Lelik", 12);

        b.addAlly(echka);
        b.addAlly(grecha);
        b.addAlly(ksusha);
        b.addFoe(jorik);
        b.addFoe(bolik);
        b.addFoe(lelik);

        b.go();
}
        }
