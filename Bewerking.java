package com.example.softwareoefenexamen2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Bewerking {
    private String naam;
    private LocalDate date;
    private LocalTime tijdstip;

    public Bewerking(String naam, LocalDate date, LocalTime tijdstip) {
        this.date = date;
        this.naam = naam;
        this.tijdstip = tijdstip;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setTijdstip(LocalTime tijdstip) {
        this.tijdstip = tijdstip;
    }

    public LocalTime getTijdstip() {
        return tijdstip;
    }

    @Override
    public String toString() {
        return "Bewerking{" +
                "naam='" + naam + '\'' +
                ", date=" + date +
                ", tijdstip=" + tijdstip +
                '}';
    }
}
