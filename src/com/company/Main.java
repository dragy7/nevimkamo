package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        intro();
    }

    static void intro(){
        System.out.println("Tento program dokaze spocitat kolikrat se Vami zadane slovo vyskytuje ve Vami zadane vete.");
        System.out.println("Zadejte vetu:");
        System.out.println("Zadejte slovo");
        volba();
    }

    static void volba(){
        String veta = sc.nextLine().toLowerCase(Locale.ROOT);
        String[] rozdelenaVeta = veta.split(" ");
        String slovo = sc.nextLine().toLowerCase(Locale.ROOT);
        analyzaVety(slovo,rozdelenaVeta);
    }

    static void analyzaVety(String slovo, String[] rozdelenaVeta){
        int pocetSlovaVeVete = 0;
        for(String vetas : rozdelenaVeta){
            if(vetas.equals(slovo)){
                pocetSlovaVeVete++;

            }
        }
        System.out.println("Slovo se ve vete vyskytuje: " + pocetSlovaVeVete +"x");
    }
}
