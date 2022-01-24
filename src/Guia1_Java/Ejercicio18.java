/*
 Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package Guia1_Java;

public class Ejercicio18 {

    public static void main(String[] args) {

        String letra = String.valueOf(3);
        String letra1 = letra.replace("3", "E");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (i == 3) {
                        System.out.print("(" + letra1);
                    } else {
                        System.out.print("(" + i);
                    }
                    if (j == 3) {
                        System.out.print(" - " + letra1 + " - ");
                    } else {
                        System.out.print(" - " + j + " - ");
                    }
                    if (k == 3) {
                        System.out.println(letra1 + ")");
                    } else {
                        System.out.println(k + ")");
                    }
                }
            }
        }
    }
}
