import java.math.BigInteger;

public class Zadanie4 {
    public static BigInteger szachownica(int n){

        BigInteger wynik=new BigInteger("0");
        BigInteger b=new BigInteger("1");
        BigInteger end=b;
        BigInteger c=new BigInteger("0");
        for (int i = 0; i <Math.pow(n,2)-1; i++)
        {
            c=b;
            b=b.add(b);
            wynik=wynik.add(b);
        }
        wynik=wynik.add(end);
        return wynik;
    }
}