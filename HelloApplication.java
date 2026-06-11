package com.example.examenoopjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.Month;
import java.util.ArrayList;

import static com.example.examenoopjavafx.OVE.maakLabel;
import static com.example.examenoopjavafx.OVE.maakVBox;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox vBox;
        BorderPane root;
        ScrollPane scrollPane;
        ArrayList<Label> labelLijst = new ArrayList<Label>();
        PersoneelLid personeelLid1 , personeelLid2 , personeelLid3 , personeelLid4;
        Vlucht vlucht1;
        Luchtvaartmaatschappij luchtvaartmaatschappij1;


        //testcode
        labelLijst.add(maakLabel("|             ,,           test code personeelleden aanmaken           ,,         |"));
        personeelLid1 = new PersoneelLid("VZW" , " Lara Joy " , PersoneelsCategorie.EERSTEOFFICIER);
        personeelLid1.setNaam("Mamalorian");
        personeelLid1.setPersoneelsCategorie(PersoneelsCategorie.STEWARD);
        labelLijst.add(maakLabel(personeelLid1.toString()));
        personeelLid2 = new PersoneelLid("IDC" , "Coole dude aka Lara", PersoneelsCategorie.GEZAGVOERDER);
        labelLijst.add(maakLabel(personeelLid2.toString()));
        personeelLid3 = new PersoneelLid("YUR" , "Kaj duif" , PersoneelsCategorie.STEWARD);
        labelLijst.add(maakLabel(personeelLid3.toString()));
        personeelLid4 = new PersoneelLid("ALX" , "Alexa" , PersoneelsCategorie.STEWARD);
        labelLijst.add(maakLabel(personeelLid4.toString()));

        labelLijst.add(maakLabel("|             ,,           test code Vlucht aanmaken           ,,         |"));
        vlucht1 = new Vlucht("COL", "DUI" , "AMR");
        vlucht1.setMaand(Month.JANUARY);
        vlucht1.setVluchtsTijdsstip(VluchtsTijdsstip.NAMIDDAGVLUCHT);
        vlucht1.setAantalPassagiers(280);
        vlucht1.voegPersoneelToe(personeelLid1);
        vlucht1.voegPersoneelToe(personeelLid2);
        vlucht1.voegPersoneelToe(personeelLid3);
        vlucht1.voegPersoneelToe(personeelLid4);
        labelLijst.add(maakLabel(vlucht1.toString()));

        labelLijst.add(maakLabel("|             ,,           test code Personeelleden schrappen           ,,         |"));
        vlucht1.schrapPersoneel("VZW");
        labelLijst.add(maakLabel(vlucht1.toString()));

        labelLijst.add(maakLabel("|             ,,           test code Luchtvaartmaatschappij aanmaken           ,,         |"));
        luchtvaartmaatschappij1 = new Luchtvaartmaatschappij("AZ", "Lara's geweldig code" , "larajoy,be");
        luchtvaartmaatschappij1.voegVluchToe(vlucht1);
        labelLijst.add(maakLabel(luchtvaartmaatschappij1.toString()));

        labelLijst.add(maakLabel("|             ,,           test code Vlucht Opvragen           ,,         |"));
        luchtvaartmaatschappij1.vraagVluchtOp("COL");
        labelLijst.add(maakLabel(luchtvaartmaatschappij1.toString()));

        labelLijst.add(maakLabel("|             ,,           test code Vlucht schrappen           ,,         |"));
        luchtvaartmaatschappij1.schrapVlucht("COL");
        labelLijst.add(maakLabel(luchtvaartmaatschappij1.toString()));

        labelLijst.add(maakLabel("|             ,,           test code Luchtvaartmaatschappij functies uittesten           ,,         |"));
        labelLijst.add(maakLabel("Totaal aantal vluchten " + luchtvaartmaatschappij1.geefTotaalAantalVluchten()));
        labelLijst.add(maakLabel("|             ,,           ,,          ,,         |"));
        labelLijst.add(maakLabel("Totaal aantal passagiers: " + luchtvaartmaatschappij1.geefTotaalAantalPassagiers()));
        labelLijst.add(maakLabel("gemiddelde passagiers : " + luchtvaartmaatschappij1.geefGemiddeldAantalPasssagies()));
        labelLijst.add(maakLabel("|             ,,           ,,          ,,         |"));
        labelLijst.add(maakLabel("totaal aantal personeel: " + luchtvaartmaatschappij1.geefTotaalAantalPersoneelLeden()));
        labelLijst.add(maakLabel("gemiddelde personeel: " + luchtvaartmaatschappij1.geefGemiddeldAantalPersoneel()));
        labelLijst.add(maakLabel("|             ,,           ,,          ,,         |"));
        labelLijst.add(maakLabel("totaal aantal stewards: " + luchtvaartmaatschappij1.geefTotaalAantalStewards()));
        labelLijst.add(maakLabel("gemiddelde stewards: " + luchtvaartmaatschappij1.geefGemiddeldAantalStewards()));













        //vbox
        vBox = maakVBox();
        vBox.getChildren().addAll(labelLijst);
        //scrollPane
        scrollPane = new ScrollPane(vBox);
        //borderpane
        root = new BorderPane(scrollPane);


        Scene scene = new Scene(root, vBox.getMinWidth(), 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}

