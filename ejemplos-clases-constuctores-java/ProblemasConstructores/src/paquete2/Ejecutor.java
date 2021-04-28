/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
        */
        System.out.println("Elcriba el nombre del hospital: ");
        String nombre = sc.nextLine();
        
        System.out.println("Elcriba el nombre de la cuidad: ");
        String ciudad = sc.nextLine();
        
        System.out.println("Ingrese cuantos doctores lavoran en la institucion: ");
        int numdoctores = sc.nextInt();
        
        System.out.println("Ingrese cuantos enfermeros trabajan en el hospital: ");
        int numenfermeros = sc.nextInt();
        System.out.println();
        
        Hospital ej1 = new Hospital(nombre, ciudad, numdoctores, numenfermeros);
        
        System.out.printf("%s\n", ej1);
        
    }
}
