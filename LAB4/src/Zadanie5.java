import java.math.BigDecimal;

public class Zadanie5 {
    public static String kapitał(float p, float k, int n){
        BigDecimal procent = new BigDecimal(String.valueOf(p));
        BigDecimal kapital = new BigDecimal(String.valueOf(k));
        BigDecimal dev = new BigDecimal(100);
        return kapital.multiply(BigDecimal.ONE.add(procent.divide(dev)).pow(n)).setScale(2,BigDecimal.ROUND_UP).toString();
    }
}

