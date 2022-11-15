public class Curso implements Nodo {
    private String nombre;
    //private int codigo;
    private Especialidad especialidad;
    private ListaAsignaturas asignaturas;
    private Curso seg;


    //constructores
    public Curso() {
        this.nombre = "";
        //this.codigo = -1;
        this.especialidad = null;
        this.asignaturas = null;
        this.seg = null;
    }

    public Curso(String nombre, int codigo, String especialidad){
        this.nombre = nombre;
        //this.codigo = codigo;
        this.especialidad = Especialidad.valueOf(especialidad);
        this.asignaturas = null;
    }


    //métodos funcionales
    public void insertarAsignatura (Asignatura asignatura) {
        asignaturas.insertarNodo(asignatura);
    }

    @Override
    public Curso getSeg () {
        return this.seg;
    }

    @Override
    public void setSeg (Nodo curso) {
        this.seg = (Curso) curso;
    }

    @Override
    public String toString () {
        return  "Curso "+ nombre + ": " + especialidad.toString();
    }


    public String listadoCurso () {
        String result = "";
        Asignatura asignatura = null;
        // ReferenciaAsignaturaEstudiante estudiante = null;

        for (int i = 0; i < asignaturas.getNumeroAsignaturas(); i++) {
            asignatura = asignaturas.getNodo(i);
            result = result + asignatura.toString() + "\nLista de estudiantes matriculados:\n";
            
            /*
             * estudiante = asignatura.getEstudiantes().getPrimer();
             * while (estudiante != null) {
             *      result = result + estudiante.getEstudiante().toString() + "\n";
             *      estudiante = estudiante.getSeg();
             * }
             */
        }

        return result;
    }

    public String getNombre() {
        return nombre;
    }
}