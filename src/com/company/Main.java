package com.company;

import com.company.ClasesEj1.*;
import com.company.ClasesEj2.*;
import com.company.ClasesEj3.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la Guia 6 Hashmap");
        int op;
        do {
            System.out.println("Ingrese el ejercicio que desea ver (Se consta de 3 ejercicios)" +
                    "\n 0 para salir");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ejecutando ejercicio 1");
                    FunionamientoEj1.Ejercicio1();
                    break;
                case 2:
                    System.out.println("Ejecutando ejercicio 2");
                    FuncionamientoEjercicio2.Ejercicio2();
                    break;
                case 3:
                    System.out.println("Ejecutando ejercicio 3");
                    FuncionamientoEj3.FunEj3();
                    break;
                case 0:
                    break;
            }

        }while(op != 0);
    }
}
