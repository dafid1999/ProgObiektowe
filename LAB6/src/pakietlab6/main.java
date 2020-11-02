package pakietlab6;

public class main {
    public static void main(String[] args) {
        System.out.println("Witam w programie testujący LAB6");

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
    }
}
