import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String napis1 = scan.next();
        String napis2 = scan.next();
        char znak = 'a';

        Zadanie1 p1 = new Zadanie1();
        System.out.println(p1.countChar(napis1,znak));
        System.out.println(p1.countSubStr(napis1,napis2));
        System.out.println(p1.middle(napis1));
        System.out.println(p1.repeat(napis1,5));
        System.out.println(p1.nice(napis1));
        System.out.println(p1.nice(napis1,'b',5));
        printtab(p1.where(napis1,napis2));

        Zadanie2 p2 = new Zadanie2("Zadanie2.txt",'f');

        Zadanie3 p3 = new Zadanie3("Zadanie3.txt",napis1);

        Zadanie4 p4 = new Zadanie4();
        System.out.println(p4.szachownica(10));

        Zadanie5 p5 = new Zadanie5();
        System.out.println(p5.kapitał((float) 2.5,10000,5));
    }

    static void printtab(int[] tab){
        for(int i=0;i<tab.length;i++){
            System.out.println(tab[i]);
        }
    }
}
