package com.example.softwareoefenexamen2;

import java.util.Stack;

public class UndoSysteem {
    private String naam;
    private String versieNummer;
    private Stack<Bewerking> bewerkingStack;

    public UndoSysteem(String naam,String versieNummer){
        this.naam = naam;
        this.versieNummer = versieNummer;
        bewerkingStack = new Stack<Bewerking>();
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setVersieNummer(String versieNummer) {
        this.versieNummer = versieNummer;
    }

    public String getVersieNummer() {
        return versieNummer;
    }
    public void pushBewerking(Bewerking bewerking){
        bewerkingStack.push(bewerking);
    }
    public Bewerking popBewerking(){
        if (bewerkingStack.isEmpty()){
            return null;
        }else{
            return bewerkingStack.pop();
        }
    }
    public Bewerking peekBewerking(){
        if (bewerkingStack.isEmpty()){
            return null;
        }else{
            return bewerkingStack.peek();
        }
    }

    @Override
    public String toString() {
        String tekst = "";
        tekst += "UndoSysteem{" +
                "naam='" + naam + '\'' +
                ", versieNummer='" + versieNummer + '\'';
        if (!bewerkingStack.isEmpty()) {
            for (int i = bewerkingStack.toArray().length - 1; i >= 0; i--) {
                tekst += bewerkingStack.toArray()[i];
            }
        }
        return tekst;
    }
}
