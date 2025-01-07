/*
* File: App.java
* Author: Bencsik Boglár Bianka
* Copyright: 2024, Bencsik Boglár Bianka
* Date: 2024-01-07
* Github: https://github.com/oktat/
* Licenc: MIT
*/


//Itt következik a Store osztály
public class Store {
    private final String pass;
    private final String UserN;
    private final String place;
//Konstruktor
    public Store(String pass, String UserN, String place) {
        this.pass = pass;
        this.UserN = UserN;
        this.place = place;
    }
//Konstruktor vege
//Visszaadja a jelszót
    public String getJelszo() {
        return pass;
    }
 //Visszaadja a felhasznalonevet
    public String getUsername() {
        return UserN;
    }
 //Visszaadja a helyet
    public String getPlace() {
        return place;
    }

    public boolean isUres() {
        return pass.isEmpty() || UserN.isEmpty() || place.isEmpty();
    }
}
