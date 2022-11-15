public class ReferenciaAsignaturaEstudiante implements Nodo{
    //Atributos
    //puntero a objetos Estudiante
    private Estudiante estudiante;
    //puntero a la siguiente Referencia
    private ReferenciaAsignaturaEstudiante seg;

    //constructor
    public ReferenciaAsignaturaEstudiante (Estudiante as) {
        estudiante = as;
        seg = null;
    }

    //métodos funcionales
    @Override
    public void setSeg (Nodo s) {
        seg = (ReferenciaAsignaturaEstudiante) s;
    }

    @Override
    public ReferenciaAsignaturaEstudiante getSeg() {
        return seg;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    /*
    public void setAsignatura (Asignatura as) {
        asignatura = as;
    }
    */
}