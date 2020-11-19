package pl.imiajd.Borawski;

import java.time.LocalDate;

public class Osoba implements Cloneable, Comparable<Osoba>{
    private  String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [" + this.nazwisko + " " + this.dataUrodzenia.toString() + "]";
    }

    @Override
    public boolean equals(Object o){
        Osoba os = (Osoba) o;
        return (os.nazwisko.equals(this.nazwisko)) && os.dataUrodzenia.equals(this.dataUrodzenia.toString());
    }

    @Override
    public int compareTo(Osoba o) {
        int comp = this.nazwisko.compareTo(o.nazwisko);
        if(comp ==0){
            return this.dataUrodzenia.compareTo(o.dataUrodzenia);
        }
        return comp;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }
}
