/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 0;

        for (int i = 1; i <= 10; i++) {
            a = (a + i);
        }
        /* utilizamos un acumulador para poder presentar el resultado de
        2 for en solo un print*/
        for (int i = 1; i < 11; i++) {
            a = (a + i);
        }
        System.out.printf("%d\n", a);

    }

}
