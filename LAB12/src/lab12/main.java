package lab12;

import java.io.FileNotFoundException;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Egzamin po = new Egzamin();
        po.dodaj("Carl", "db+");
        po.dodaj("Joe","db");
        po.dodaj("Susan","bdb");
        po.wypisz();

        po.usun("Susan");
        po.zmien("Carl","db-");
        po.wypisz();

        Egzamin2 po2= new Egzamin2();
        po2.dodaj(new Student("Dawid","Borawski",4),"bdb");
        po2.dodaj(new Student("Adam","Małysz",3),"dst");
        po2.dodaj(new Student("Kamil","Stoch",1),"db");
        po2.dodaj(new Student("Adrian","Zielinski",2),"ndst");
        po2.wypisz();
        po2.usun(4);
        po2.zmien(4,"bdb");
        po2.wypisz();

        FunMieszajaca fm= new FunMieszajaca("alice30.txt");
    }
}
