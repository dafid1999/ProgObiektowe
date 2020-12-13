package pl.edu.uewm.obiektowe.s156783.kolo2;

public class Test1_2_3_4 {
    public static void main(String[] args) {
        Osobowy auto = new Osobowy("A4",Producent.AUDI);

        System.out.println(auto.cofaj());

        auto.uzyjKlaksonu();

        System.out.println(auto.toString());

        Pojazd.jedzDoPrzodu();

    }
}
