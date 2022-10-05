package Taller1;

import java.util.Scanner;

// Ejercicio 3
/*
 *  Inserció d’un element en una llista ordenada. Considera una llista
 *  ordenada de menor a major d’acord amb el contingut del camp info dels
 *  nodes, el qual es pot considerar de tipus enter. Desenvolupa un 
 *  algorisme/programa que, donat un enter arbitrari que es llegeix com a 
 *  paràmetre d’entrada, insereixi un nou node a la llista, el camp info del 
 *  qual contengui l’enter llegit, de manera que la nova llista quedi ordenada 
 *  de forma no decreixent.
 * 
 *  Aquest exercici es pot interpretar com la creació d'una llista linial
 *  ordenada de forma no decreixent segons el valor del camp info dels
 *  nodes. El nombre de nodes a inserir és arbitrarin i depen de l'usuari. 
 *  L'algorisme també ha de tenir una opció per imprimir la llista linial quan
 *  l'usuari consideri oportú.
 * 
 */

 class Ejercicio3 {

    //objeto Scanner para gestionar la entrada por teclado
    private Scanner leer = new Scanner(System.in);


    //método main
    public static void main(String[] args) {
        new Ejercicio3().metodoPrincipal();
    }

    public void metodoPrincipal() {
        // variable entera para determinar la opcion elegida por el usuario (0 == no, 1 == sí)
        int opcion = 0;
        //objeto lista para poder operar sobre la lista de nodos
        Lista lista = new Lista();
        
        //lectura de la opcion elegida
        opcion = lecturaOpcion("¿Quiere inserir un nodo en una lista ordenada? (Sí=1/No=0):");

        //bucle de tratamiento
        while (opcion == 1) {
            System.out.print("Introduzca el valor del nuevo nodo: ");
            lista.insertarNodoOrdenado(leer.nextInt());
            opcion = lecturaOpcion("¿Quiere inserir un nodo en una lista ordenada? (Sí=1/No=0):");
        }

        //lectura de la opcion elegida
        if (lecturaOpcion("¿Quiere visualizar la lista por pantalla? (Sí=1/No=0):") == 1) 
            lista.imprimirLista();
            
        leer.close();
    }

    private int lecturaOpcion(String mensaje) {
        //lectura de la opcion elegida
        System.out.print(mensaje);
        return leer.nextInt();
    }
 }