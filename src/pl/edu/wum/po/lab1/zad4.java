package pl.edu.wum.po.lab1;

class zad4 {
    public void zad4() {
        System.out.println("4.");
        int i = 1;
        double saldo = 1000;
        while (i < 4) {
            saldo = saldo + saldo * 0.06;
            System.out.println("Saldo po "+i +" roku wynosi: "+ saldo);
            i++;
        }
    }
}
