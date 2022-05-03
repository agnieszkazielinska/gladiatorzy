package agi;

public class Caesar {
    int licznikUzyc;

    Caesar() {
        this.licznikUzyc = 0;
    }


    public void judgeDeathOrLife(Gladiator gladiator, int licznikAtakow) {
        this.licznikUzyc++;
        if (licznikUzyc % 3 == 0 && licznikAtakow % 2 == 0) {
            gladiator.setPunktyZycia(0);
        }
    }
}
