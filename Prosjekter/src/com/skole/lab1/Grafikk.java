package com.skole.lab1;

import easygraphics.*;


public class Grafikk extends EasyGraphics {
    public static void main(String[] args) {
        launch(args);
    }
    public void run(){
        makeWindow("Grafikk", 1000, 1000);
        drawCircle(150, 70, 60);
        setColor(255,200,0);
        fillCircle(150,70,60);

        drawRectangle(500, 400,70,40);
        fillRectangle(500, 400,70,40);


    }

}
