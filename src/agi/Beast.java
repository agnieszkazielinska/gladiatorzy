package agi;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Beast {
    private String gatunek;
    private double punktyZycia;
    private double punktyAtaku;
    private double punktySzybkosci;


    Beast(String gatunek) {
        this.gatunek = gatunek;
        this.punktyZycia = 150;
        this.punktyAtaku = punktyAtaku();
        this.punktySzybkosci = 20;
    }

    public double punktyAtaku() {
        if (this.punktyZycia < (150 * 0.25)) {
            this.punktyAtaku = 2 * this.punktyAtaku;
        }
        return this.punktyAtaku;
    }

    public void takeDamage(double damage) {
        DecimalFormat zaokrglenie = new DecimalFormat("#");
        zaokrglenie.setRoundingMode(RoundingMode.FLOOR);
        double pktSzyb = this.punktySzybkosci * 0.5;
        String SpktSzyb = zaokrglenie.format(pktSzyb);
        double DpktSzyb = Double.valueOf(SpktSzyb);
        this.punktyZycia = this.punktyZycia - damage + DpktSzyb;
    }
}
