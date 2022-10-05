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
        //variable puntero a objetos Nodo "aux" para iterar sobre los Nodos de la lista
        Nodo aux = primer;

        //bucle de visualizacion en pantalla
        while (aux!=null) {
            system.out.println(aux.getInfo()+"\t");
            aux = aux.getSeg();
        }
    }
    

    public void crearLista() {
        //variable puntero a objetos Nodo "aux" para crear una lista
        Nodo aux = primer;
        //variable entera para determinar la opción elegida por el usuario (0==no), (1==sí)

        //bucle de creación de la lista
    }
}