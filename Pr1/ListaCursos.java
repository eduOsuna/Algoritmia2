public class ListaCursos implements Lista{
    //atributos
    private final int MAXIMO = 30;
    private Curso [] lista = null;
    private int numeroCursos;

    //constructor
    public ListaCursos () {
        numeroCursos = 0;
        lista = new Curso[MAXIMO];
    }

    //métodos funcionales
    @Override
    public void insertarNodo (Nodo nodo) {
        if (numeroCursos < MAXIMO) {
            //insertar elemento
            lista [numeroCursos] = (Curso) nodo;
            //incrementar número de asignaturas
            numeroCursos++;
        } else {
            System.err.println("Se ha sobrepasado el límite de cursos.");
        }
    }

    @Override
    public Curso getPrimero (){
        if (numeroCursos > 0)
            return lista [0];
        else {
            System.err.println("La lista está vacía.");
            return null;
        } 
    }

    @Override
    public void borrarLista () {
        //al hacer esto lo que nos quede en las posiciones del array se sobreescibirá, es "basura"
        numeroCursos = 0;
    }

    @Override
    public void eliminarNodo (Nodo nodo) {
        if (numeroCursos>0) {
            int posicion = 0;
            Curso aux = lista [0];
            Curso eliminable = (Curso) nodo;

            //buscar posicion de la asignatura a eliminar
            while (!aux.equals(eliminable) && posicion < numeroCursos) {
                posicion++;
                aux = lista[posicion];
            }

            //comprobar que la posición no excede el tamaño de la lista
            if (posicion < numeroCursos) {
                //copiar el elemento i+1 al elemento i (esto elimina el nodo cuyo índice es el valor
                //inicial de i, es decir, posicion)
                for (int i = posicion;i<numeroCursos;i++) 
                    lista [i] = lista [i+1];
                numeroCursos--;
            } else 
                System.err.println("El Curso que desea eliminar no está en la lista.");

        } else 
            System.err.println("La lista está vacía.");
        
    }

    @Override
    public Curso getNodo (int pos) {
        if (pos >= 0) 
            if (pos < numeroCursos)
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

    public Curso getNodo (String nombreCurso) {
        int i = 0;
        for(;i < numeroCursos; i++) 
            if (lista[i].getNombre().equals(nombreCurso)) 
                return lista [i];
        
        return null;
    }

    @Override
    public String toString () {
        String str = "";

        for (Curso curso : lista) 
            str = str + curso.toString() + "\n";
                   
        return str;
    }

    public int getNumeroCursos () {
        return numeroCursos;
    }
}