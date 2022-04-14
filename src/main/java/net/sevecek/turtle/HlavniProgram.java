package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();


        for (int i = 0; i < 2; i++) {
            //tělo prasátka
            namalujTeloPrasatka(zofka);
        }
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

    private void ocasekPrasatka(Turtle zofka) {
        zofka.turnRight(36);
        zofka.move(140);
        zofka.turnRight(87);
        zofka.move(30);
        zofka.turnLeft(65);
        zofka.move(40);
        zofka.turnLeft(20);
        zofka.move(20);
        for (int i = 0; i <8 ; i++) {

        zofka.turnLeft(45);
        zofka.move(15);

    }
        zofka.move(30);
        zofka.turnLeft(30);
        zofka.move(20);
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
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(90);
    }
}
