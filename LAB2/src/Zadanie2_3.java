import java.util.Scanner;

public class Zadanie2_3 {
    public void pol(int n){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Podaj %d liczb naturalnych\n",n);
        int i=0;
        int dodatnie=0;
        int ujemne=0;
        int zera=0;
        while(i<n) {
            int liczba = scan.nextInt();
            if(liczba>0) {
                dodatnie++;
            }
            else if(liczba<0) {
                ujemne++;
            }
            else{
                zera++;
            }
            i++;
        }
        System.out.println("Ilosc liczb:\nDodatnich: "+dodatnie+"\nUjemnych: "+ujemne+"\nZerowych: "+zera);
    }
}