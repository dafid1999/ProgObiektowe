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
        po2.dodaj(new Student("Adrian","Albrecht",4),"bdb");
        po2.dodaj(new Student("Amadeusz","Albrecht",3),"db");
        po2.dodaj(new Student("Adrian","Albrecht",1),"dst");
        po2.dodaj(new Student("Adrian","Paterson",2),"ndst");
        po2.wypisz();
        po2.usun(3);
        po2.zmien(2,"dst+");
        po2.wypisz();

        FunMieszajaca fm= new FunMieszajaca("alice30.txt");
    }
}
