package agi;

public class Humans extends Gladiator {
    private String imie;
    private double punktyZycia;
    private double punktyAtaku;
    private double punktySzybkosci;
    private double punktyObrony;

    public Humans() {
        this.imie = "";
        this.punktyZycia = 200;
        this.punktyAtaku = 30;
        this.punktySzybkosci = 10;
        this.punktyObrony = 10;
    }

    Humans(String imie) {
        this.imie = imie;
        this.punktyZycia = 200;
        this.punktyAtaku = 30;
        this.punktySzybkosci = 10;
        this.punktyObrony = 10;
    }

    public void takeDamage(double damage) {
        this.punktyZycia = punktyZycia - damage + this.punktyObrony + this.punktySzybkosci;
    }
}
