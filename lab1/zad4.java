package pl.edu.wum.po.lab1;

public class zad4 {
    public static void main(String[] args) {
        int i = 1;
        double saldo = 1000;
        while (i < 4) {
            saldo = saldo + saldo * 0.06;
            System.out.println("Saldo po "+i +" roku wynosi: "+ saldo);
            i++;
        }
    }
}
