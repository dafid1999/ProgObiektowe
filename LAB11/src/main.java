import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        LinkedList<String> pracownicy=new LinkedList<>();
        pracownicy.add("Dawid");
        pracownicy.add("Mateusz");
        pracownicy.add("Aleksander");
        pracownicy.add("Konrad");
        pracownicy.add("Patryk");
        pracownicy.add("Lukasz");
        pracownicy.add("Tomasz");
        System.out.println(pracownicy);

        redukuj(pracownicy,3);
        System.out.println(pracownicy);

        odwroc(pracownicy);
        System.out.println(pracownicy);

        odwroc(pracownicy);
        System.out.println(pracownicy);

        System.out.println(odwrocone_zdania("Ala ma kota. Jej kot lubi myszy."));

        cyfry(2015);

        sit_erastotenesa(99);

        print(pracownicy);

    }

    public static <T> void redukuj(LinkedList<T> pracownicy, int n){
        int i=n-1;
        while( i < pracownicy.size()){
            if(i%(n-1)==0){
                pracownicy.remove(i);
            }
            i++;
        }
    }

    public static <T> void odwroc(LinkedList<T> lista){
        LinkedList<T> temp = new LinkedList<>(lista);

        for (int i = lista.size() - 1, j=0; i >= 0; i--, j++) {
            lista.set(j,temp.get(i));
        }
    }

    public static String odwrocone_zdania(String zdanie){
        String[] slowa= zdanie.split(" ");
        Stack<String> stos= new Stack<>();
        StringBuilder odwrocone= new StringBuilder();
        for(String slowo: slowa){
            stos.push(slowo);
            if(slowo.endsWith(".")){
                while(!stos.empty()){
                    StringBuilder slowo_odwrocone = new StringBuilder();
                    slowo_odwrocone.append(stos.pop());
                    if(stos.empty()){
                        slowo_odwrocone.setCharAt(0,Character.toLowerCase(slowo_odwrocone.charAt(0)));
                        odwrocone.append(slowo_odwrocone);
                        odwrocone.append(". ");
                    }
                    else if(slowo_odwrocone.toString().equals(slowo)){
                        slowo_odwrocone.setCharAt(0,Character.toUpperCase(slowo_odwrocone.charAt(0)));
                        odwrocone.append(slowo_odwrocone, 0, slowo_odwrocone.length()-1);
                        odwrocone.append(" ");
                    }
                    else{
                        odwrocone.append(slowo_odwrocone);
                        odwrocone.append(" ");
                    }
                }
            }
        }
        return odwrocone.toString();
    }

    public static void cyfry(int liczba){
        Stack<Integer> stos = new Stack<>();
        while(liczba!=0){
            stos.push(liczba%10);
            liczba/=10;
        }
        while(!stos.empty()){
            System.out.print(stos.pop()+" ");
        }
        System.out.println();
    }

    public static void sit_erastotenesa(int n){
        BitSet bit = new BitSet(n+1);
        for(int i=2; i<=n;i++){
            bit.set(i);
        }
        int i=2;

        while(i*i<=n){
            if(bit.get(i)){
                int j= 2 * i;
                while(j<=n){
                    bit.clear(j);
                    j+=i;
                }
            }
            i++;
        }
        int[] primes= bit.stream().toArray();
        for(int x: primes){
            System.out.println(x+" ");
        }
        System.out.println();
    }

    public static <T extends Iterable<?>> void print(T object){
        Iterator<?> iterator=object.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            if(iterator.hasNext()){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
