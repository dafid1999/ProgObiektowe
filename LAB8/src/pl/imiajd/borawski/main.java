package pl.imiajd.borawski;

import java.time.LocalDate;

public class main {
        public static void main(String[] args){
        {
            Osoba[] ludzie = new Osoba[2];

            ludzie[0] = new Pracownik("Jan Kowalski", 50000, LocalDate.of(2017, 1, 13));
            ludzie[1] = new Student("Małgorzata Nowak", "informatyka",4.5);
            // ludzie[2] = new Osoba("Dyl Sowizdrzał");

            for (Osoba p : ludzie) {
                System.out.println(p.getNazwisko() + ": " + p.getOpis());
            }
        }
    }

}
