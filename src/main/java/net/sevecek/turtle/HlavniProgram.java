package net.sevecek.turtle;

import net.sevecek.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        zofka.setLocation(130, 250);
        for (int i = 0; i < 4; i++) {


            zofka.penDown();
            namalujDomecek(zofka);
            zofka.turnRight(90);
            zofka.penUp();
            zofka.move(150);
            zofka.turnLeft(90);
            zofka.penDown();
        }
        zofka.penDown();
        namalujDomecek(zofka);

        zofka.penUp();
        zofka.turnRight(180);

        zofka.move(100);
        zofka.turnRight(180);
        zofka.penDown();
//
//        namalujDomecek(zofka);
//
//        zofka.turnLeft(90);
//        zofka.penUp();
//        zofka.move(100);

        zofka.setLocation(550, 450);
        namalujCelePrasatko(zofka);

        zofka.setLocation(110,450);
        zofka.penDown();
        zofka.setPenColor(Color.blue);

        namalujDomecek(zofka);

        zofka.setLocation(750,450);
        namalujDomecek(zofka);





        //sluníčko, které udělám naposled
        zofka.setLocation(220, 70);

        namalujSlunicko(zofka);

        zofka.setLocation(100,400);





    }

        /*zofka.setLocation(300, 200);

        namalujCelePrasatko(zofka);
        //přesun na obrazec

        zofka.turnRight(25);
        zofka.move(120);
        zofka.penDown();

        //obrazec 1

        zofka.turnLeft(90);

        namalujOsmiuhelnik(zofka);

        //přesun na kolečko

        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnLeft(90);
        //kolečko

        zofka.penDown();
        namalujKolecko(zofka);

        //přesun na sluníčko
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnLeft(80);
        zofka.penDown();
        zofka.turnRight(10);

        //začátek sluníčka
        zofka.move(10);
        zofka.turnRight(10);
        zofka.move(10);
        zofka.turnRight(10);
        zofka.move(10);

        //sluníčko

        namalujSlunicko(zofka);

*/


    // nápověda na domeček
    public void namalujDomecek(Turtle zofka) {
        for (int i = 0; i < 4; i++) {
            zofka.move(75.0);
            zofka.turnRight(90.0);
        }

        zofka.penUp();
        zofka.move(75.0);
        zofka.penDown();

        zofka.turnRight(30.0);
        zofka.move(75.0);
        zofka.turnRight(120.0);
        zofka.move(75.0);

        zofka.turnRight(30.0);
        zofka.penUp();
        zofka.move(75.0);
        zofka.turnRight(90.0);
        zofka.move(75.0);
        zofka.turnRight(90.0);
        zofka.penDown();
    }

    private void namalujSlunicko(Turtle zofka) {

        zofka.setPenColor(Color.yellow);
        for (int t = 0; t < 12; t++) {


            paprsekSlunicka(zofka);
            for (int i = 0; i < 2; i++) {
                zofka.move(5);
                zofka.turnRight(15);

            }
        }
        zofka.penUp();
    }
// druhá varianta, která by dávala větší smysl ve smyslu použití již vytvořené metody kolečka.

    /*private void namalujSlunickoJinak(Turtle zofka) {

        zofka.penDown();
        namalujKolecko(zofka);

        paprsekSlunicka(zofka);
        for (int i = 0; i < 3; i++) {
            zofka.move(10);
            zofka.turnRight(10);
        }

    }*/

    private void paprsekSlunicka(Turtle zofka) {
        zofka.penDown();
        zofka.move(10);
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(90);
    }

    private void namalujKolecko(Turtle zofka) {
        zofka.setPenColor(Color.green);
        zofka.penDown();
        for (int i = 0; i < 36; i++) {


            zofka.move(10);
            zofka.turnRight(10);
        }
        zofka.setPenColor(Color.yellow);
        zofka.penUp();
    }

    private void namalujCelePrasatko(Turtle zofka) {
        zofka.setPenColor(Color.pink);

        namalujTeloPrasatka(zofka);

        //zadní nožky
        namalujNozkyPrasatka(zofka);

        //predni nožky
        zofka.turnLeft(135);
        zofka.move(120);
        zofka.penDown();
        zofka.turnRight(90);
        namalujNozkyPrasatka(zofka);

        hlavaPrasatka(zofka);


        ocasekPrasatka(zofka);

    }


    private void namalujOsmiuhelnik(Turtle zofka) {
        zofka.setPenColor(Color.blue);
        for (int i = 0; i < 8; i++) {


            zofka.move(30);
            zofka.turnRight(45);
            zofka.move(20);
        }
        zofka.penUp();
    }

    private void ocasekPrasatka(Turtle zofka) {
        zofka.turnRight(36);
        zofka.move(120);
        zofka.turnRight(87);
        zofka.move(30);
        zofka.turnLeft(65);
        zofka.move(40);
        zofka.turnLeft(20);
        zofka.move(20);
        for (int i = 0; i < 8; i++) {

            zofka.turnLeft(45);
            zofka.move(15);

        }
        zofka.move(30);
        zofka.turnLeft(30);
        zofka.move(20);
        zofka.penUp();
        zofka.turnLeft(63);
    }

    private void hlavaPrasatka(Turtle zofka) {
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(80);
        zofka.turnRight(100);
        zofka.move(70);
    }

    private void namalujNozkyPrasatka(Turtle zofka) {
        zofka.turnRight(135);
        zofka.move(40);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(40);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(40);
    }

    private void namalujTeloPrasatka(Turtle zofka) {
        for (int i = 0; i < 2; i++) {

            zofka.move(100);
            zofka.turnLeft(90);
            zofka.move(120);
            zofka.turnLeft(90);
        }
    }
}



