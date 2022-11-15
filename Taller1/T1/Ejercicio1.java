/*  --------------------- EJERCICIO 1 --------------------
 *  Creació d'una llista linial. Construeix un algorisme/programa 
 *  que crei una llista linial de nodes a partir dels valors enters que 
 *  l'usuari li subministrarà com a dades d'entrada. Cada valor 
 *  correspondrà al camp info d'un node. El nombre de nodes a 
 *  inserir és arbitrari i depen de l'usuari. L'algorisme també ha de 
 *  tenir una opció per imprimir la llista linial quan l'usuari consideri
 *  oportú
 */
 
package Taller1;

import java.util.Scanner;

/*-------------------------------------------------------------------------------------------------------------------------------
/ En este ejercicio, creamos una lista a partir de información proporcionada por el usuario a partir del teclado.
/ Esta lista se creara a partir de nodos con un campo "info" y el campo "seg" que apuntaría al siguiente elemento 
/ de la lista, en caso de existir. Los nodos se irán introduciendo uno a uno mientras el usuario lo desee. Para 
/ representar su decisión se usará la variable entera "opcion". La acción de añadir un nuevo nodo se ejecutará
/ en bucle mientras la opción sea 1 (Sí).
/ En cuanto al tratamiento, debemos distinguir entre la adición del primer nodo y la de los demás. En el primer
/ caso, se creará un nuevo nodo directamente apuntado por el puntero primer. Además, tendremos otra variable puntero
/ "aux" que también apunte a dicho nodo. En los casos restantes, crearemos un nodo mediante la variable aux que
/ sea apuntado por el campo seg del último nodo de la lista actual. Posteriormente,  el usuario introducirá el
/ campo "info" y haremos que aux apunte al nuevo último nodo para poder repetir el proceso.
/ Finalmente, para imprimir la lista, usaremos una variable puntero auxiliar que inicialmente apunte al primer
/ nodo y iremos imprimiendo el campo info de cada nodo hasta llegar al último mediante un bucle. 
/-------------------------------------------------------------------------------------------------------------------------------
*/

public class Ejercicio1 {
    public static void main(String[] args) {
        int opcion;
        Scanner s = new Scanner(System.in);
        Lista lista = new Lista();
        
        lista.crearLista();
        System.out.println("¿Quiere imprimir por pantalla la lista? (Sí=1/No=0): ");
        opcion = s.nextInt();
        if (opcion == 1) {
            lista.imprimirLista();
        }
        s.close();
    }
}