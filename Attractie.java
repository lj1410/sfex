package com.example.softwareoefenexamen;

import java.time.LocalTime;
import java.util.LinkedList;
import java.util.Queue;

public class Attractie {
    private String naam;
    private int wachtTijdInMinuten;
    private Queue<Persoon> personenQueue;

    public Attractie(String naam, int wachtTijdInMinuten) {
        this.naam = naam;
        this.wachtTijdInMinuten = wachtTijdInMinuten;
        personenQueue = new LinkedList<Persoon>();
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setWachtTijdInMinuten(int wachtTijdInMinuten) {
        this.wachtTijdInMinuten = wachtTijdInMinuten;
    }

    public int getWachtTijdInMinuten() {
        return wachtTijdInMinuten;
    }

    public void enqueueuPersoon(Persoon persoon) {
        personenQueue.add(persoon);
    }

    public Persoon dequeuePersoon() {
        return personenQueue.poll();
    }

    public Persoon peekPersoon() {
        return personenQueue.peek();
    }

    @Override
    public String toString() {
        String tekst = "";
        tekst += "********** Attractie: " + naam + " **********\n";
        tekst += "Wachttijd in minuten: " + wachtTijdInMinuten + "\n";
        tekst += "********** Personen: **********\n";
        for (int teller = 0; teller < personenQueue.size(); teller++) {
            tekst += personenQueue.toArray()[teller];
        }
        return tekst;
    }
}
