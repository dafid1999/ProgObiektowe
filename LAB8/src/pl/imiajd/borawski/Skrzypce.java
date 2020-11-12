package pl.imiajd.borawski;

import java.time.LocalDate;

public class Skrzypce extends Instrument {
    public Skrzypce(String prod, LocalDate rp){
        super(prod,rp);
    }

    public String dzwiek(){
        return "skrzypi skrzyp";
    }
}
