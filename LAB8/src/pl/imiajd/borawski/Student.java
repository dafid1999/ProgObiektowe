package pl.imiajd.borawski;

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