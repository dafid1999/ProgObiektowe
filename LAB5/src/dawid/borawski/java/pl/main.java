package dawid.borawski.java.pl;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.out.println("Plik startowy LABu5 wystartował poprawnie!");
        ArrayList<Integer>a = new ArrayList<>(Arrays.asList(1,4,9,16));
        ArrayList<Integer>b = new ArrayList<>(Arrays.asList(9,7,4,9,11));

        System.out.println(a);
        System.out.println(b);

        System.out.println("Zadanie1");
        System.out.println(Zadanie1.append(a,b));
        System.out.println("Zadanie2");
        System.out.println(Zadanie2.merge(a,b));
        System.out.println("Zadanie3");
        System.out.println(Zadanie3.mergeSorted(a,b));
        System.out.println("Zadanie4");
        System.out.println(Zadanie4.reversed(a));
        System.out.println(Zadanie4.reversed(b));
        System.out.println("Zadanie5");
        System.out.println(Zadanie5.reverse(a));
        System.out.println(Zadanie5.reverse(b));
    }
}
