import java.util.Scanner;

public class Zadanie2_5 {
    public void pary(int n){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Podaj %d liczb naturalnych\n",n);
        int i=0;
        int ilosc=0;
        int [] temp = new int[n];
        while(i<n) {
            temp[i] = scan.nextInt();
            i++;
        }
        i=1;
        while (i<n){
            if(temp[i-1]>0 & temp[i]>0) {
                ilosc++;
            }

            i++;
        }
        System.out.println("Ilosc par sasiadujacych (a,b) z warunkiem a>0 i b>0: "+ilosc);
    }
}