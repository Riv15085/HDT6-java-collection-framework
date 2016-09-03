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
        Set java, web, celular, interseccion, javaNotWeb, webAndCelular, webOrCelular, ascendente;
        int area;
        System.out.println("Bienvenido \n Determine si el conjunto creado es: 1. HashSet, 2.TreeSet, 3.LinkedSet");
        Scanner hola = new Scanner(System.in);
        int param = hola.nextInt();
        hola.nextLine();
        java=fabrica.crearConjunto(param);
        web =fabrica.crearConjunto(param);
        celular =fabrica.crearConjunto(param);
        interseccion =fabrica.crearConjunto(param);
        javaNotWeb =fabrica.crearConjunto(param);
        webAndCelular =fabrica.crearConjunto(param);
        webOrCelular =fabrica.crearConjunto(param);
        ascendente=fabrica.crearConjunto(param);
        int variable =0;
        while (variable != 3){
            System.out.println("Desea 1.AgregarDeveloper 2.Mostrar Resultados 3. Finalizar");
            int opcion = hola.nextInt();
            hola.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Agregar Developer");
                    System.out.println("Ingrese el nombre");
                    String nombre = hola.nextLine();
                    //System.out.println("Ingrese el area: 1.Java 2.Web 3.Celular");
                    System.out.println("¿Pertenece a Java? 1.SI 2.NO");
                    area = hola.nextInt();
                    hola.nextLine();
                    if (area ==1){
                        java.add(nombre);
                        System.out.println("Eligio Java");
                    }
                    System.out.println("¿Pertenece a Web? 1.SI 2.NO");
                    area = hola.nextInt();
                    hola.nextLine();
                    if (area ==1){
                        web.add(nombre);
                        System.out.println("Eligio Web");
                    }
                    System.out.println("¿Pertenece a Celular? 1.SI 2.NO");
                    area = hola.nextInt();
                    hola.nextLine();
                    if (area ==1){
                        celular.add(nombre);
                        System.out.println("Eligio Celular");
                    }
                break;
                case 2:
                    System.out.println("Resultados:");
                    System.out.print("Desarrolladores java: ");
                    Iterator itrDes = java.iterator();
                    while (itrDes.hasNext()){
                        Object element = itrDes.next();
                        System.out.print(element + ", ");
                    }
                    System.out.print("\n Desarrolladores web: ");
                    itrDes = web.iterator();
                    while (itrDes.hasNext()){
                        Object element = itrDes.next();
                        System.out.print(element+ ", ");
                    }
                    System.out.print("\n Desarrolladores celular: ");
                    itrDes = celular.iterator();
                    while (itrDes.hasNext()){
                        Object element = itrDes.next();
                        System.out.print(element + ", ");
                    }
                    Iterator itrJava = java.iterator();
                    Iterator itrWeb = web.iterator();
                    Iterator itrCelular = celular.iterator();
                    boolean esSubconjunto = false;
                    
                    while (itrJava.hasNext()){
                        Object elementoJava = itrJava.next();
                        if (web.contains(elementoJava)&&celular.contains(elementoJava)){
                            interseccion.add(elementoJava);
                        }
                        if (web.contains(elementoJava)==false){
                            javaNotWeb.add(elementoJava);
                        }
                    }
                    while (itrWeb.hasNext()){
                         Object elementoWeb = itrWeb.next();
                         if (celular.contains(elementoWeb)&&java.contains(elementoWeb)==false){
                             webAndCelular.add(elementoWeb);
                         }
                         if (java.contains(elementoWeb)==false){
                                webOrCelular.add(elementoWeb);
                         }
                    }
                    while (itrCelular.hasNext()){
                        Object elementoCelular = itrCelular.next();
                        if (java.contains(elementoCelular)==false && webOrCelular.contains(elementoCelular)==false){
                                webOrCelular.add(elementoCelular);
                         }
                    }

                    System.out.println("\nInterseccion de los tres conjuntos: ");
                    Iterator itrInterseccion = interseccion.iterator();
                    while (itrInterseccion.hasNext()){
                        Object element = itrInterseccion.next();
                        System.out.print(element+ ", ");
                    }
                    System.out.println("\nDesarrolladores Java pero no Web: ");
                    Iterator itrJavaNotWeb = javaNotWeb.iterator();
                    while (itrJavaNotWeb.hasNext()){
                        Object element = itrJavaNotWeb.next();
                        System.out.print(element+ ", ");
                    }
                    System.out.println("\nInterseccion web-celulares (No Java): ");
                    Iterator itrWebAndCelular = webAndCelular.iterator();
                    while (itrWebAndCelular.hasNext()){
                        Object element = itrWebAndCelular.next();
                        System.out.print(element+ ", ");
                    }
                    System.out.println("\nUnion web-celulares(No Java): ");
                    Iterator itrWebOrCelular = webOrCelular.iterator();
                    while (itrWebOrCelular.hasNext()){
                        Object element = itrWebOrCelular.next();
                        System.out.print(element+ ", ");
                    }
                    if (web.containsAll(java)){
                        System.out.println("\nJava es un subconjunto de Web");
                    }
                    else{
                        System.out.println("\nJava no es un subconjunto de Web");
                    }
                    if (java.size()>=web.size()){
                        if (java.size()>=celular.size()){
                            System.out.println("Java es el conjunto mas grande");
                            System.out.println("Desarrolladores java: ");
                            itrDes = java.iterator();
                            while (itrDes.hasNext()){
                                Object element = itrDes.next();
                                System.out.print(element + ", ");
                            }
                        }
                        else if (celular.size()>=web.size()){
                            System.out.println("Celular es el conjunto mas grande");
                            System.out.print("Desarrolladores Celular: ");
                            itrDes = celular.iterator();
                            while (itrDes.hasNext()){
                                Object element = itrDes.next();
                                System.out.print(element + ", ");
                            }
                        }
                    }
                    else if(web.size()>=celular.size()){
                        System.out.println("Web es el conjunto mas grande");
                        System.out.print("Desarrolladores web: ");
                        itrDes = web.iterator();
                        while (itrDes.hasNext()){
                            Object element = itrDes.next();
                            System.out.print(element + ", ");
                        }
                    }
                    break;
                case 3:
                    variable = 3;
                    break;
                            
            }
        }
        
    }
}

    
