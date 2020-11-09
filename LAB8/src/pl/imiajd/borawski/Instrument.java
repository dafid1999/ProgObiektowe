package pl.imiajd.borawski;

import java.time.LocalDate;

abstract class Instrument {

    public String getProducent() {
        return producent;
    }

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }

    abstract dzwiek();

    private String producent;
    private LocalDate rokProdukcji;
}
