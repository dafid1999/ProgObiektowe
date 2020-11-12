package pl.imiajd.borawski;

import java.time.LocalDate;

public abstract class Instrument {
    public Instrument(String prod, LocalDate rp){
        this.producent=prod;
        this.rokProdukcji=rp;
    }

    public String getProducent() {
        return this.producent;
    }

    public LocalDate getRokProdukcji() {
        return this.rokProdukcji;
    }

    public abstract String dzwiek();

    @Override
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+", producent: "+this.producent+", data produkcji: "+this.rokProdukcji;
    }

    private String producent;
    private LocalDate rokProdukcji;
}
