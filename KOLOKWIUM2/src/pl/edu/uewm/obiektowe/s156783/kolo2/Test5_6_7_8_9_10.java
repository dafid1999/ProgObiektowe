package pl.edu.uewm.obiektowe.s156783.kolo2;

import java.util.Stack;

public class Test5_6_7_8_9_10 {
    public static void main(String[] args) {
        Liczba doubleLiczba = new Liczba<Double>(2.8d);
        Liczba integerLiczba = new Liczba<Integer>(99);
        Liczba longLiczba = new Liczba<Long>((long) 1920319238);
        Liczba floatLiczba = new Liczba<Float>(6.9f);
        Liczba shortLiczba = new Liczba<Short>((short) 1);
        Liczba shortLiczba1 = new Liczba<Short>((short) 1);

        Stack<Liczba> stos = new Stack<>();
        stos.add(doubleLiczba);
        stos.add(integerLiczba);
        stos.add(longLiczba);
        stos.add(floatLiczba);
        stos.add(shortLiczba);

        Zbior zbior = new Zbior();
        while(!stos.empty()){
            zbior.dodajLiczbę(stos.pop());
        }

        zbior.dodajLiczbę(shortLiczba1);

        for(Liczba liczba: zbior.getLiczby()){
            System.out.println(liczba.getValue());
        }
    }
}
