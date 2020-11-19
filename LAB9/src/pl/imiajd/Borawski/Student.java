package pl.imiajd.Borawski;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba>{
    private double sredniaOcen;

    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [" + this.getNazwisko() + " " + this.getDataUrodzenia().toString() + " " + this.sredniaOcen + "]";
    }

    @Override
    public int compareTo(Osoba o) {
        int comp = super.compareTo((o));
        if((comp ==0) && (o instanceof Student)){
            return -(int)Math.ceil(this.sredniaOcen-((Student) o).sredniaOcen);
        }
        return comp;
    }
}
