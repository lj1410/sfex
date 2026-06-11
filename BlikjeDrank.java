package com.example.softwareoefenexamen3;

import java.math.BigDecimal;

public class BlikjeDrank extends Drank {
    private double alcoholPercentage;

    public BlikjeDrank(Smaak smaak, BigDecimal prijs) {
        super(smaak);
        this.prijs = prijs;
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public void setAlcoholPercentage(double alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }

    @Override
    public AfvalCategorie geefAfvalCategorie() {
        return AfvalCategorie.PMD;
    }

    @Override
    public double geefBrutoGewicht() {
        return 10 * nettoGewichtGram;
    }

    @Override
    public String toString() {
        return "BlikjeDrank: " + "alcoholPercentage= " + alcoholPercentage + "\n" + super.toString();
    }
}