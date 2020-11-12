package pl.imiajd.borawski;

import java.time.LocalDate;

public class Flet extends Instrument {
    public Flet(String prod, LocalDate rp){
        super(prod,rp);
    }

    public String dzwiek(){
        return "fiu fiu fiu";
    }
}
