/*  --------------------- EJERCICIO 4 --------------------
 *  Eliminació del k-èssim element d’una llista. Considera una llista lineal 
 *  amb un nombre arbitrari d’elements. Construeix un algorisme que 
 *  elimini el k-èssim element de la llista, on k és un valor enter arbitrari
 *  que es llegeix al principi de l'algorisme com a paràmetre d'entrada. S'ha
 *  de tenir en compte que si la llista té menys de k elemets, llavors no s'en
 *  pot eliminar cap d'ells.
 * 
 *  L'algorisme també ha de tenir dues opcions addicionals: una per crear 
 *  la llista inicialment i l'altra per per imprimir la llista linial quan l'usuari
 *  consideri oportú.
 */
 
package Taller1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*-------------------------------------------------------------------------------------------------------------------------------
/ En este ejercicio, a partir de una lista de información proporcionada por el usuario a partir del teclado, solicitamos
/ al usuario un valor (k) para eliminar el nodo que se encuentre en esa posición. El usuario debe tener la opción para
/ visualizar la lista cuando desee. Para representar su decisión se usará la variable entera "opcion" de manera que 1 
/ equivalga a "sí". Concretamente, se le permitirá ver la lista tras crearla y tras eliminar un elemento.
/ Para realizar todas las operaciones necesitaremos utilizar una variables puntero auxiliar "aux". Con ella podremos
/ apuntar al nodo anterior al que se va a eliminar. 
/ En cuanto al tratamiento, lo primero que haremos una vez el usuario nos haya dado la posición del nodo a eliminar es 
/ inicializar aux para que apunte al primer nodo. Como en otros ejercicios pasados, debemos distinguir el caso de
/ eliminar el primer nodo (k==1). Si k==1, entonces haremos que primer apunte al segundo nodo. Si no, haremos un bucle
/ hasta llegar a la posición k-1, de manera que quede apuntada por aux. En este punto, volvemos a tener una bifurcación:
/ si k es igual al número de nodos por los que hemos pasado (este dato lo obtendremos en el paso anterior), entonces
/ haremos que el nodo k-1 apunte al k+1 por medio de aux. Si no, significa que k es mayor al tamaño de la lista, por lo
/ que no eliminamos nada e informaremos al usuario de que no se eliminó nada.
/ Finalmente, como comentamos anteriormente, daremos al usuario la opcion de ver la lista actualizada.
/--------------------------------------------------------------------------------------------------------------------------------
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