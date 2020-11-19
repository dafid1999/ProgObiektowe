package pl.edu.uwm.obiektowe.s156783.kolo1;

import java.time.LocalDate;

public class Pracownik extends  Osoba{

    public Pracownik(String imie, String nazwisko, LocalDate dataUrodzenia, String stanowisko, double pensja) {
        super(imie, nazwisko, dataUrodzenia);
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    public Pracownik(Osoba osoba, String stanowisko, double pensja){
        super(osoba.getImie(),osoba.getNazwisko(),osoba.getDataUrodzenia());
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return super.toString() + " jest pracownikiem na stanowisku " + this.stanowisko + " z pensją " + (double)Math.round(this.pensja*100)/100 + " zł";
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public double getPensja() {
        return pensja;
    }

    private String stanowisko;
    private double pensja;
}
