import java.time.LocalDate;
import java.util.*;

public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Jan Kowalski", 50000,LocalDate.of(2017, 1, 13));
        ludzie[1] = new Student("Małgorzata Nowak", "informatyka",4.5);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
        }
    }
}

abstract class Osoba
{
    public Osoba(String nazwisko, String imiona, LocalDate dataUrodzenia, boolean plec)
    {
        this.nazwisko = nazwisko;
        this.imiona = imiona;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }

    public Osoba(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public abstract String getOpis();

    public String getNazwisko()
    {
        return this.nazwisko;
    }

    public String getImiona() {
        return this.imiona;
    }

    public LocalDate getDataUrodzenia() {
        return this.dataUrodzenia;
    }

    public boolean isPlec() {
        return this.plec;
    }

    private String nazwisko;
    private String imiona;
    private LocalDate dataUrodzenia;
    private boolean plec;
}

class Pracownik extends Osoba
{
    public Pracownik(String nazwisko, double pobory, LocalDate dataZatrudnienia)
    {
        super(nazwisko);
        this.pobory = pobory;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public double getPobory()
    {
        return this.pobory;
    }

    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł", pobory)+"\nData zatrudnienia: "+this.dataZatrudnienia;
    }

    public LocalDate getDataZatrudnienia() {
        return this.dataZatrudnienia;
    }

    private double pobory;
    private LocalDate dataZatrudnienia;
}


class Student extends Osoba
{
    public Student(String nazwisko, String kierunek, double sredniaOcen)
    {
        super(nazwisko);
        this.kierunek = kierunek;
        this.sredniaOcen = sredniaOcen;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + this.kierunek + "\nSrednia ocen: "+this.sredniaOcen;
    }

    public double getSredniaOcen() {
        return this.sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    private String kierunek;
    private double sredniaOcen;
}