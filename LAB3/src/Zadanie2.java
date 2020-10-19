import java.util.Random;
import java.util.Scanner;

public class Zadanie2 {
    public static int wczytaj() {
        int n;
        Scanner scan = new Scanner(System.in);
        while (true) {
            n = scan.nextInt();
            if (n >= 1 & n <= 100) {
                break;
            } else {
                System.out.println("Proszę poprawnie wpisać liczbę z przedzialu od 1 do 100");
            }
        }
        return n;
    }

    public static void generuj(int[] tab, int n, int minWartosc, int maxWartosc) {
        Random r = new Random();

        for (int i = 0; i < n; i++) {
            tab[i] = minWartosc + (int) (Math.random() * (maxWartosc - minWartosc + 1));
        }
    }

    public static void wypisz(int[] tab) {
        for (int el : tab) {
            System.out.print(el + " ");
        }
        System.out.println("");
    }

    public static int ileNieparzystych(int[] tab) {
        int nieparzyste = 0;
        for (int i : tab) {
            if (i % 2 != 0) {
                nieparzyste++;
            }
        }
        return nieparzyste;
    }

    public static int ileParzystych(int[] tab) {
        int parzyste = 0;
        for (int i : tab) {
            if (i % 2 == 0) {
                parzyste++;
            }
        }
        return parzyste;
    }

    public static int ileDodatnich(int[] tab) {
        int dodatnie = 0;
        for (int i : tab) {
            if (i > 0) {
                dodatnie++;
            }
        }
        return dodatnie;
    }

    public static int ileUjemnych(int[] tab) {
        int ujemne = 0;
        for (int i : tab) {
            if (i < 0) {
                ujemne++;
            }
        }
        return ujemne;
    }

    public static int ileZerowych(int[] tab) {
        int zerowe = 0;
        for (int i : tab) {
            if (i == 0) {
                zerowe++;
            }
        }
        return zerowe;
    }

    public static int ileMaksymalnych(int[] tab) {
        int ilemaks = 0;
        int maks = -1000;
        for (int j : tab) {
            if (j > maks) {
                maks = j;
            }
        }
        for (int i : tab) {
            if (i == maks) {
                ilemaks++;
            }
        }
        return ilemaks;
    }

    public static int sumaDodatnich(int[] tab) {
        int suma = 0;
        for (int i : tab) {
            if (i > 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static int sumaUjemnych(int[] tab) {
        int suma = 0;
        for (int i : tab) {
            if (i < 0) {
                suma += i;
            }
        }
        return suma;
    }
    public static int dlugoscMaksymalnegoCiaguDodatnich (int [] tab){
        boolean czy_dodatnia=false;
        int ile=0;
        int temp=0;
        for(int i: tab){
            if(i>0){
                if(!czy_dodatnia){
                    temp=1;
                    czy_dodatnia=true;
                }
                else{
                    temp++;
                }
            }
            else czy_dodatnia=false;
            if(temp>ile) {
                ile=temp;
            }
        }
        return ile;
    }
    public static void signum(int [] tab){
        for(int i=0; i<tab.length;i++){
            if(tab[i]>0) {
                tab[i]=1;
            }
            else if(tab[i]<0) {
                tab[i]=-1;
            }
        }
        System.out.print("Zmieniona tablica:\n ");
        for(int i: tab){
            System.out.println(i+" ");
        }
        System.out.println();
    }
    public static void odwrocFragment(int [] tab,int lewy,int prawy){
        int temp;
        for(int i=lewy;i<((lewy+prawy)/2);i++){
            temp=tab[i];
            int j=prawy;
            tab[i]=tab[j];
            tab[j]=temp;
            j--;
        }
        System.out.print("Zmieniona tablica:\n ");
        for(int i: tab){
            System.out.println(i+" ");
        }
        System.out.println();
    }
}