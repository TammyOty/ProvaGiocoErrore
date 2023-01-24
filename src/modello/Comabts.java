package modello;

import java.util.Random;

public class Comabts extends Combattimento {


    @Override
    public int vita(Guerriero g) {
        Random dado = new Random();
        int vita = g.getVita();
        int numeroEstratto = dado.nextInt(100); // da 0 a 100
        vita += numeroEstratto;
        return vita;
    }
    @Override
    public int attacco(Guerriero g) {

        Random dado = new Random();
        int attacco = g.getAttacco();
        int numeroEstratto = dado.nextInt(100); // da 0 a 100
        attacco += numeroEstratto;
        return attacco;
    }

    @Override
    public int difesa(Guerriero g) {
        Random dado = new Random();
        int difesa = g.getDifesa();
        int numeroEstratto = dado.nextInt(100); // da 0 a 100
        difesa += numeroEstratto;
        return difesa;
    }

    @Override
    public int velocita(Guerriero g) {
        Random dado = new Random();
        int velocita = g.getVelocita();
        int numeroEstratto = dado.nextInt(100); // da 0 a 100
        velocita += numeroEstratto;
        return velocita;
    }
}
