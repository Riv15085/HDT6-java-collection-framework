/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt6.java.clases;

import hdt6.FactorySet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author diego
 */
public class HDT6JavaClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FactorySet fabrica = new FactorySet();
        Set java, web, celular;
        System.out.println("Bienvenido");
        System.out.println("Determine si el conjunto creado es: HashSet, TreeSet, LinkedSet");
        Scanner hola = new Scanner(System.in);
        String param = hola.nextLine();
        java=fabrica.crearConjunto(param);
        web =fabrica.crearConjunto(param);
        celular =fabrica.crearConjunto(param);
        int variable =0;
        while (variable != 3){
            System.out.println("Desea 1.AgregarDev 2.Mostrar Resultados 3. Finalizar");
            int opcion = hola.nextInt();
            hola.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("ingrese el nombre");
                    String nombre = hola.nextLine();
                    System.out.println("ingrese el area");
                    String area = hola.nextLine();
                    switch (area){
                        case "java":
                            java.add(nombre);
                            break;
                        case "web":
                            web.add(nombre);
                            break;
                        case "celular":
                            celular.add(nombre);
                            break;                            
                    }
                break;
                case 2:
                    System.out.print("Desarrolladores java: ");
                    Iterator itrDes = java.iterator();
                    while (itrDes.hasNext()){
                        Object element = itrDes.next();
                        System.out.print(element + " ");
                    }
                    System.out.print("Desarrolladores web: ");
                    itrDes = web.iterator();
                    while (itrDes.hasNext()){
                        Object element = itrDes.next();
                        System.out.print(element+ " ");
                    }
                    System.out.print("Desarrolladores celular: ");
                    itrDes = celular.iterator();
                    while (itrDes.hasNext()){
                        Object element = itrDes.next();
                        System.out.print(element + " ");
                    }
                break;
                            
            }
        
                
        }
        
    }
}
    
