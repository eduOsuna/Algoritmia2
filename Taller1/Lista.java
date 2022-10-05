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
        System.out.println("");
        while (aux != null) {
            System.out.println(aux.getInfo()+"\t");
            aux = aux.getSeg();
        }
    }
    

    public void crearLista() {
        // variable puntero a objetos Nodo "aux" para crear una lista
        Nodo aux=primer;
        // variable entera pasado por el teclado
        int opcion;
        Scanner leer = new Scanner(System.in);
        System.out.print("¿Quiere crear la lista? (Sí=1/No=0): ");
        // lectura del teclado para saber el valor de opcion
        opcion=leer.nextInt();   
        while(opcion==1){
            // comprobamos si la lista esta vacia o no
            if (this.primer == null) {                
                primer=new Nodo();
                System.out.print("Introduce un número: ");
                // Lectura por teclado de la información a introducir al nodo
                primer.setInfo(leer.nextInt());
                // apunta al mismo nodo que primer
                aux = primer;
            } else {
                // se crea el siguiente nodo a partir del último añadido
                aux.setSeg(new Nodo());
                // asignación del puntero aux al último nodo añadido
                aux = aux.getSeg();
                System.out.print("Introduce un número: ");
                // Lectura por teclado de la información a introducir al nodo
                aux.setInfo(leer.nextInt());
            }
            System.out.print("¿Quiere continuar creando la lista? (Sí=1/No=0): ");
            opcion=leer.nextInt();
        }
        
    }

    public void eliminarNodo (Lista lliures, int valor){
        // variable puntero a objetos Nodo "apuntador" para recorrer la lista "primer"
        Nodo apuntador = primer;
        // variable puntero a objetos Nodo "aux" para eliminar añadir un nodo en la lista "lliures"
        Nodo aux;
        // recorrerá todos los nodos de la lista
        while (apuntador.getSeg()!= null) {
            // comprobará si el campo info del nodo coincide con el valor introducido por teclado
            if (apuntador.getInfo()==valor) {
                // se cumplira la siguiente condición a partir del segundo elemento eliminado
                if (lliures.getPrimer() != null) {
                    aux=lliures.getPrimer();
                    // recorrerá todos los nodos de la lista "lliures"
                    while (aux.getSeg() != null){
                        // asignación del puntero aux al siguiente nodo
                        aux = aux.getSeg();
                    }
                    // asigna el nodo a eliminar en la lista "lliures"
                    aux.setSeg(apuntador);
                    // se elimina el nodo solicitado
                    apuntador = (apuntador.getSeg());
                    aux.getSeg().setSeg(null);
                }else{
                    // se pondra el nodo eliminado en la primera posicion de la lista "lliures"
                    lliures.setPrimer(apuntador);
                    primer= (apuntador.getSeg());
                    lliures.getPrimer().setSeg(null);
                    apuntador=primer;
                }  
            }
            if (apuntador.getSeg().getInfo()==valor) {
                // se cumplira la siguiente condición a partir del segundo elemento eliminado
                if (lliures.getPrimer() != null) {
                    aux=lliures.getPrimer();
                    // recorrerá todos los nodos de la lista "lliures"
                    while (aux.getSeg() != null){
                        // asignación del puntero aux al siguiente nodo
                        aux = aux.getSeg();
                    }
                    // asigna el nodo a eliminar en la lista "lliures"
                    aux.setSeg(apuntador.getSeg());
                    // se elimina el nodo solicitado
                    apuntador.setSeg(apuntador.getSeg().getSeg());
                    aux.getSeg().setSeg(null);
                }else{
                    // se pondra el nodo eliminado en la primera posicion de la lista "lliures"
                    lliures.setPrimer(apuntador.getSeg());
                    apuntador.setSeg(apuntador.getSeg().getSeg());
                    lliures.getPrimer().setSeg(null);
                }    
            } 
            apuntador = apuntador.getSeg();   
        }    
    }
    

    /*public void eliminarNodo2 (Lista lliures, int valor){
        // variable puntero a objetos Nodo "apuntador" para recorrer la lista "primer"
        Nodo apuntador = primer;
        //variable puntero a objetos Nodo "prenodo" para guardar el nodo que precede al que se va a eliminar
        Nodo prenodo = primer;
        // variable puntero a objetos Nodo "aux" para eliminar añadir un nodo en la lista "lliures"
        Nodo aux;

        //caso particular en que el nodo a eliminar esté en la primera posicion
        
        // encuentra el nodo a eliminar
        while (apuntador.getSeg()!= null && apuntador.getInfo() != valor) {
            apuntador=apuntador.getSeg();
        }

        //obtener prenodo
        if (prenodo != primer)  //debemos diferenciar en caso donde se quiera eliminar el primer nodo
            while (prenodo.getSeg()!= apuntador) 
                prenodo=prenodo.getSeg();
        


                // se cumplira la siguiente condición a partir del segundo elemento eliminado
                if (lliures.getPrimer() != null) {
                    aux=lliures.getPrimer();
                    // recorrerá todos los nodos de la lista "lliures"
                    while (aux.getSeg() != null){
                        // asignación del puntero aux al siguiente nodo
                        aux = aux.getSeg();
                    }
                    // asigna el nodo a eliminar en la lista "lliures"
                    aux.setSeg(apuntador);
                    // se elimina el nodo solicitado
                    prenodo.setSeg(prenodo.getSeg().getSeg());
                    aux.getSeg().setSeg(null);
                }else{
                    // se pondra el nodo eliminado en la primera posicion de la lista "lliures"
                    lliures.setPrimer(apuntador);
                    prenodo.setSeg(prenodo.getSeg().getSeg());
                    lliures.getPrimer().setSeg(null);
                }    
             
            apuntador = apuntador.getSeg();   
           
    } */

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
        } else {
            // apuntamos al primer nodo con aux
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

                while (aux.getSeg() != null && valor > aux.getSeg().getInfo()) {
                    // apuntar al siguiente nodo
                    aux = aux.getSeg();
                }   

            /*    while (aux.getSeg().getInfo() < valor) {
                    // apuntar al siguiente nodo
                    aux = aux.getSeg();
                    if (aux.getSeg()== null) break;
                } */

                newNode = new Nodo();
                newNode.setInfo(valor);
                newNode.setSeg(aux.getSeg());
                aux.setSeg(newNode);
            }
        }
    }

    // Elimina el nodo k-ésimo de la lista. Si la lista tiene menos de k elementos, no se elimina ninguno
    public void eliminarNodoK (int k) {
        // variable puntero a objetos Nodo "aux" para crear una lista
        Nodo aux = primer;
        
        // tratamiento especial para el caso k=1
        if (k==1) 
            // al hacer que primer apunte al segundo nodo, se pierde la referencia al primero,
            // por lo que se elimina
            primer = primer.getSeg();   
        else {
            // bucle de busqueda del nodo k
            int i=2; 
            while ((i < k) && aux.getSeg() != null) {
                // apuntar al siguiente nodo
                aux = aux.getSeg();
                i++;
            }   
            // comprobar que se ha encontrado el nodo k
            if (i==k) 
                // eliminar nodo
                aux.setSeg(aux.getSeg().getSeg());
            else 
                // como k es mayor que el tamaño de la lista, informamos al usuario de que no se ha eliminado nada
                System.out.println("La posición introducida es mayor que el tamaño de la lista,"
                +" no se ha eliminado ningún nodo.");
        }
    }
}