public interface Lista {
    void insertarNodo (Nodo nodo);

    Nodo getPrimero ();

    void borrarLista ();

    void eliminarNodo (Nodo nodo);

    Nodo getNodo (int pos);

    String toString();
}