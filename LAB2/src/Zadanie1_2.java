import java.util.Scanner;

public class Zadanie1_2 {
    Scanner scan = new Scanner(System.in);
    public void zad(int n){
        double[] tab = new double[n];
        int i=0;
        System.out.printf("Wypisz %d liczb rzeczywistych\n",n);
        while(i<tab.length)
        {
            tab[i] = scan.nextDouble();
            i++;
        }
        System.out.print("Liczby po przestawieniu:\n");
        for(i=1;i<tab.length;i++)
        {
            System.out.print(tab[i]);
            System.out.print(", ");
        }
        System.out.println(tab[0]);
    }

}
