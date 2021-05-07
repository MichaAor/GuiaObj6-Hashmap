package com.company.ClasesEj1;

public class Persona {
    final static char HOMBRE = 'H';
    final static char MUJER = 'M';
    private String nombre;
    private int edad=0;
    private int dni;
    private char sexo = HOMBRE;
    private float peso = 0.0f;
    private float altura = 0.0f;

    public Persona(){}

    public Persona(String nombre,int edad,char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.generaDNI();
    }

    public Persona(String nombre, int edad, int dni, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return this.dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return this.sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return this.peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return this.altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int calcularIMC(){
         int res = 0;
            float pesoIdeal = (float) (this.peso / (Math.pow(altura,2)));
            if(pesoIdeal <20){
                res = -1;
            }else{
                if(20 < pesoIdeal && pesoIdeal <= 25) {
                    res = 0;
                }else {
                    res = 1;
                }
            }
        return res;
    }

    public Boolean esMayorDeEdad(){
        if(this.edad >= 18);
        return true;
    }

    private void comprobarSexo(){
        if(this.sexo != 'H' || this.sexo != 'h' || this.sexo != 'F' || this.sexo != 'f'){
            this.sexo = HOMBRE;
        }else {
            if(this.sexo == HOMBRE){this.sexo = HOMBRE;}
            else{this.sexo = MUJER;}
        }
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    private void generaDNI(){
        // De esta manera generamos un numero entre 1 a 50000000.
        this.dni = (int) (Math.random()*50000000+1);
    }
}
