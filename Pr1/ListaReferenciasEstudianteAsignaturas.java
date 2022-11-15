public class ListaReferenciasEstudianteAsignaturas implements Lista{
    //Atributos
    private ReferenciaEstudianteAsignatura primero;

    //Constructor
    public ListaReferenciasEstudianteAsignaturas () {
        primero = null;
    }

    @Override
    public void insertarNodo (Nodo nodo) {
        ReferenciaEstudianteAsignatura as = this.getUltimo();
        as.setSeg(new ReferenciaEstudianteAsignatura((Asignatura) nodo));
    }


    private ReferenciaEstudianteAsignatura getUltimo(){
        ReferenciaEstudianteAsignatura as = primero;
        while (as.getSeg() != null) 
        as = as.getSeg();
        
        return as;
    }

    @Override
    public ReferenciaEstudianteAsignatura getPrimero (){
        return primero;
    }

    @Override
    public void borrarLista (){
        primero = null;
    }

    @Override
    public void eliminarNodo (Nodo nodo){
        ReferenciaEstudianteAsignatura eliminable = new ReferenciaEstudianteAsignatura((Asignatura) nodo);
        ReferenciaEstudianteAsignatura aux = primero;
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
    public ReferenciaEstudianteAsignatura getNodo (int pos){
        ReferenciaEstudianteAsignatura as = primero;

        for (int i=0;i<pos && as != null; i++) 
        as = as.getSeg();
        return as;
    }

    @Override
    public String toString () {
        String str = "";
        ReferenciaEstudianteAsignatura refAs = primero;

        while (refAs != null) {
            str = str + refAs.getAsignatura().toString() + "\n";
            refAs = refAs.getSeg();
        }
        return str;
    }
}
