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

        Adres ad1= new Adres("Narciarska",15,"Elbląg","82-300");
        Adres ad2= new Adres("Narciarska",15, 3,"Elbląg","82-301");
        Adres ad3= new Adres("Narciarska",15, 3,"Elbląg","82-299");
        ad1.pokaz();
        ad2.pokaz();
        System.out.println(ad1.przed(ad2));
        System.out.println(ad1.przed(ad3));

        Osoba Marian= new Osoba("Paździoch",1999);
        Student Adam = new Student("Małysz",1978,"informatyka");
        Nauczyciel Ignacy = new Nauczyciel("Paderewski",1888,23000);
        System.out.println(Marian);
        System.out.println(Marian);
        System.out.println(Adam);
        System.out.println(Adam.getKierunek());
        System.out.println(Marian.getNazwisko());
        System.out.println(Marian.getRokUrodzenia());
        System.out.println(Ignacy.getPensja());
    }
}




