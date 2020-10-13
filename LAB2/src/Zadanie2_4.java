import java.util.Scanner;

public class Zadanie2_4 {
    public void mami(int n){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Podaj %d liczb naturalnych\n",n);
        int i=0;
        int maks=0;
        int min=0;
        while(i<n) {
            int liczba = scan.nextInt();
            if(liczba>maks) {
                maks=liczba;
            }
            else if(liczba<min) {
                min=liczba;
            }

            i++;
        }
        System.out.println("Najwieksza liczba: "+maks+"\nNajmniejsza liczba: "+min);
    }
}