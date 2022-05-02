/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author wilso
 */
public class DoublyLinkedListNGTest {
    
    public DoublyLinkedListNGTest() {
    }

    @Test
    public void testSomeMethod() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addInSortedList(new Courses("IF-3001", "Algoritmos y Estructuras de Datos", 4));
        list.addInSortedList(new Courses("IF-4001", "Sistemas Operativos", 4));
        list.addInSortedList(new Courses("IF-2000", "Programación 1", 4));
        list.addInSortedList(new Courses("IF-3000", "Programación 2", 4));
        list.addInSortedList(new Courses("IF-4000", "Arquitectura", 3));
        list.addInSortedList(new Courses("IF-5000", "Redes", 4));
        list.addInSortedList(new Courses("IF-5100", "Bases de Datos", 4));
        list.addInSortedList(new Courses("IF-4101", "Lenguajes app Comerciales", 4));
        list.addInSortedList(new Courses("IF-3100", "Sistemas de Información", 3));
       

        System.out.println("\nMetodo Contains\n");
        try {
            System.out.println("\n¿Existe Informática Aplicada, Id=IF-6201? " 
                    + list.contains(new Courses("IF-6201", "Informática Aplicada", 0)));
            System.out.println("¿Existe Algoritmos y Estructuras de Datos, Id=IF-3001? " 
                    + list.contains(new Courses("IF-3001", "Algoritmos y Estructuras de Datos", 0)));
            System.out.println("¿Existe Sistemas Operativos, Id=IF-4001? " 
                    + list.contains(new Courses("IF-4001", "Sistemas Operativos", 0)));
            System.out.println("¿Existe Análisis y Diseño de Sistemas, Id=IF-6100? " 
                    + list.contains(new Courses("IF-6100", "Análisis y Diseño de Sistemas", 0)));

            System.out.println("\nMetodo getNode\n");
            for (int i = 1; i <= list.size(); i++) {
                System.out.println("El elemento en la posicion " + i + " es " + list.getNode(i).data);
            }
            
            System.out.println("\nMetodo index of\n");
            System.out.println("El curso Algoritmos y Estructuras de Datos Id=IF-3001 se encuentra en la posición:  :" 
                    + list.indexOf(new Courses("IF-3001", "Algoritmos y Estructuras de Datos", 0)));
            System.out.println("El curso Análisis y Diseño de Sistemas con Id=IF-6100 se encuentra en la posición   :" 
                    + list.indexOf(new Courses("IF-6100", "Análisis y Diseño de Sistemas", 0)));
            
//            list.sort();
//            System.out.println("Ordenar lista con el sort \n" + list.toString());
         
            System.out.println("\nMetodo Remove");
            System.out.println("Removiendo cursos con ID: IF-5000 y IF-5100");
            list.remove(new Courses("IF-5000", "Redes", 0));
            list.remove(new Courses("IF-5100", "Bases de Datos", 0));
            System.out.println("\n"+list.toString());
            
            System.out.println("El elemento previo a IF3000 es: " + list.getPrev(new Courses("IF-3000", "Programación 2", 4)));
            System.out.println("El elemento previo a IF5100 es: " + list.getPrev(new Courses("IF-5100", "Bases de Datos", 4)));

        } catch (ListException ex) {
            System.out.println(ex.getMessage());
            //Logger.getLogger(DoublyLinkedListNGTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    }
    
    

