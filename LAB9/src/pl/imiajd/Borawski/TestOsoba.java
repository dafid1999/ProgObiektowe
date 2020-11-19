package pl.imiajd.Borawski;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestOsoba {
    public static void main(String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<>(5);
        grupa.add(new Osoba("Borawski", LocalDate.of(1999,7,19)));
        grupa.add(new Osoba("Borawski", LocalDate.of(2000,5,11)));
        grupa.add(new Osoba("Małysz", LocalDate.of(1977,1,12)));
        grupa.add(new Osoba("Hula", LocalDate.of(1977,1,12)));
        grupa.add(new Osoba("Stoch", LocalDate.of(1989,9,22)));

        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);


    }
}
