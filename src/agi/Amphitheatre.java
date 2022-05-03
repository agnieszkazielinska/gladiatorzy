package agi;

public class Amphitheatre {
    Caesar cezar;

    Amphitheatre() {
        this.cezar = new Caesar();
    }

    public void fight(Gladiator gladiator1, Gladiator gladiator2) {
        int licznikAtakow = 0;
        if (gladiator1.getPunktySzybkosci() > gladiator2.getPunktySzybkosci()) {

            while (gladiator1.getRemainingHealth() >= gladiator1.getPunktyZycia() * 0.1 ||
                    gladiator2.getRemainingHealth() >= gladiator2.getPunktyZycia() * 0.1) {
                gladiator1.getDamage();
                licznikAtakow++;
                gladiator2.takeDamage(gladiator1.getDamage());

                gladiator2.getDamage();
                licznikAtakow++;
                gladiator1.takeDamage(gladiator2.getDamage());
            }
            //TESTOWA ZMIANA
            System.out.println("Gladiator -> nr1:");
            gladiator1.printParms();
            System.out.println("Gladiator -> nr2:");
            //TESTOWA ZMIANA
            gladiator2.printParms();
            if (gladiator1.getRemainingHealth() < gladiator1.getPunktyZycia() * 0.1) {
                cezar.judgeDeathOrLife(gladiator1, licznikAtakow);
            } else {
                cezar.judgeDeathOrLife(gladiator2, licznikAtakow);
            }
        }
    }
}
