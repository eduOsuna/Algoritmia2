/*  --------------------- EJERCICIO 2 --------------------
 *  Eliminació d’un element donat. A partir d’una llista lineal i d’un
 *  valor enter donat com a dada d'entrada, es proposa la 
 *  construcció d’un algorisme que elimini de la llista el node el valor 
 *  del camp info del qual coincideixi amb la dada d'entrada, i 
 *  l’insereixi al final –com a darrer node- d’una llista de fems
 *  apuntada per la variable lliures. Es considera que la llista no conté 
 *  nodes amb el camp info repetit. L'algorisme també ha de tenir
 *  dues opcions addicionals: una per crear la llista inicialment i l'altra
 *  per per imprimir la llista linial i la llista de fems quan l'usuari
 *  consideri oportú.
 */
 
package Taller1;

import java.util.Scanner;

/*-------------------------------------------------------------------------------------------------------------------------------
/ En este ejercicio, a partir de una lista de información proporcionada por el usuario a partir del teclado, solicitamos
/ al usuario un valor para eliminar el nodo cuyo campo info coincida y insertarlo en la lista "lliures".
/ 
/ 
/ Para representar su decisión se usará la variable entera "opcion". La acción de añadir un nuevo nodo se ejecutará
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

public class Ejercicio2{
    public static void main(String[] args) {
        int opcion, valor;
        Scanner s = new Scanner(System.in);
        Lista lista = new Lista();
        Lista lliures = new Lista();
        
        lista.crearLista();
        System.out.print("¿Quiere eliminar algun elemento de la lista? (Sí=1/No=0): ");
        opcion = s.nextInt();
        while (opcion == 1) {
            System.out.print("¿Que información tiene el elemento a eliminar?: ");
            valor = s.nextInt();
            lista.eliminarNodo(lliures, valor);
            System.out.print("¿Quiere seguir eliminando elementos de la lista? (Sí=1/No=0): ");
            opcion = s.nextInt();
        }
        System.out.println("¿Quiere imprimir por pantalla la lista? (Sí=1/No=0): ");
        opcion = s.nextInt();
        if (opcion == 1) {
            System.out.println("Lista lista:");
            lista.imprimirLista();
            System.out.println("Lista lliures:");
            lliures.imprimirLista();
        }
        s.close();
    }
}