public class ReferenciaEstudianteAsignatura implements Nodo{
    //Atributos
    //puntero a objetos Estudiante
    private Asignatura asignatura;
    //puntero a la siguiente Referencia
    private ReferenciaEstudianteAsignatura seg;

    //constructor
    public ReferenciaEstudianteAsignatura (Asignatura as) {
        asignatura = as;
        seg = null;
    }

    //métodos funcionales
    @Override
    public void setSeg (Nodo s) {
        seg = (ReferenciaEstudianteAsignatura) s;
    }

    @Override
    public ReferenciaEstudianteAsignatura getSeg() {
        return seg;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    /*
    public void setAsignatura (Asignatura as) {
        asignatura = as;
    }
    */
}