package com.example.examenoopjavafx;

public class PersoneelLid {
    private String code;
    private String naam;
    private PersoneelsCategorie personeelsCategorie;

    // constructor
    public PersoneelLid(String code, String naam, PersoneelsCategorie personeelsCategorie){
        this.code = code;
        this.naam = naam;
        this.personeelsCategorie = personeelsCategorie;
    }
    // getter en settters
    // code
    public String getCode() {
        return code;
    }
    //naam
    public String getNaam() {
        return naam;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }
    //persooneelcategorie
    public PersoneelsCategorie getPersoneelsCategorie() {
        return personeelsCategorie;
    }
    public void setPersoneelsCategorie(PersoneelsCategorie personeelsCategorie) {
        this.personeelsCategorie = personeelsCategorie;
    }
    @Override
    public String toString() {
        String tekst = "";
        tekst += ".                 .                 Personeelslid " + code + ": "+ naam + "                 .                 .\n";
        tekst += "Personeelscategorie: " + personeelsCategorie + "\n";
        tekst += "\n";
        return tekst;
    }
}

