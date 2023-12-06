/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String acumulador = "";
        String nombre;;
        String posicion;
        int num;
        int edad;
        double estatura;

        System.out.println("Ingrese la cantidad de jugadores que planea ingresar");
        num = entrada.nextInt();
        
        for (int i = 1; i <= num; i++) {
            entrada.nextLine();
            System.out.println("Ingrese el nombre y apellido del jugador");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posición del jugador");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador");
            estatura = entrada.nextDouble();
            
            acumulador = String.format("%s%d.%s - %s - edad %d - estatura %.2f\n"
            ,acumulador,i,nombre,posicion,edad,estatura);
            
            
        }System.out.printf("Listado de Jugadores\n%s",acumulador);
    }
}
