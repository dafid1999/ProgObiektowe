package pl.edu.wum.po.lab1;

class zad3 {
    public void zad3() {
        int i = 1;
        int iloczyn = 1;
        while (i < 11) {
            iloczyn = iloczyn * i;
            i++;
        }
        System.out.println("3.\nIloczyn liczb od 1 do 10 równa się : "+ iloczyn);
    }
}
