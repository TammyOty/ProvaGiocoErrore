package modello;

public class Guerriero {
    private String specie;
    private int vita;

    private int attacco;

    private int difesa;

    private int velocita;

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public int getVita(){
        return vita ;
    }
    public void setVita(int vita){
        this.vita = vita;
    }
    public int getVelocita() {
        return velocita;
    }

    public void setVelocita(int velocita) {
        this.velocita = velocita;
    }

    public int getAttacco() {
        return attacco;
    }

    public void setAttacco(int attacco) {
        this.attacco = attacco;
    }

    public int getDifesa() {
        return difesa;
    }

    public void setDifesa(int difesa) {
        this.difesa = difesa;
    }

    public Guerriero(String specie, int vita, int attacco, int difesa, int velocita) {
        this.specie = specie;
        this.velocita = vita;
        this.attacco = attacco;
        this.difesa = difesa;
        this.velocita = velocita;
    }

    @Override
    public String toString() {
        return "Guerriero{" +
                "specie='" + specie + '\'' +
                ", vita=" + vita +
                ", attacco=" + attacco +
                ", difesa=" + difesa +
                ", velocita=" + velocita;

    }
}
