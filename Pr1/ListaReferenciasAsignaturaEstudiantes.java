public class ListaReferenciasAsignaturaEstudiantes implements Lista{
    //Atributos
    private ReferenciaAsignaturaEstudiante primero;

    //Constructor
    public ListaReferenciasAsignaturaEstudiantes () {
        primero = null;
    }

    @Override
    public void insertarNodo (Nodo nodo) {
        ReferenciaAsignaturaEstudiante aux = primero;
        ReferenciaAsignaturaEstudiante nuevo = new ReferenciaAsignaturaEstudiante((Estudiante) nodo);
        if (primero!=null) {
            //buscar la posicion del nodo a insertar
            while (aux.getSeg() != null && StringAmenorQueB(aux.getEstudiante().getNombre(), aux.getSeg().getEstudiante().getNombre()));
            //debemos insertar nuevo entre aux y aux.getSeg()
            nuevo.setSeg(aux.getSeg());
            aux.setSeg(nuevo);
        } else {
            //la lista está vacía
        }
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
    public ReferenciaAsignaturaEstudiante getPrimero (){
        return primero;
    }

    @Override
    public void borrarLista (){
        primero = null;
    }

    @Override
    public void eliminarNodo (Nodo nodo){
        ReferenciaAsignaturaEstudiante eliminable = new ReferenciaAsignaturaEstudiante((Estudiante) nodo);
        ReferenciaAsignaturaEstudiante aux = primero;
        if (primero != null) {
            if (primero != eliminable) 
                while (aux.getSeg() != null) 
                    if (aux.getSeg() == eliminable) 
                        aux.setSeg(eliminable.getSeg());
            else
                primero = eliminable.getSeg();
        } else {
            //la lista está vacía
        }

    }

    @Override
    public ReferenciaAsignaturaEstudiante getNodo (int pos){
        ReferenciaAsignaturaEstudiante as = primero;

        for (int i=0;i<pos && as != null; i++) 
        as = as.getSeg();
        return as;
    }

    @Override
    public String toString () {
        String str = "";
        ReferenciaAsignaturaEstudiante refAs = primero;

        while (refAs != null) {
            str = str + refAs.getEstudiante().toString() + "\n";
            refAs = refAs.getSeg();
        }
        return str;
    }
}
