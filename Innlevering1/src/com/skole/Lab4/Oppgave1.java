package com.skole.Lab4;
import static javax.swing.JOptionPane.*;
import easygraphics.*;

import javax.swing.*;

public class Oppgave1 extends EasyGraphics{

    public static void main(String[] args) {
        launch(args);
    }
    public void run(){
        double aKlasseGutter = 0.28;
        double bKlasseGutter = 0.38;
        double cKlasseGutter = 0.46;
        double aKlasseJenter = 1-aKlasseGutter;
        makeWindow("Kjønnsfordeling", 600, 600);


        //A-klassen
        drawString("A", 300, 40);
        drawString("Gutter", 60, 40);
        drawString("Jenter", 490, 40);
        drawRectangle(50, 50, 500, 100);
        setColor(0,128,0);
        fillRectangle(50,50,(int)(500 * aKlasseGutter),100);
        setColor(255,0,0);
        fillRectangle((int)(50 + (500*aKlasseGutter)), 50, (int)(500 * aKlasseJenter), 100);

        //B-klassen
        setColor(0,0,0);
        drawString("B", 300, 240);
        drawString("Gutter", 50, 240);
        drawString("Jenter", 490, 240);
        drawRectangle(50, 250, 500, 100);
        setColor(0,128,0);
        fillRectangle(50, 250, (int)(500*bKlasseGutter), 100);
        setColor(255,0,0);
        fillRectangle((int)(50 + (500 *bKlasseGutter)), 250, (int)(500 * (1-bKlasseGutter)), 100);

        //C-klassen
        setColor(0,0,0);
        drawString("Gutter", 50, 440);
        drawString("Jenter", 490, 440);
        drawString("C", 300, 440);
        drawRectangle(50, 450, 500, 100);
        setColor(0,128,0);
        fillRectangle(50, 450, (int)(500 * cKlasseGutter), 100);
        setColor(255,0,0);
        fillRectangle((int)(50 + 500 * cKlasseGutter), 450, (int)(500* (1-cKlasseGutter)),100);
    }
}


