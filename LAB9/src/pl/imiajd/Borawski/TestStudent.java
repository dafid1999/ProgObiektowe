package pl.imiajd.Borawski;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<>(5);
        grupa.add(new Student("Borawski", LocalDate.of(1999,7,19),4.5));
        grupa.add(new Student("Borawski", LocalDate.of(2000,5,11),4.0));
        grupa.add(new Student("Małysz", LocalDate.of(1977,1,12),3.0));
        grupa.add(new Student("Hula", LocalDate.of(1977,1,12),3.5));
        grupa.add(new Student("Stoch", LocalDate.of(1989,9,22),4.0));

        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);
    }
}
