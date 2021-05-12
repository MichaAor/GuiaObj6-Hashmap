package com.company.ClasesEj3;

import java.util.HashMap;
import java.util.Map;

public class FuncionamientoEj3 {

    public static void FunEj3(){
        Serie[] series = new Serie[5];
        Videojuegos[] videojuegos = new Videojuegos[5];

        Serie s1 = new Serie("serie 1", 4, "TERROR", "creador");
        Serie s2 = new Serie("serie 2", 1, "ACCION", "creador");
        Serie s3 = new Serie("serie 3", 3, "COMEDIA", "creador");
        Serie s4 = new Serie("serie 4", 6, "FANTASIA", "creador");
        Serie s5 = new Serie("serie 5", 2, "TERROR", "creador");
        Serie s6 = new Serie("serie 5", 3, "ACCION", "creador");

        HashMap<Integer, Serie> lista_entretenimiento = new HashMap<Integer, Serie>();
        lista_entretenimiento.put(s1.hashCode(), s1);
        lista_entretenimiento.put(s2.hashCode(), s2);
        lista_entretenimiento.put(s3.hashCode(), s3);
        lista_entretenimiento.put(s4.hashCode(), s4);
        lista_entretenimiento.put(s5.hashCode(), s5);

        // Vamos a mostrar como implementar equals para que no tengamos dos series con el mismo titulo
        Boolean exists = false;
        for (Map.Entry<Integer, Serie> entry : lista_entretenimiento.entrySet()) {
            // Recorremos todas las series del hash y comparamos por medio de equals
            Serie serieObj = (Serie) entry.getValue();
            if (serieObj.equals(s6)){
                System.out.println("La serie: " + s6.getTitulo() + ", ya existe");
                exists = true;
            }
        }
        // Si no existe lo agregamos
        if (!exists) {
            lista_entretenimiento.put(s6.hashCode(), s6);
        }

        // Entregamos algunos titulos
        s2.entregar();
        s5.entregar();

        // Ahora buscamos la serie con mas temporadas y guardamos la key
        int key = 0;
        int max_temp = 0;
        for (Map.Entry<Integer, Serie> entry : lista_entretenimiento.entrySet()) {
            Serie serieObj = (Serie) entry.getValue();
            if (max_temp < serieObj.getNumTemporada()) {
                max_temp = serieObj.getNumTemporada();
                key = entry.getKey();
            }
        }
        Serie serieMaxTemp = (Serie) lista_entretenimiento.get(key);
        System.out.println("La serie con mas temporadas es: " + serieMaxTemp.toString());

        for (Map.Entry<Integer, Serie> entry : lista_entretenimiento.entrySet()) {
            Serie serieObj = (Serie) entry.getValue();
            System.out.println(serieObj.toString());
        }

     }
}
