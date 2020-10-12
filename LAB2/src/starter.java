import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        System.out.println("Starter jest gotowy do działania! :)");

        /*Zadanie1_1 zad1 = new Zadanie1_1();
        zad1.podA(getN());
        zad1.podB(getN());
        zad1.podC(getN());
        zad1.podD(getN());
        zad1.podE(getN());
        zad1.podF(getN());
        zad1.podG(getN());
        zad1.podH(getN());
        zad1.podI(getN());

        Zadanie1_2 zad2 = new Zadanie1_2();
        zad2.zad(getN());*/

        Zadanie2_1 zad3 = new Zadanie2_1();
        /*zad3.podA(getN());
        zad3.podB(getN());
        zad3.podC(getN());
        zad3.podD(getN());
        zad3.podE(getN());
        zad3.podF(getN());
        zad3.podG(getN());*/
        zad3.podH(getN());
    }

    public static int getN(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę naturalną:");
        return Integer.parseInt(scan.nextLine());
    }
}
