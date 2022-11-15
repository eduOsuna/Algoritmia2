public class ListaAsignaturas implements Lista {
    //atributos
    private final int MAXIMO = 30;
    private Asignatura [] lista = null;
    private int numeroAsignaturas;

    //constructor
    public ListaAsignaturas () {
        numeroAsignaturas = 0;
        lista = new Asignatura[MAXIMO];
    }

    //métodos funcionales
    @Override
    public void insertarNodo (Nodo nodo) {
        int posicion = 0;
        Asignatura asignatura = (Asignatura) nodo;
        if (numeroAsignaturas < MAXIMO) {
            //buscar la posicion del nodo a insertar
            while (posicion < numeroAsignaturas && StringAmenorQueB(lista[posicion].getNombre(), asignatura.getNombre()))
                posicion++;

            for (int i = numeroAsignaturas; i > posicion; i--) 
                lista [i] = lista [i-1];
            
            //insertar elemento
            lista [posicion] = asignatura;
            //incrementar número de asignaturas
            numeroAsignaturas++;
        } else {
            System.err.println("Se ha sobrepasado el límite de asignaturas.");
        }
    }

    @Override
    public Asignatura getPrimero (){
        if (numeroAsignaturas > 0)
            return lista [0];
        else {
            System.err.println("La lista está vacía.");
            return null;
        } 
    }

    @Override
    public void borrarLista () {
        //al hacer esto lo que nos quede en las posiciones del array se sobreescibirá, es "basura"
        numeroAsignaturas = 0;
    }

    @Override
    public void eliminarNodo (Nodo nodo) {
        if (numeroAsignaturas>0) {
            int posicion = 0;
            Asignatura aux = lista [0];
            Asignatura eliminable = (Asignatura) nodo;

            //buscar posicion de la asignatura a eliminar
            while (!aux.equals(eliminable) && posicion < numeroAsignaturas) {
                posicion++;
                aux = lista[posicion];
            }

            //comprobar que la posición no excede el tamaño de la lista
            if (posicion < numeroAsignaturas) {
                //copiar el elemento i+1 al elemento i (esto elimina el nodo cuyo índice es el valor
                //inicial de i, es decir, posicion)
                for (int i = posicion;i<numeroAsignaturas;i++) 
                    lista [i] = lista [i+1];
                numeroAsignaturas--;
            } else 
                System.err.println("La Asignatura que desea eliminar no está en la lista.");

        } else 
            System.err.println("La lista está vacía.");
        
    }

    //devuelve true si el String a es menor a b, false en caso contrario. En este caso, menor se refiere a
    //alfabéticamente menor, es decir, que el primer caracter sea menor; que en caso de ser los dos primeros
    //iguales entonces el segundo sea menor que el segundo del String b y así sucesivamente.
    //NOTA: menor alfabéticamente quiere decir que aparezca primero en el abecedario o que el código unicode
    //del caracter de a sea menor al de b.
    private boolean StringAmenorQueB (String a, String b) {
        int lenght = Math.min(a.length(), b.length());

        for (int i=0; i<lenght; i++) {
            if (a.charAt(i)<b.charAt(i)) {
                return true;
            }
            if (a.charAt(i)>b.charAt(i)) {
                return false;
            }
        }

        //en principio nunca se llegará aquí a no ser que sean Strings exactamente iguales
        return false;
    }

    @Override
    public Asignatura getNodo (int pos) {
        if (pos >= 0) 
            if (pos < numeroAsignaturas)
                return lista [pos];
            else {
                System.err.println("La posición introducida es mayor al número de asignaturas.");
                return null;
            }
        else {
            System.err.println("La posición introducida es un número negativo.");
            return null;
        }  
    }

    public Asignatura getNodo (String nombreAsignatura) {
        int i = 0;
        for(;i < numeroAsignaturas; i++) 
            if (lista[i].getNombre().equals(nombreAsignatura)) 
                return lista [i];
        
        return null;
    }

    @Override
    public String toString () {
        String str = "";

        for (Asignatura asignatura : lista) 
            str = str + asignatura.toString() + "\n";
                   
        return str;
    }

    public int getNumeroAsignaturas () {
        return numeroAsignaturas;
    }
}