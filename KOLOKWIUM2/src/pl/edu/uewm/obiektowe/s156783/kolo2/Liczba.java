package pl.edu.uewm.obiektowe.s156783.kolo2;

import java.math.BigDecimal;

public class Liczba<T extends Number> implements Comparable<Liczba<T>> {
    private T value;

    public Liczba(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public int compareTo(Liczba<T> o) {
        return ((BigDecimal)this.value).compareTo((BigDecimal)o.getValue());
    }


}
