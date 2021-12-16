package com.company;

public class Uczen {
    private String nazwisko;
    private double ocena1, ocena2;


    Uczen(String nazwisko, double ocena1, double ocena2) {
        this.nazwisko = nazwisko;
        this.ocena1 = ocena1;
        this.ocena2 = ocena2;
    }

    /*public void test(int ...dane){

        for (int a: dane){
            System.out.println(a);
        }
    }*/

    public void wstawOcene(double ocena1, double ocena2){
        if(ocena1 >= 1 && ocena1 <= 6){
            this.ocena1 = ocena1;
        }
        if(ocena2 >= 1 && ocena2 <= 6){
            this.ocena2 = ocena2;
        }
    }

    public double srednia(){
        return (this.ocena1+this.ocena2)/2;
    }

    public String toString() {
        return "Uczen: " + this.nazwisko + "," + this.ocena1 + "," + this.ocena2;
    }


    }

