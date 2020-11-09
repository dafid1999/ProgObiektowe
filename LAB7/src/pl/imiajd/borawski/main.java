package pl.imiajd.borawski;

public class main {
    public static void main(String[] args) {
        NazwanyPunkt a = new NazwanyPunkt(10, 25, "AMMO Nation");
        a.show();

        Punkt b = new Punkt(0, 0);
        b.show();

        Punkt c = new NazwanyPunkt(8, 2, "Fryzjer");
        c.show();

        a = (NazwanyPunkt) c;
        a.show();

        Adres ad1= new Adres("Senatorska",95,"Białystok","19-260");
        ad1.pokaz();

        Adres ad2= new Adres("Wiejska",1, 1,"Warszawa","00-001");
        ad2.pokaz();

        Adres ad3= new Adres("Narciarska",15, 23,"Zakopane","94-299");
        ad3.pokaz();

        System.out.println(ad1.przed(ad2));
        System.out.println(ad1.przed(ad3));

        Osoba Marian= new Osoba("Paździoch",1999);
        System.out.println(Marian);
        System.out.println(Marian.getNazwisko());
        System.out.println(Marian.getRokUrodzenia());

        Student Adam = new Student("Małysz",1978,"informatyka");
        System.out.println(Adam);
        System.out.println(Adam.getKierunek());

        Nauczyciel Ignacy = new Nauczyciel("Paderewski",1888,23000);
        System.out.println(Ignacy);
        System.out.println(Ignacy.getPensja());

        BetterRectangle kwadrat = new BetterRectangle(3,3,5,5);
        System.out.println(kwadrat.getArea());
        System.out.println(kwadrat.getPerimeter());

        BetterRectangle prostokat = new BetterRectangle(1,2,10,4);
        System.out.println(prostokat.getArea());
        System.out.println(prostokat.getPerimeter());
    }
}




