package agi;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public abstract class Gladiator {
    private double punktyZycia;
    private double punktyAtaku;
    private double punktySzybkosci;

    Gladiator() {
        this.punktyZycia = 100;
        this.punktyAtaku = 0;
        this.punktySzybkosci = 0;
    }

    Gladiator(double punktyZycia) {
        this.punktyZycia = punktyZycia;
        this.punktyAtaku = 0;
        this.punktySzybkosci = 0;
    }


    public double getPunktyZycia() {
        return punktyZycia;
    }

    public void setPunktyZycia(double punktyZycia) {
        this.punktyZycia = punktyZycia;
    }


    public double getPunktyAtaku() {
        return punktyAtaku;
    }

    public void setPunktyAtaku(double punktyAtaku) {
        this.punktyAtaku = punktyAtaku;
    }

    public double getPunktySzybkosci() {
        return punktySzybkosci;
    }

    public void setPunktySzybkosci(double punktySzybkosci) {
        this.punktySzybkosci = punktySzybkosci;
    }

    public double getRemainingHealth() {
        DecimalFormat zaokrglenie = new DecimalFormat("#");
        zaokrglenie.setRoundingMode(RoundingMode.FLOOR);
        String HP = zaokrglenie.format(this.punktyZycia);
        double dHP = Double.valueOf(HP);
        return this.punktyZycia = dHP;
    }

    public void takeDamage(double damage) {
        this.punktyZycia = this.punktyZycia - damage;
    }

    public void cure() {
        this.punktyZycia = 100;
    }

    public void printParms() {
        System.out.println(this.punktyZycia + " : " + this.punktyAtaku + " : " + this.punktySzybkosci);
    }

    private void die() {
        this.punktyZycia = 0;
    }

    public void applyWinnerReward() {
        this.punktyAtaku += 2;
        this.punktySzybkosci += 2;
    }

    public double getDamage() {
        double damage = this.punktyAtaku;
        return damage;

    }


}
