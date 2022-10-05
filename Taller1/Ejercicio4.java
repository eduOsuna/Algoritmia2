package Taller1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Ejercicio 4
/*  Eliminació del k-èssim element d’una llista. Considera una llista lineal 
 *  amb un nombre arbitrari d’elements. Construeix un algorisme que 
 *  elimini el k-èssim element de la llista, on k és un valor enter arbitrari
 *  que es llegeix al principi de l'algorisme com a paràmetre d'entrada. S'ha
 *  de tenir en compte que si la llista té menys de k elemets, llavors no s'en
 *  pot eliminar cap d'ells.
 * 
 *  L'algorisme també ha de tenir dues opcions addicionals: una per crear 
 *  la llista inicialment i l'altra per per imprimir la llista linial quan l'usuari
 *  consideri oportú.
 * 
 */

 class Ejercicio4 {

    //objeto Scanner para gestionar la entrada por teclado
    private BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));


    //método main
    public static void main(String[] args) {
        new Ejercicio4().metodoPrincipal();
    }

    public void metodoPrincipal() {
        //objeto lista para poder operar sobre la lista de nodos
        Lista lista = new Lista();
        // variable entera k para representar la posicion del nodo a eliminar
        int k = 0;

        try {
            // creación de la lista
            lista.crearLista();
            //solicitar al usuario si quiere visualizar la lista
            if (lecturaOpcion("¿Quiere visualizar la lista? (Sí=1/No=0):") == 1) 
                lista.imprimirLista();

            //lectura del parámetro k
            System.out.print("Introduzca la posicion del nodo a eliminar: ");
            k = Integer.parseInt(leer.readLine());

            //eliminar nodo
            lista.eliminarNodoK(k);

        //solicitar al usuario si quiere visualizar la lista
            if (lecturaOpcion("¿Quiere visualizar la lista? (Sí=1/No=0):") == 1) 
                lista.imprimirLista();

            //cerrar objeto scanner
            leer.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private int lecturaOpcion(String mensaje) throws IOException {
        //lectura de la opcion elegida
        int opcion = 0;
        System.out.print(mensaje);
        opcion = Integer.parseInt(leer.readLine());
        return opcion;
    }
 }