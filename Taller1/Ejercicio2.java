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
/ al usuario un valor para eliminar el nodo cuyo campo info coincida y insertarlo en la lista "lliures". Esta acción se
/ repetirá tantas veces como el usuario quiera. Para representar su decisión se usará la variable entera "opcion" de
/ manera que 1 equivalga a "sí". 
/ Para realizar todas las operaciones necesitaremos utilizar múltiples variables puntero (a Nodos). Distinguiremos
/ entre nodoLliures, que lo usaremos para apuntar al nodo a eliminar; apuntador, que lo usaremos para apuntar al nodo
/ previo a nodoLliures, para poder eliminarlo de la lista, y finalmente punteroLliures, que nos servirá  para apuntar
/ al último nodo de la lista lliures para así poder añadir el nodoLliures.
/ En cuanto al tratamiento, lo primero que haremos una vez el usuario nos haya dado el valor del nodo a eliminar es obtener
/ dicho nodo. Una vez hecho, debemos distinguir la situación particular en la que el nodoLliures sea el primero. En ese
/ caso, haremos que primer apunte al segundo nodo de la lista. En caso contrario, buscaremos el nodo previo a nodoLliures
/ mediante un bucle. Después, debemos distinguir nuevamente entre 2 situaciones: aquella en la que la llista lliures está
/ vacía y cualquier otra posible situación. Si lliures está vacía (es decir, que lliures apunta a null/nil), insertamos
/ nodoLliures en la lista y hacemos que el campo seg del nodo apunte a null. En cambio, si no está vacía, primero apuntamos
/ al último nodo de la lista lliures con punteroLliures y luego insertamos el nodo de manera similar al caso anterior.
/ Tras realizar estas operaciones, nodoLliures ha sido eliminado de la primera lista y ha sido insertado en lliures. Ahora
/ volvemos a pedir al usuario si desea seguir eliminando nodos.
/ Cuando salga del bucle de eliminación, le preguntaremos si quiere visualizar las 2 listas.
/--------------------------------------------------------------------------------------------------------------------------------
*/

public class Ejercicio2 {
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