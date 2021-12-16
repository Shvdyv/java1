package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");

        Box box = new Box(4, 7, 2);
        System.out.println(box);
        int vol = box.volume();
        System.out.println("objetosc pudelka: " + vol);

        Uczen uczen = new Uczen("kowalski",5,3);
        System.out.println(uczen);
        double srednia = uczen.srednia();
        System.out.println("srednia ocen: " + srednia);
        uczen.wstawOcene(4,5);
        System.out.println(uczen);
    }
}
