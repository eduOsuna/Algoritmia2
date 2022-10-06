/*  --------------------- EJERCICIO 3 --------------------
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
 
package Taller1;

import java.util.Scanner;

/*-------------------------------------------------------------------------------------------------------------------------------
/ En este ejercicio, creamos una lista a partir de información proporcionada por el usuario a partir del teclado
/ con la particularidad de que los nodos deben quedar en orden no decreciente según el campo info.
/ Los nodos se irán introduciendo uno a uno mientras el usuario lo desee. Para representar su decisión se usará 
/ la variable entera "opcion". La acción de añadir un nuevo nodo se ejecutará en bucle mientras la opción sea 1 (Sí).
/ Para poder llevar a cabo la operación de inserción necesitaremos dos punteros adicionales a nodos: newNode, que
/ servirá para crear el nuevo nodo y aux, que la usaremos para apuntar al nodo que se encuentre justo antes del
/ lugar de inserción.
/ En cuanto al tratamiento, al igual que en el ejercicio 1 debemos distinguir entre la adición del primer nodo y 
/ la de los demás. Primero, si la lista está vacía, se creará un nuevo nodo directamente apuntado por el puntero
/ primer. En caso contrario, primero inicializaremos la variable aux para que apunte al primer nodo de la lista.
/ Posteriormente, comprobamos si el nodo se debe insertar en la primera posicion. En tal caso, creamos el nuevo
/ nodo con aux, le damos el valor deseado a info, al campo seg le damos el contenido de primer y a primer, la
/ dirección de aux. Por otro lado, si debemos introducir el nodo en cualquier otra posición, buscamos el nodo
/ anterior a dicha posición comparando el valor deseado con el campo info de los distintos nodos y actualizando
/ aux. Una vez hecho, creamos el nodo con newNode y utilizando aux para acceder al nodo anterior insertamos el
/ nuevo nodo a la lista.
/-------------------------------------------------------------------------------------------------------------------------------
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