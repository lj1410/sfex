wanneer je een multipliceir hebt: (hetzelfde met een stack)
public boolean enqueuePersoon(Persoon persoon) {
    if (personenQueue.size() < MAX_PERSONEN) {
        personenQueue.add(persoon);
        return true;  // gelukt
    }
    return false;  // queue zit vol
}

eventuele functies die hij kan vragen:
public Attractie geefAttractieMetLangsteWachttijd() {
    Attractie langste = null;
    for (int i = 0; i < attractiesQueue.size(); i++) {
        Attractie huidige = (Attractie) attractiesQueue.toArray()[i];
        if (langste == null || huidige.getWachttijdInMinuten() > langste.getWachttijdInMinuten()) {
            langste = huidige;
        }
    }
    return langste;
}

public String geefOverzichtAttractiesInPeriode(LocalDate van, LocalDate tot) {
    String tekst = "";
    tekst += "********** Attracties in periode **********\n";
    for (int i = 0; i < attractiesQueue.size(); i++) {
        Attractie huidige = (Attractie) attractiesQueue.toArray()[i];
        if (!huidige.getDatum().isBefore(van) && !huidige.getDatum().isAfter(tot)) {
            tekst += huidige;
        }
    }
    return tekst;
}

// Geef overzicht van personen geboren na een bepaald jaar
public String geefOverzichtPersonenGeborenNa(int jaar) {
    String tekst = "";
    tekst += "********** Personen geboren na " + jaar + " **********\n";
    for (int teller = 0; teller < personenQueue.toArray().length; teller++) {
        Persoon huidige = (Persoon) personenQueue.toArray()[teller];
        if (huidige.getGeboortedatum().getYear() > jaar) {
            tekst += huidige;
        }
    }
    return tekst;
}

// Bestaat er een bewerking met die naam?
public boolean bevatBewerking(String naam) {
    for (int teller = 0; teller < bewerkingenStack.toArray().length; teller++) {
        Bewerking huidige = (Bewerking) bewerkingenStack.toArray()[teller];
        if (huidige.getNaam().equals(naam)) {
            return true;
        }
    }
    return false;
}

public int geefAantalBewerkingOpDatum(LocalDate datum) {
    int teller = 0;
    for (int i = 0; i < bewerkingenStack.toArray().length; i++) {
        Bewerking huidige = (Bewerking) bewerkingenStack.toArray()[i];
        if (huidige.getDatum().equals(datum)) {
            teller++;
        }
    }
    return teller;
}

// Hoeveel bewerkingen zitten er in de stack?
public int geefAantalBewerkingen() {
    return bewerkingenStack.size();
}

// Is de stack leeg?
public boolean isLeeg() {
    return bewerkingenStack.isEmpty();
}

// Is de stack vol? (als er een MAX is)
public boolean isVol() {
    return bewerkingenStack.size() >= MAX_BEWERKINGEN;
}
