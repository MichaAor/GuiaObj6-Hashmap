package com.company.ClasesEj3;

public interface Comportamiento {
    public abstract void entregar();
    public abstract void devolver();
    public abstract Boolean isEntregado();

    int compareTo(Object o);
}
