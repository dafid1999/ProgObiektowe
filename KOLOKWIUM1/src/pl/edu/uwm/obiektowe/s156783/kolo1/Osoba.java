package pl.edu.uwm.obiektowe.s156783.kolo1;

import java.time.LocalDate;
import java.time.Period;

import static java.time.LocalDate.now;

public class Osoba {

    public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.wiek = obliczwiek();
    }

    private int obliczwiek(){
        LocalDate dzis= now();
        if (dataUrodzenia.isAfter(dzis)){
            System.out.println("Nieprawidłowa data urodzenia!");
        }
        wiek=Period.between(dataUrodzenia,dzis).getYears();

        return wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public int getWiek() {
        return wiek;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
        this.zladata();
        this.obliczwiek();
    }

    private void zladata(){
        while(this.dataUrodzenia.isAfter(LocalDate.now())){
            System.out.println("Nieprawidłowa data urodzenia! Ustawiam domyślnie 2000-01-01");
            this.setDataUrodzenia(LocalDate.of(2000,1,1));
        }
    }

    @Override
    public String toString() {
        return "Osoba "+ imie + " " + nazwisko + " urodzona " + dataUrodzenia + " wiek " + wiek;
    }

    private String imie;
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private int wiek;
}
