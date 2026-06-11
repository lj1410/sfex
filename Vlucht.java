package com.example.examenoopjavafx;

import java.time.Month;
import java.util.ArrayList;

public class Vlucht {
    private final int MAX_MULTI = 10;
    private final int MIN_MULTI = 4;
    private String code;
    private String vertrekLuchthaven;
    private String bestemmingsLuchthaven;
    private int aantalPassagiers;
    private Month maand;
    private VluchtsTijdsstip vluchtsTijdsstip;
    ArrayList<PersoneelLid> personeelLidLijst;

    public Vlucht(String code, String vertrekLuchthaven, String bestemmingsLuchthaven) {
        this.code = code;
        this.vertrekLuchthaven = vertrekLuchthaven;
        this.bestemmingsLuchthaven = bestemmingsLuchthaven;
        personeelLidLijst = new ArrayList<PersoneelLid>();

    }
    //getter setter
    //code

    public String getCode() {
        return code;
    }
    // vertrek

    public String getVertrekLuchthaven() {
        return vertrekLuchthaven;
    }

    public void setVertrekLuchthaven(String vertrekLuchthaven) {
        this.vertrekLuchthaven = vertrekLuchthaven;
    }

    // bestemming
    public String getBestemmingsLuchthaven() {
        return bestemmingsLuchthaven;
    }

    public void setBestemmingsLuchthaven(String bestemmingsLuchthaven) {
        this.bestemmingsLuchthaven = bestemmingsLuchthaven;
    }
    //aantal passagiers

    public int getAantalPassagiers() {
        return aantalPassagiers;
    }

    public void setAantalPassagiers(int aantalPassagiers) {
        this.aantalPassagiers = aantalPassagiers;
    }
    // maand

    public Month getMaand() {
        return maand;
    }

    public void setMaand(Month maand) {
        this.maand = maand;
    }
    // vlucht tijdstip


    public VluchtsTijdsstip getVluchtsTijdsstip() {
        return vluchtsTijdsstip;
    }

    public void setVluchtsTijdsstip(VluchtsTijdsstip vluchtsTijdsstip) {
        this.vluchtsTijdsstip = vluchtsTijdsstip;
    }

    public Boolean voegPersoneelToe(PersoneelLid personeelLid) {
        if (personeelLidLijst.size() >= MAX_MULTI) {
            return false;
        }
        personeelLidLijst.add(personeelLid);
        return true;
    }
    // checken of de code wel overeenkomt anders null
    public PersoneelLid vraagPersoneelOp(String code) {
        for (int teller = 0; teller < personeelLidLijst.size(); teller++) {
            if (personeelLidLijst.get(teller).getCode().equals(code)) {
                personeelLidLijst.get(teller);
            }
        }
        return null;
    }
    // schrappen niet als minimum bereikt , als null weergeeft dan false anders remove dat human being
    public boolean schrapPersoneel(String code) {
        if (personeelLidLijst.size() <= MIN_MULTI) {
            return false;
        }
        PersoneelLid personeelLid = vraagPersoneelOp(code);
        if (personeelLid == null) {
            return false;
        }
        personeelLidLijst.remove(code);
        return true;
    }

    public int geefAantalPersoneelsLeden() {
        return personeelLidLijst.size();
    }
    public int geefAantalSteward(){
        int aantalSteward = 0;
        for (int teller = 0 ; teller < personeelLidLijst.size();teller++){
            if (personeelLidLijst.get(teller).getPersoneelsCategorie() == PersoneelsCategorie.STEWARD);
            aantalSteward++;
        }
        return aantalSteward;
    }

    @Override
    public String toString() {
        String tekst = " ";
        tekst += ".                 .                 Vlucht: " + code + "                 .                 .\n";
        tekst += "Vertrekluchthaven: " + bestemmingsLuchthaven + ", bestemmingsluchthaven: " + bestemmingsLuchthaven + "\n";
        tekst += "Aantal passagiers: " + aantalPassagiers + "\n";
        tekst += "Maand: " + maand + "\n";
        tekst += " Vluchttijdstip: " + vluchtsTijdsstip + "\n";
        tekst += "\n";
        for (int teller = 0; teller < personeelLidLijst.size(); teller++) {
            tekst += personeelLidLijst.get(teller).toString();
        }
        return tekst;
    }
}
