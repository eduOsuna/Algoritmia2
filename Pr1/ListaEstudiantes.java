public class ListaEstudiantes implements Lista{
    //Atributos
    
    
    private Estudiante primero;

    //constructor
    public ListaEstudiantes () {
        primero = null;
    }

    @Override
    public void insertarNodo (Nodo nodo) {
        Estudiante nuevo = (Estudiante) nodo;
        Estudiante est = this.getUltimo();

        est.setSeg(nuevo);
    }

    @Override
    public Estudiante getPrimero (){
        return primero;
    }

    private Estudiante getUltimo(){
        Estudiante est = primero;

        while (est.getSeg() != null) {
            est = est.getSeg();
        }

        return est;
    }

    @Override
    public void borrarLista (){
        primero = null;
    }

    @Override
    public void eliminarNodo (Nodo nodo){
        Estudiante eliminable = (Estudiante) nodo;
        Estudiante aux = primero;
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
    public Estudiante getNodo (int pos){
        Estudiante est = primero;

        for (int i=0;i<pos && est != null; i++) 
            est = est.getSeg();
        return est;
    }

    @Override
    public String toString () {
        String str = "";
        Estudiante est = primero;

        while (est != null) {
            str = str + est.toString() + "\n";
            est = est.getSeg();
        }
        return str;
    }
}
