package no.hvl.dat100;

import easygraphics.*;

public class Lab1_6 extends EasyGraphics{
    public static void main(String[] args) {
        launch(args);
    }

    public void run() {
        makeWindow("Det franske flagget");

        setColor(0, 0, 255);
        fillRectangle(100, 200, 50, 50);
        setColor(255, 0, 0);
        fillRectangle(250, 50, 100, 200);
        setColor(0, 0, 0);
        drawRectangle(50, 50, 300, 200);
    }
}
