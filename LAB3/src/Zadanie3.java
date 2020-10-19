import java.util.Random;

public class Zadanie3 {
    int m;
    int n;
    int k;
    int [][] macierz_mn;
    int [][] macierz_nk;
    int [][] macierz_c;
    public Zadanie3(int m, int n, int k){
        this.n=n;
        this.m=m;
        this.k=k;
        this.macierz_mn= new int[n][m];
        this.macierz_nk= new int[k][n];
        this.macierz_c= new int[k][m];
        Random losowa= new Random();
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++) {
                this.macierz_mn[i][j] = (int)(Math.random()*( 10 - (1) + 1))+1;
            }
        }
        for(int i=0;i<k;i++){
            for (int j=0;j<n;j++) {
                this.macierz_nk[i][j] = (int)(Math.random()*( 10 - (1) + 1))+1;
            }
        }
        int temp;
        for(int i=0;i<m;i++){
            for (int j=0;j<k;j++){
                temp=0;
                for (int l=0;l<n;l++){
                    temp += (this.macierz_mn[l][i]*this.macierz_nk[j][l]);
                }
                this.macierz_c[j][i] = temp;
            }
        }
    }
    public void wypisz(){
        for(int i=0;i<this.m;i++){
            for (int j=0;j<this.n;j++) {
                System.out.print(this.macierz_mn[j][i]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<this.n;i++){
            for (int j=0;j<this.k;j++) {
                System.out.print(this.macierz_nk[j][i]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<this.m;i++){
            for (int j=0;j<this.k;j++) {
                System.out.print(this.macierz_c[j][i]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}