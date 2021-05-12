package com.company.ClasesEj3;

public class Videojuegos implements Comportamiento{
    private String titulo;
    private int horasEst = 10;
    private Boolean prestado = false;
    private String genero;
    private String compañia;

    public Videojuegos(){}

    public Videojuegos(String titulo, int horasEst, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEst = horasEst;
        this.genero = genero;
        this.compañia = compañia;
    }

    public Videojuegos(String titulo,int horasEst){
        this.titulo = titulo;
        this.horasEst = horasEst;
        this.genero = "";
        this.compañia = "";

    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEst() {
        return horasEst;
    }
    public void setHorasEst(int horasEst) {
        this.horasEst = horasEst;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }
    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public String toString() {
        return "Videojuegos{" +
                "titulo='" + titulo + '\'' +
                ", horasEst=" + horasEst +
                ", prestado=" + prestado +
                ", genero='" + genero + '\'' +
                ", compañia='" + compañia + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    @Override
    public Boolean isEntregado() {
        return this.prestado;
    }

    @Override
    public int compareTo(Object o) {
        Videojuegos aux = null;
        int result = 0;
        if(o instanceof Videojuegos){ aux = (Videojuegos) o;}
        if (aux != null){
            result = this.titulo.compareTo(aux.titulo);
            if (result == 0) result = Integer.compare(this.horasEst, aux.horasEst);
            if (result == 0) result = this.prestado.compareTo(aux.prestado);
            if (result == 0) result = this.genero.compareTo(aux.genero);
            if (result == 0) result = this.compañia.compareTo(aux.compañia);
        }
        return result;
    }




}
