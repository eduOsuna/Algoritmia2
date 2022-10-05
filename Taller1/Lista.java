package Taller1;

import java.util.Scanner;

//clase Lista
public class Lista {
    //Atributos
    private Nodo primer;

    //Constructor
    public Lista() {
        this.primer = null;
    }

    //Metodos funcionales
    public void setPrimer(Nodo n) {
        this.primer = n;
    }

    public Nodo getPrimer() {
        return this.primer;
    }

    public void imprimirLista () {
        // variable puntero a objetos Nodo "aux" para iterar sobre los Nodos de la lista
        Nodo aux = primer;

        // bucle de visualizacion en pantalla
        while (aux != null) {
            System.out.println(aux.getInfo()+"\t");
            aux = aux.getSeg();
        }
    }
    

    public void crearLista() {
        // variable puntero a objetos Nodo "aux" para crear una lista
        Nodo aux=primer;
        int opcion;
        Scanner leer = new Scanner(System.in);
        System.out.print("¿Quiere crear la lista? (Sí=1/No=0):  ");
        // lectura del teclado para saber el valor de opcion
        opcion=leer.nextInt();
        //bucle de creación de la lista
        while(opcion==1){
            // comprobamos si la lista esta vacia o no
            if (this.primer == null) {                
                System.out.print("Introduce un número: ");
                // Lectura por teclado de la información a introducir por el teclado
                primer.setInfo(leer.nextInt());
                aux = primer;
            } else {
                aux.setSeg(new Nodo());
                aux = aux.getSeg();
                System.out.print("Introduce un número: ");
                aux.setInfo(leer.nextInt());
            }
            System.out.print("¿Quiere continuar creando la lista? (Sí=1/No=0):  ");
            opcion=leer.nextInt();
        }
        
    }

    public void insertarNodoOrdenado(int valor) {
        // variable puntero a objetos Nodo "aux" para crear una lista
        Nodo aux = primer;
        // variable auxiliar para crear el nodo a insertar en la lista
        Nodo newNode = null;

        // bucle de creación de la lista
        if (primer == null) {
            // creación primer nodo
            primer = new Nodo();
            primer.setInfo(valor);
            // apuntamos al nodo con aux
            aux = primer;
        } else {
            // apuntamos al nodo con aux
            aux = primer;
            // comprobamos si el nodo debe ser insertado en primera posicion
            if (valor <= primer.getInfo()) {
                // creación del nodo, apuntado por aux
                aux = new Nodo();
                aux.setInfo(valor);
                aux.setSeg(primer);
                // apuntar al nodo con el atributo primer
                primer = aux;
            } else {
                // bucle de búsqueda de la posicion de inserción
                while (valor > aux.getSeg().getInfo()) {
                    // apuntar al siguiente nodo
                    aux = aux.getSeg();
                }
                newNode = new Nodo();
                newNode.setInfo(valor);
                newNode.setSeg(aux.getSeg());
                aux.setSeg(newNode);
            }
        }
    }
}