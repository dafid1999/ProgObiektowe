package pl.imiajd.borawski;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrumenty {
    public static void main(String[] args) {
        ArrayList<Instrument> orkiestra = new ArrayList<>();

        orkiestra.add(new Fortepian("Bosendorfer", LocalDate.of(2020,10,20)));
        orkiestra.add(new Fortepian("Bechtstein", LocalDate.of(2018,2,8)));
        orkiestra.add(new Skrzypce("Stentor", LocalDate.of(2000,6,2)));
        orkiestra.add(new Flet("Grand", LocalDate.of(2018,12,2)));
        orkiestra.add(new Flet("Thomann", LocalDate.of(2008,10,5)));


        for(Instrument i: orkiestra){
            System.out.println("\n"+i);
            System.out.print("dzwiek: "+i.dzwiek());
        }
        System.out.println("\n"+orkiestra.get(0).equals(orkiestra.get(4)));
        System.out.println(orkiestra.get(2).equals(orkiestra.get(3)));
        System.out.println(orkiestra.get(1).equals(orkiestra.get(0)));
        System.out.println(orkiestra.get(4).equals(orkiestra.get(2)));
        System.out.println(orkiestra.get(1).getProducent());
        System.out.println(orkiestra.get(2).getRokProdukcji());
    }
}
