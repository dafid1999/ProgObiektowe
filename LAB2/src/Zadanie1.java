import java.util.Scanner;


public class Zadanie1 {
    double suma=0;
    double iloczyn=1;

    Scanner scan = new Scanner(System.in);

    public void podA(int n) {
        int a=1;
        System.out.printf("Podpunkt A:\nPodaj %d liczb rzeczywistych, każda w nowym wierszu\n", n);
        while (a <= n) {
            suma += scan.nextDouble();
            a++;
        }
        System.out.printf("Suma podanych liczb to %f\n", suma);
    }
    public void podB(int n){
        int a=1;
        System.out.printf("Podpunkt B:\nPodaj %d liczb rzeczywistych, każda w nowym wierszu\n", n);

        while (a <= n) {
            iloczyn *= scan.nextDouble();
            a++;
        }
        System.out.printf("Iloczyn podanych liczb to %f\n", iloczyn);
    }
    public void podC(int n){
        int a=1;
        System.out.printf("Podpunkt C:\nPodaj %d liczb rzeczywistych, każda w nowym wierszu\n", n);

        while (a <= n) {
            suma += Math.abs(scan.nextDouble());
            a++;
        }
        System.out.printf("Suma bezwzględna podanych liczb to %f\n", suma);
    }
    public void podD(int n){
        int a=1;
        System.out.printf("Podpunkt D:\nPodaj %d liczb rzeczywistych, każda w nowym wierszu\n", n);

        while (a <= n) {
            suma += Math.sqrt(Math.abs(scan.nextDouble()));
            a++;
        }
        System.out.printf("Suma bezwzględna pierwiastków podanych liczb to %f\n", suma);
    }
    public void podE(int n){
        int a=1;
        System.out.printf("Podpunkt E:\nPodaj %d liczb rzeczywistych, każda w nowym wierszu\n", n);

        while (a <= n) {
            iloczyn *= Math.abs(scan.nextDouble());
            a++;
        }
        System.out.printf("Iloczyn bezwzględny podanych liczb to %f\n", iloczyn);
    }
    public void podF(int n){
        int a=1;
        System.out.printf("Podpunkt F:\nPodaj %d liczb rzeczywistych, każda w nowym wierszu\n", n);

        while (a <= n) {
            suma += Math.pow(scan.nextDouble(),2);
            a++;
        }
        System.out.printf("Suma kwadratów podanych liczb to %f\n", suma);
    }
    public void podG(int n){
        int a=1;
        System.out.printf("Podpunkt G:\nPodaj %d liczb rzeczywistych, każda w nowym wierszu\n", n);

        while (a <= n) {
            double liczby= scan.nextDouble();
            suma += liczby;
            iloczyn *=liczby;
            a++;
        }
        System.out.printf("Suma, sumy i iloczynu podanych liczb to %f\n", suma+iloczyn);
    }
    public void podH(int n) {
        int a = 1;
        System.out.printf("Podpunkt H:\nPodaj %d liczb rzeczywistych, każda w nowym wierszu\n", n);

        while (a <= n) {
            double liczby = scan.nextDouble();
            suma += Math.pow(-1, a + 1) * liczby;
            a++;
        }

        System.out.printf("a1 - a2 + a3 -...+ (-1)^n+1 * an podanych liczb to %f\n", suma);
    }
    public void podI(int n) {
        int a = 1;
        System.out.printf("Podpunkt I:\nPodaj %d liczb rzeczywistych, każda w nowym wierszu\n", n);

        while (a <= n) {
            double liczby = scan.nextDouble();
            int silnia=1;

            for (int b = 1; b <= a; b++) {
                silnia *=b;
            }

            suma += (Math.pow(-1, a) * liczby) / silnia;
            a++;
        }

        System.out.printf("(-1)^n * an/n! podanych liczb to %f\n", suma);
    }
}
/*if (a % 2 == 0) {
        suma += liczby;
        } else {
        suma -= liczby;
        }

 */