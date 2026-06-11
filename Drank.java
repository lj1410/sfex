package com.example.softwareoefenexamen3;

import java.math.BigDecimal;

public abstract class Drank {
    protected Smaak smaak;
    protected BigDecimal prijs;
    protected double nettoGewichtGram;

    public Drank(Smaak smaak) {
        this.smaak = smaak;
    }

    public Drank(Smaak smaak, BigDecimal prijs, double nettoGewichtGram) {
        this.smaak = smaak;
        this.prijs = prijs;
        this.nettoGewichtGram = nettoGewichtGram;
    }

    public BigDecimal getPrijs() {
        return prijs;
    }

    public void setPrijs(BigDecimal prijs) {
        this.prijs = prijs;
    }

    public Smaak getSmaak() {
        return smaak;
    }

    public void setSmaak(Smaak smaak) {
        this.smaak = smaak;
    }

    public double getNettoGewichtGram() {
        return nettoGewichtGram;
    }

    public void setNettoGewichtGram(double nettoGewichtGram) {
        this.nettoGewichtGram = nettoGewichtGram;
    }

    public abstract double geefBrutoGewicht();

    public abstract AfvalCategorie geefAfvalCategorie();

    @Override
    public String toString() {
        return "Drank:" + "smaak= " + smaak + ", prijs= " + prijs + ", nettoGewichtGram= " + nettoGewichtGram + '\n';
    }
}
