package pl.imiajd.Borawski;

import java.time.LocalDate;

public class Osoba implements Cloneable, Comparable{
    private  String nazwisko;
    private LocalDate dataUrodzenia;

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
