package pl.edu.uewm.obiektowe.s156783.kolo2;

import java.time.LocalDate;

public abstract class Pojazd {
    private String model;
    private Producent producent;
    private LocalDate dataProdukcji;

    public Pojazd(String  model, Producent prod){
        this.model=model;
        this.producent=prod;
        this.dataProdukcji=LocalDate.now();
    }

    public abstract void uzyjKlaksonu();

    public static void jedzDoPrzodu(){
        System.out.println("Jadę do przodu");
    }

    @Override
    public String toString() {
        return "Model: "+this.model+", Producent: "+this.producent+", data produkcji pojazdu: "+this.dataProdukcji;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Producent getProducent() {
        return producent;
    }

    public void setProducent(Producent producent) {
        this.producent = producent;
    }

    public LocalDate getDataProdukcji() {
        return dataProdukcji;
    }
}
