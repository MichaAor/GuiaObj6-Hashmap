package com.company.ClasesEj3;

public class Serie implements Comportamiento{
    private String titulo;
    private int numTemporada = 3;
    private Boolean prestado =false;
    private String genero;
    private String creador;


    public Serie(){}

    public Serie(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = "";
    }

    public Serie(String titulo, int numTemporada, String genero, String creador) {
        this.titulo = titulo;
        this.numTemporada = numTemporada;
        this.genero = genero;
        this.creador = creador;
    }


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumTemporada() {
        return numTemporada;
    }
    public void setNumTemporada(int numTemporada) {
        this.numTemporada = numTemporada;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }
    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + this.titulo + '\'' +
                ", numTemporada=" + this.numTemporada +
                ", prestado=" + this.prestado +
                ", genero='" + this.genero + '\'' +
                ", creador='" + this.creador + '\'' +
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
        Serie aux = null;
        int result = 0;
        if(o instanceof Serie){ aux = (Serie) o;}
        if (aux != null){
            result = this.titulo.compareTo(aux.titulo);
            if (result == 0) result = Integer.compare(this.numTemporada, aux.numTemporada);
            if (result == 0) result = this.prestado.compareTo(aux.prestado);
            if (result == 0) result = this.genero.compareTo(aux.genero);
            if (result == 0) result = this.creador.compareTo(aux.creador);
        }
      return result;
    }
}
