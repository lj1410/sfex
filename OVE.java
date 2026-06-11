package com.example.examenoopjavafx;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class OVE {
    public static Label maakLabel(String tekst) {
        Label label;

        label = new Label(tekst);
        label.setFont(new Font(10));
        label.setTextFill(Color.MEDIUMPURPLE);
        return label;
    }

    public static VBox maakVBox() {
        VBox vBox;

        vBox = new VBox(10);
        vBox.setMinWidth(900);
        vBox.setPadding(new Insets(10));
        vBox.setBackground(new Background(new BackgroundFill(Color.HOTPINK, new CornerRadii(5), new Insets(0))));
        return vBox;
    }
}

