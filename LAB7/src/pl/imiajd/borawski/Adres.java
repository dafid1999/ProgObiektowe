package pl.imiajd.borawski;

public class Adres {
    private String ulica;
    private int numer_domu;
    private  int numer_mieszkania=-1;
    private String miasto;
    private String kod_pocztowy;

    public Adres(String ulica, int numer_domu, int numer_mieszkania, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.kod_pocztowy = kod_pocztowy;
        this.miasto = miasto;
    }

    public Adres(String ulica, int numer_domu, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.kod_pocztowy = kod_pocztowy;
        this.miasto = miasto;
    }
    public void pokaz(){
        System.out.println(this.kod_pocztowy + " " + this.miasto);
        System.out.print(this.ulica + " " + this.numer_domu);
        if(this.numer_mieszkania!=-1){
            System.out.print("/"+this.numer_mieszkania+"\n");
        }
        else{
            System.out.println();
        }
    }

    public boolean przed(Adres sprawdzany){
        int[] tab={0,1,3,4,5};
        StringBuilder pierwszy= new StringBuilder();
        StringBuilder sprawdzam= new StringBuilder();
        for(int i : tab){
            pierwszy.append(sprawdzany.kod_pocztowy.charAt(i));
            sprawdzam.append(this.kod_pocztowy.charAt(i));
        }
        int pier=Integer.parseInt(pierwszy.toString());
        int spra=Integer.parseInt(sprawdzam.toString());

        return pier<spra;
    }
}
