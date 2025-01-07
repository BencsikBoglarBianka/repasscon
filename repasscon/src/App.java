/*
* File: App.java
* Author: Bencsik Boglár Bianka
* Copyright: 2024, Bencsik Boglár Bianka
* Date: 2024-01-07
* Github: https://github.com/oktat/
* Licenc: MIT
*/

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
public static void main(String[] args) {
//Fejrész kiírása
System.out.println("Készítette: Bencsik Boglár Bianka");
System.out.println("Jelszavak,Adatok kezelése");
//Verzió kiírása
System.out.println("Verzió: 1.0");
//Adat feldolgozás
Scanner beerkezeo = new Scanner(System.in);
System.out.print("Felhasználónév: ");
String felhasznalonev = beerkezeo.nextLine();
System.out.print("Jelszó: ");
String jelszo = beerkezeo.nextLine();
System.out.print("Hely: ");
String hely = beerkezeo.nextLine();

beerkezeo.close();


    /* 
    fájlba írás
    */
    boolean Mentes = adatokmentes(felhasznalonev, jelszo, hely);

    if (Mentes) {
        System.out.println("Sikeres mentés.");
    } 
    else 
    {
    System.out.println("Hiba!");
    }}
//adatok kiírása- mentése
public static boolean adatokmentes(String felhasznalonev, String jelszo, String hely) {
    try {
        FileWriter fajlIras = new FileWriter("jelszavak.txt");
        PrintWriter iro = new PrintWriter(fajlIras);
        iro.println("Felhasználónév: " + felhasznalonev);
        iro.println("Jelszó: " + jelszo); iro.println("Hely: " + hely); iro.close();
        return true;
    } catch (IOException e) {
        System.err.println("Fájlba írás sikertelen: " + e.getMessage());
        return false;
    }
}
}
