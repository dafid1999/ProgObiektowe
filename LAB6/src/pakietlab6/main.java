package pakietlab6;

public class main {
    public static void main(String[] args) {
        System.out.println("Witam w programie testujący LAB6");

        // Zad1
        RachunekBankowy saver1 = new RachunekBankowy(2000);
        RachunekBankowy saver2 = new RachunekBankowy(3000);

        System.out.println(saver1.getSaldo());
        System.out.println(saver2.getSaldo());

        RachunekBankowy.setRocznaStopaProcentowa(0.04);

        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();

        System.out.println(saver1.getSaldo());
        System.out.println(saver2.getSaldo());

        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();

        System.out.println(saver1.getSaldo());
        System.out.println(saver2.getSaldo());

        //Zad2
        IntegerSet zbior1= new IntegerSet();
        zbior1.insertElement(11);
        zbior1.insertElement(39);
        zbior1.insertElement(69);
        zbior1.insertElement(99);
        zbior1.insertElement(5);
        System.out.println(zbior1);

        IntegerSet zbior2= new IntegerSet();
        zbior2.insertElement(23);
        zbior2.insertElement(33);
        zbior2.insertElement(51);
        zbior2.insertElement(15);
        zbior2.insertElement(92);
        System.out.println(zbior2);

        zbior1.deleteElement(39);
        System.out.println(zbior1);

        zbior2.deleteElement(92);
        System.out.println(zbior2);

        System.out.println(IntegerSet.union(zbior1,zbior2));
        System.out.println(IntegerSet.intersection(zbior1,zbior2));

        System.out.println(zbior1.equals(zbior2));

        IntegerSet zbior3= new IntegerSet();
        zbior3.insertElement(11);
        zbior3.insertElement(69);

        System.out.println(zbior1.equals(zbior3));

        zbior3.insertElement(99);
        zbior3.insertElement(5);

        System.out.println(zbior1.equals(zbior3));

        //Zad3
        Pracownik[] personel = new Pracownik[3];

        // wypełnij tablicę danymi pracowników
        personel[0] = new Pracownik("Karol Cracker", 75000, 2001, 12, 15);
        personel[1] = new Pracownik("Henryk Hacker", 50000, 2003, 10, 1);
        personel[2] = new Pracownik("Antoni Tester", 40000, 2005, 3, 15);

        // zwiększ pobory każdego pracownika o 20%
        for (Pracownik e : personel) {
            e.zwiekszPobory(20);
        }

        // wypisz informacje o każdym pracowniku
        for (Pracownik e : personel) {
            System.out.print("nazwisko = " + e.nazwisko() + "\tpobory = " + e.pobory());
            System.out.printf("\tdataZatrudnienia = %tF\n", e.dataZatrudnienia());
        }
        System.out.println();

    }
}
