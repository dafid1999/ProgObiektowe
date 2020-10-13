import java.util.Scanner;

public class Zadanie2_2 {
    public void dodatnie(int n){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Podaj %d liczb naturalnych\n",n);
        int i=0;
        int suma=0;
        while(i<n) {
            int liczba = scan.nextInt();
            if(liczba>0) {
                suma+=liczba;
            }
            i++;
        }
        System.out.println("Podwojona suma liczb dodatnich z podanych to: "+suma*2);
    }
}

