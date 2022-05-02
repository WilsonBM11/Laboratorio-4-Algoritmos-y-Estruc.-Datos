/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package domain;

import java.util.logging.Level;
import java.util.logging.Logger;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Profesor Gilberth Chaves A <gchavesav@ucr.ac.cr>
 */
public class SinglyLinkedListNGTest {
    
    public SinglyLinkedListNGTest() {
    }

    @Test
    public void test() {
        try {

            SinglyLinkedList list = new SinglyLinkedList();

            list.add(new Student("1", "Maria", 20, "Cartago"));
            list.add(new Student("2", "Carlos", 22, "San jose"));
            list.add(new Student("3", "Laura", 20, "Paraiso"));
            list.add(new Student("4", "Paula", 18, "Turrialba"));
            list.add(new Student("5", "Carlos", 21, "Limon"));
            list.add(new Student("6", "Fabiana", 19, "Paraiso"));
            list.add(new Student("7", "Maria", 23, "Guanacaste"));
            list.add(new Student("8", "Carlos", 25, "San carlos"));
            list.add(new Student("9", "Laura", 20, "Turrialba"));
            list.add(new Student("10", "Pedro", 24, "Heredia"));
          
            System.out.println(list.toString());
            System.out.println("\nMetodo Contains");
            System.out.println("\nExiste Pedro ID=20? " 
                    +list.contains(new Student("20", "Pedro", 25, "Heredia")));
            System.out.println("Existe Paula ID=4? " 
                    + list.contains(new Student("4", "Paula", 18, "Turrialba")));
            System.out.println("Existe Carlos ID=5? " 
                    + list.contains(new Student("5", "Carlos", 21, "Limon")));
            System.out.println("Existe Carlos ID=8? " 
                    + list.contains(new Student("8", "Carlos", 25, "San carlos")));

            System.out.println("\nMetodo get node\n");
            
            for (int i = 1; i <= list.size(); i++) {
                Node resultado = list.getNode(i);
                System.out.println("El elemento en la posicion " + i + " es " + resultado.data);
            } 
            
            System.out.println("\n Metodo index Of\n");
            System.out.println("El estudiante Carlos con ID 8 esta en la posicion  :" 
                    + list.indexOf(new Student("8", "Carlos", 25, "San carlos")));
            System.out.println("El estudiante Carlos con el ID 100 esta en la posicion  :" 
                    + list.indexOf(new Student("100", "Carlos", 24, "Heredia")));
            System.out.println("Metodo para determinar los nombres que se repiten \n");
            System.out.println("La cantidad de Carlos es "+list.countNames(list,"Carlos"));

            System.out.println("\nRemoviendo los estudiantes con ID= 1,3,5");
            list.remove(list.getNode(1));
            list.remove(list.getNode(3));
            list.remove(list.getNode(5));
            
            list.sort();
            System.out.println("Ordenado lista de estudiante por nombre\n" + list.toString());

            System.out.println("La cantidad de Carlos es "+list.countNames(list,"Carlos"));
            System.out.println("\n Metodo find names\n");
            
            System.out.println("¿En la lista existe una estudiante con el nombre Karla? "+list.findNames(list,"Karla"));
            System.out.println("¿En la lista existe una estudiante con el nombre Fabiana? "+list.findNames(list,"Fabiana"));
        } catch (ListException ex) {
            
            Logger.getLogger(SinglyLinkedListNGTest.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    
    }
    

