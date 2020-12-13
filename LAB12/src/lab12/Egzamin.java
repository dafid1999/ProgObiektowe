package lab12;

import java.util.TreeMap;

public class Egzamin {
    private TreeMap<String,String> oceny;

    public Egzamin(){
        this.oceny=new TreeMap<>();
    }

    public void dodaj(String nazwisko, String ocena){
        this.oceny.put(nazwisko,ocena);
    }

    public void usun(String nazwisko){
        for(String nazwisk: this.oceny.keySet()){
            if(nazwisk.equals(nazwisko)){
                this.oceny.remove(nazwisko);
            }
        }
    }

    public void zmien(String nazwisko, String ocena){
        for(String nazwisk: this.oceny.keySet()){
            if(nazwisk.equals(nazwisko)){
                this.oceny.replace(nazwisko,ocena);
            }
        }
    }

    public void wypisz(){
        for(String uczen: this.oceny.keySet()){
            System.out.println(uczen+" : "+this.oceny.get(uczen));
        }
        System.out.println();
    }
}
