package pl.edu.uewm.obiektowe.s156783.kolo2;


public class Osobowy extends Pojazd implements IMozeCofac{
    public Osobowy(String model, Producent prod){
        super(model,prod);
    }

    @Override
    public void uzyjKlaksonu() {
        System.out.println("Tididi");
    }

    @Override
    public String cofaj() {
        return "Uwaga, cofam! Pip pip pip";
    }

    @Override
    public String toString() {
        return "Samochód osobowy - Model: "+this.getModel()+", Producent: "+this.getProducent()+", data produkcji pojazdu: "+this.getDataProdukcji();
    }


}
