package com.example.softwareoefenexamen;

import java.time.LocalDate;

public class Persoon {
    private String naam;
    private LocalDate geboorteDatum;

    public Persoon(String naam, LocalDate geboorteDatum){
        this.naam = naam;
        this.geboorteDatum = geboorteDatum;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setGeboorteDatum(LocalDate geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }

    @Override
    public String toString() {
        String tekst = "";
        tekst += "Naam van de persoon: " + naam + "\n";
        tekst += "Geboortedatum van de persoon: " + geboorteDatum + "\n";
        return tekst;
    }
}

