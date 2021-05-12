package com.company.ClasesEj1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;
import java.util.Scanner;

public class FunionamientoEj1 {

    public static void Ejercicio1(){
        Scanner sc = new Scanner(System.in);
        Scanner scC = new Scanner(System.in);
        System.out.println("Bienvenido al ejercicio 1:" +
                            "Por favor ingrese en el siguiente orden los datos pedidos:" +
                            "Nombre - Edad - DNI - Sexo - Peso - Altura");

        Persona persona1 = new Persona(sc.nextLine(),sc.nextInt(),sc.nextInt(),
            scC.next().charAt(0),sc.nextFloat(),sc.nextFloat());
                sc.nextLine();
        System.out.println("Por favor ingrese en el siguiente orden los datos pedidos:" +
                "Nombre - Edad - Sexo");
        Persona persona2 = new Persona(sc.nextLine(),sc.nextInt(),scC.next().charAt(0));
        Persona persona3 = new Persona();
        persona3.setNombre("Pablo");persona3.setEdad(31);persona3.setDni(44879521);persona3.setSexo('M');
        persona3.setPeso(79.89f);persona3.setAltura(1.72f);
        comprobrarPesos(persona1);comprobrarPesos(persona2);comprobrarPesos(persona3);
        HashMap<Integer,Persona> mapita = new HashMap<Integer,Persona>();
        mapita.put(persona1.getDni(),persona1);
        mapita.put(persona1.getDni(),persona2);
        mapita.put(persona1.getDni(),persona3);

    }

    public static void comprobrarPesos(Persona a){
        if(a.calcularIMC() == -1){
            System.out.println("Esta en su peso ideal");
    }else{
        if(a.calcularIMC() == 0){
            System.out.println("Esta por debajo de su peso ideal");
    }else{
        if (a.calcularIMC() == 1){
              System.out.println("Esta excedido de peso");
                }
            }
        }
    }
}
