package pl.imiajd.borawski;

import java.time.LocalDate;

public class Fortepian extends Instrument {
    public Fortepian(String prod, LocalDate rp){
        super(prod,rp);
    }

    public String dzwiek(){
        return "pim pum pam";
    }
}
