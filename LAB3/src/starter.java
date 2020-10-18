import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        System.out.println("Starter uruchomiony");
        System.out.println("Proszę wpisać liczbę z przedzialu od 1 do 100\n");

        Scanner scan = new Scanner(System.in);
        int n;
        int i = 0;
        while (true) {
            n = scan.nextInt();
            if (n >= 1 & n <= 100) {
                break;
            } else {
                System.out.println("Proszę poprawnie wpisać liczbę z przedzialu od 1 do 100");
            }
        }

        int[] tab = new int[n];
        for (i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * (999 - (-999) + 1)) - 999;
            System.out.println(tab[i] + " ");
        }

        //a)
        int parzyste = 0;
        int nieparzyste = 0;

        //b)
        int ujemne = 0;
        int dodatnie = 0;
        int zerowe = 0;

        //c)
        int maks = -1000;
        int Ilemaks = 0;

        //d)
        int sumadodatnich = 0;
        int sumaujemnych = 0;

        //e)
        int dlugoscfragmentu = 0;
        int tempdlugosc = 0;
        boolean poprzedniadodatnia = false;

        for (i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                parzyste++;
            } else {
                nieparzyste++;
            }

            if (tab[i] > 0) {
                dodatnie++;
                sumadodatnich += tab[i];
                if (!poprzedniadodatnia) {
                    tempdlugosc = 1;
                    poprzedniadodatnia = true;
                } else {
                    tempdlugosc++;
                }
            } else if (tab[i] < 0) {
                ujemne++;
                sumaujemnych += tab[i];
                poprzedniadodatnia = false;
            } else {
                zerowe++;
                poprzedniadodatnia = false;
            }

            if (maks < tab[i]) {
                maks = tab[i];
            }

            if (tempdlugosc > dlugoscfragmentu) {
                dlugoscfragmentu = tempdlugosc;
            }
        }

        for (i = 0; i < tab.length; i++) {
            if (maks == tab[i]) {
                Ilemaks++;
            }
        }

        System.out.println("Ilość nieparzystych: "+nieparzyste+"\nIlość parzystych: "+parzyste);
        System.out.println("Ilość ujemnych: "+ujemne+"\nIlość dodatnich: "+dodatnie+"\nIlość zerowych: "+zerowe);
        System.out.println("Element największy: "+maks+"  Ilość wystąpień: "+Ilemaks);
        System.out.println("Suma ujemych elementów: "+sumaujemnych+"\nSuma dodatnich elementów: "+sumadodatnich);
        System.out.println("Długość najdłuższego fragmentu tablicy z liczbami dodatnimi: "+dlugoscfragmentu);

        //f)
        for (i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                tab[i]=1;
            }
            else if (tab[i] < 0) {
                tab[i]=-1;
            }

            System.out.println(tab[i]+" ");
        }

        //g)
        int lewy=0;
        int prawy=0;

        System.out.println("Wpisz poprawnie najpierw liczbe z przedzialu od [1;n) oraz potem liczbe wieksza od pierwszej a mniejsza od n");

        while (true){
            lewy=scan.nextInt();
            prawy=scan.nextInt();
            if(lewy>=1 & lewy<n & prawy>=1 & prawy<n & lewy<prawy){
                break;
            }
            else{
                System.out.println("Wpisz poprawnie najpierw liczbe z przedzialu od [1;n) oraz potem liczbe wieksza od pierwszej a mniejsza od n");
            }
        }

        for(i=lewy;i<((lewy+prawy)/2);i++){
            int temp=tab[i];
            int j=prawy;
            tab[i]=tab[j];
            tab[j]=temp;
            j--;
        }
        for(i=0;i< tab.length;i++){
            System.out.println(tab[i]);
        }
    }
}
