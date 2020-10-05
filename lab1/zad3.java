package pl.edu.wum.po.lab1;

public class zad3 {
    public static void main(String[] args) {
        int i = 1;
        int iloczyn = 1;
        while (i < 11) {
            iloczyn = iloczyn * i;
            i++;
        }
        System.out.println("Iloczyn liczb od 1 do 10 równa się : "+ iloczyn);
    }
}
