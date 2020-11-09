package pl.imiajd.borawski;

public class Student extends Osoba {
    private String kierunek;

    public Student(String nazwisko, int dataUrodzenia, String kierunek){
        super(nazwisko,dataUrodzenia);
        this.kierunek=kierunek;
    }

    public String getKierunek() {
        return this.kierunek;
    }

    @Override
    public String toString() {
        return super.toString()+"\nKierunek: "+this.kierunek;
    }
}
