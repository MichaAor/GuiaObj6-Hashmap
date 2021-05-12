package com.company.ClasesEj2;

import java.util.Scanner;

public class FuncionamientoEjercicio2 {

        public static void Ejercicio2(){
            Password[] contra = cargarPass();
            Boolean[] cargaFuerte = cargarFuertes(contra,contra.length);
            Boolean ver = contra[5].compareTo(contra[9]);
            mostrarTodo(contra,cargaFuerte,cargaFuerte.length);

        }

        public static Password[] cargarPass(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la extencion del array de password");
            int celdas = sc.nextInt();
            int seg = 0;
            Password[] contra = new Password[celdas];
            System.out.println("Ingrese logitud de su contraseña");
            int longitud = sc.nextInt();
            while(celdas >= 0){
                Password password = new Password(longitud);
                contra[seg] = password;
                seg++;
            }
            return contra;
        }
        public static Boolean[] cargarFuertes(Password[] passwords,int celdas){
            Boolean[] cargaFuertes = new Boolean[celdas];
            int seg=0;
            while(seg >= 0){
                cargaFuertes[seg] = passwords[seg].esFuerte();
                seg++;
            }
            return cargaFuertes;
        }
        public static void mostrarTodo(Password[] pass,Boolean[] boo,int validos){
            int seg =0;
            while(seg < validos){
                System.out.println(pass[seg].toString());
                if(boo[seg]){
                    System.out.println("Es fuerte");
                }else{
                    System.out.println("No es fuerte");
                }
            }
        }
}
