package com.company.ClasesEj2;

public class Password {
    private int longitud = 8;
    private String contrasenia;

    public Password() {
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.generarContrasenbia(longitud);
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public Boolean esFuerte() {
        int cant_min = 0;
        int cant_may = 0;
        int cant_num = 0;
        for (char ch : this.contrasenia.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                cant_min += 1;
            } else if (Character.isUpperCase(ch)) {
                cant_may += 1;
            } else {
                cant_num += 1;
            }
        }
        if (cant_may > 2 && cant_min > 1 && cant_num > 5) {
            return true;
        } else {
            return false;
        }

    }

    public void generarContrasenbia(int longitud){
        String AlphaNumerico = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        StringBuilder new_pass = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++) {
            int index  = (int)(AlphaNumerico.length() * Math.random());
            new_pass.append(AlphaNumerico.charAt(index));
        }
        this.contrasenia = new_pass.toString();
    }



}
