package agi;

public class Berserker extends Humans {
   private double punktyZycia;
    private double punktyAtaku;
    private double punktySzybkosci;
    private double punktyObrony;

    Berserker() {
        this.punktyZycia = 200;
        this.punktyAtaku = punktyAtaku();
        this.punktyObrony = punktyObrony();
        this.punktySzybkosci = 5;
    }

    public double punktyAtaku() {
        if (this.punktyZycia < (200 * 0.25)) {
            this.punktyAtaku = this.punktyAtaku * 2;
        }
        return this.punktyAtaku;
    }

    public double punktyObrony() {
        if (this.punktyZycia < (200 * 0.25)) {
            this.punktyObrony = 0;
        }
        return this.punktyObrony;
    }

}
