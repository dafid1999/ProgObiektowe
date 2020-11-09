package pl.imiajd.borawski;

import java.time.LocalDate;

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
