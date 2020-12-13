package pl.edu.uewm.obiektowe.s156783.kolo2;

import java.util.ArrayList;

public class Zbior {
    private ArrayList<Liczba> liczby;

    public Zbior() {
        this.liczby = new ArrayList<>();
    }

    public void dodajLiczbę(Liczba l){
        int temp=0;
        for(Liczba liczba:this.liczby) {
            if (liczba==l) {
                temp++;
            }
        }
        if(temp==0){
            this.liczby.add(l);
        }
    }

    public ArrayList<Liczba> getLiczby() {
        return liczby;
    }
}
