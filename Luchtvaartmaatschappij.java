package com.example.examenoopjavafx;
import java.util.ArrayList;

public class Luchtvaartmaatschappij {
    private String code;
    private String naam;
    private String website;
    ArrayList<Vlucht> vluchtLijst;

    // constructor
    public Luchtvaartmaatschappij(String code, String naam, String website) {
        this.code = code;
        this.naam = naam;
        this.website = website;
        vluchtLijst = new ArrayList<Vlucht>();
    }
    // getter en setter
    // code

    public String getCode() {
        return code;
    }
    // naam

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
    // website

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
    public Boolean voegVluchToe(Vlucht vlucht){
        vluchtLijst.add(vlucht);
        return true;
    }
    public Vlucht vraagVluchtOp (String code) {
        for (int teller = 0; teller < vluchtLijst.size(); teller++) {
            if (vluchtLijst.get(teller).getCode().equals(code)) {
                vluchtLijst.get(teller);
            }
        }
        return null;
    }
    public Boolean schrapVlucht(String code) {
        for (int teller = 0; teller < vluchtLijst.size(); teller++) {
            if (vluchtLijst.get(teller).getCode().equals(code)) {
                vluchtLijst.remove(teller);
            }
        }
        return null;
    }
    public int geefTotaalAantalVluchten(){
        return vluchtLijst.size();
    }
    // copy paste functies en aanpassen easy
    public int geefTotaalAantalPassagiers(){
        int totaalAantalPassagiers = 0;
        for (int teller = 0 ; teller < vluchtLijst.size();teller++){
            vluchtLijst.get(teller).getAantalPassagiers();
        }
        return totaalAantalPassagiers;
    }
    public int geefGemiddeldAantalPasssagies(){
        if (vluchtLijst.isEmpty()){
            return 0;
        }else{
            int gemiddeldAantalPassagiers = geefGemiddeldAantalPasssagies()/ vluchtLijst.size();
            return gemiddeldAantalPassagiers;
        }
    }
    public int geefTotaalAantalPersoneelLeden() {
        int totaalAantalPersoneel = 0;
        for (int teller = 0; teller < vluchtLijst.size(); teller++) {
            vluchtLijst.get(teller).geefAantalPersoneelsLeden();
        }
        return totaalAantalPersoneel;
    }
    public int geefGemiddeldAantalPersoneel() {
        if (vluchtLijst.isEmpty()) {
            return 0;
        } else {
            int gemiddeldAantalPersoneel = geefGemiddeldAantalPersoneel() / vluchtLijst.size();
            return gemiddeldAantalPersoneel;
        }
    }
    public int geefTotaalAantalStewards(){
        int totaalAantalStewards = 0;
        for (int teller = 0; teller < vluchtLijst.size(); teller++) {
            vluchtLijst.get(teller).geefAantalSteward();
        }
        return totaalAantalStewards;
    }
    public int geefGemiddeldAantalStewards(){
        if (vluchtLijst.isEmpty()) {
            return 0;
        } else {
            int gemiddeldAantalStewards = geefGemiddeldAantalStewards() / vluchtLijst.size();
            return gemiddeldAantalStewards;
        }
    }

    @Override
    public String toString() {
        String tekst = " ";
        tekst += ".                .                 Luchtvaartmaatschappij " + code + ": " + naam + "                 .                 .\n";
        tekst += "Website: " + website + "\n";
        tekst += "\n";
        for (int teller = 0; teller < vluchtLijst.size(); teller++) {
            tekst += vluchtLijst.get(teller).toString();
        }
        return tekst;
    }
}

