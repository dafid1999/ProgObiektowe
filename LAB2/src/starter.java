import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        System.out.println("Starter jest gotowy do działania! :)");

        Zadanie1 zad1 = new Zadanie1();
        zad1.podA(getN());
        zad1.podB(getN());
        zad1.podC(getN());
        zad1.podD(getN());
        zad1.podE(getN());
        zad1.podF(getN());
        zad1.podG(getN());
        zad1.podH(getN());
        zad1.podI(getN());
    }

    public static int getN(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę naturalną:");
        return Integer.parseInt(scan.nextLine());
    }
}
