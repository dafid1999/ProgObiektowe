import java.util.Scanner;

public class Zadanie2_1 {
    Scanner scan = new Scanner(System.in);
    int ilosc=0;
    int i=1;

    public void podA(int n){
        System.out.printf("Podaj %d liczb naturalnych\n",n);
        while(i<=n)
        {
            int liczba=scan.nextInt();
            if(liczba%2==1)
            {
                this.ilosc++;
            }
            i++;
        }
        System.out.println("Ilosc liczb nieparzystych: "+this.ilosc);

    }
    public void podB(int n){
        i=1;
        ilosc=0;
        System.out.printf("Podaj %d liczb naturalnych\n",n);
        while(i<=n)
        {
            int liczba=scan.nextInt();
            if(liczba % 3 == 0 & liczba % 5!=0)
            {
                ilosc++;
            }
            i++;
        }
        System.out.println("Ilosc liczb podzielnych przez 3 i niepodzielnych przez 5: "+ilosc);
    }
    public void podC(int n){
        i=1;
        ilosc=0;
        System.out.printf("Podaj %d liczb naturalnych\n",n);
        while(i<=n)
        {
            int liczba=scan.nextInt();
            if(Math.sqrt(liczba) %2 == 0)
            {
                ilosc++;
            }
            i++;
        }
        System.out.println("Ilosc liczb które są kwadratami liczb parzystych: "+ilosc);
    }
    public void podD(int n){
        int [] liczby= new int[n];
        i=0;
        ilosc=0;
        System.out.printf("Podaj %d liczb naturalnych\n",n);
        while(i<n)
        {
            liczby[i]=scan.nextInt();
            i++;
        }

        for(i=1;i<n-1;i++)
        {
            if (liczby[i] < (double)(liczby[i - 1] + liczby[i + 1]) / 2) {
                    ilosc++;
            }
        }

        System.out.println("Ilosc liczb spełniające warunek: "+ilosc);
    }
    public void podE(int n){
        int silnia=1;
        i=1;
        ilosc=0;
        System.out.printf("Podaj %d liczb naturalnych\n",n);
        while(i<=n)
        {
            int liczba=scan.nextInt();
            silnia*=i;
            if((liczba>Math.pow(2,i)) & (liczba<silnia)) {
                ilosc++;
            }
            i++;
        }
        System.out.println("Ilosc liczb spełniające warunek: "+ilosc);
    }

    public void podF(int n){
        i=1;
        ilosc=0;
        System.out.printf("Podaj %d liczb naturalnych\n",n);
        while(i<=n)
        {
            int liczba=scan.nextInt();
            if(i % 2 != 0 & liczba % 2 == 0)
            {
                ilosc++;
            }
            i++;
        }
        System.out.println("Ilosc liczb spełniające warunek: "+ilosc);
    }
    public void podG(int n){
        i=1;
        ilosc=0;
        System.out.printf("Podaj %d liczb naturalnych\n",n);
        while(i<=n)
        {
            int liczba=scan.nextInt();
            if(liczba % 2 != 0 & liczba>=0)
            {
                ilosc++;
            }
            i++;
        }
        System.out.println("Ilosc liczb spełniające warunek: "+ilosc);
    }
    public void podH(int n){
        i=1;
        ilosc=0;
        System.out.printf("Podaj %d liczb naturalnych\n",n);
        while(i<=n)
        {
            int liczba=scan.nextInt();
            if(Math.abs(liczba)<Math.pow(i,2))
            {
                ilosc++;
            }
            i++;
        }
        System.out.println("Ilosc liczb spełniające warunek: "+ilosc);
    }
}
