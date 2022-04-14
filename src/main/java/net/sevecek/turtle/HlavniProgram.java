package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

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

    }

    private void namalujSlunicko(Turtle zofka) {
        for (int t = 0; t < 12; t++) {


        paprsekSlunicka(zofka);
        for (int i = 0; i < 3; i++) {
            zofka.move(10);
            zofka.turnRight(10);

        }
    }
    }

    private void paprsekSlunicka(Turtle zofka) {
        zofka.move(10);
        zofka.turnLeft(90);
        zofka.move(45);
        zofka.turnLeft(180);
        zofka.move(45);
        zofka.turnLeft(90);
    }

    private void namalujKolecko(Turtle zofka) {
        for (int i = 0; i < 36; i++) {


            zofka.move(10);
            zofka.turnRight(10);
        }
        zofka.penUp();
    }

    private void namalujCelePrasatko(Turtle zofka) {

        namalujTeloPrasatka(zofka);

        //zadní nožky
        namalujNozkyPrasatka(zofka);

        //predni nožky
        zofka.turnLeft(135);
        zofka.move(150);
        zofka.penDown();
        zofka.turnRight(90);
        namalujNozkyPrasatka(zofka);

        hlavaPrasatka(zofka);


        ocasekPrasatka(zofka);

    }


    private void namalujOsmiuhelnik(Turtle zofka) {
        for (int i = 0; i < 8; i++) {


            zofka.move(30);
            zofka.turnRight(45);
            zofka.move(20);
        }
        zofka.penUp();
    }

    private void ocasekPrasatka(Turtle zofka) {
        zofka.turnRight(36);
        zofka.move(140);
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
    }

    private void hlavaPrasatka(Turtle zofka) {
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(80);
        zofka.turnRight(100);
        zofka.move(80);
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
            zofka.move(150);
            zofka.turnLeft(90);
        }
    }
}



