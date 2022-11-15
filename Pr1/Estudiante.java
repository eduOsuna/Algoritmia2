public class Estudiante implements Nodo {
    //Atributos
    private String nombre;
    private DNI dni;
    private ListaReferenciasEstudianteAsignaturas asignaturas;
    private Estudiante seg;

    //Constructor
    public Estudiante (String nom, String dn) {
        nombre = nom;
        dni = new DNI(dn);
        asignaturas = new ListaReferenciasEstudianteAsignaturas();
        seg = null;
    }

    //Métodos funcionales
    @Override
    public Estudiante getSeg() {
        return (Estudiante) seg;
    }

    @Override
    public void setSeg (Nodo estudiante) {
        //casting a objeto estudiante
        seg = (Estudiante) estudiante;
    }
    
    public void insertarAsignatura (Asignatura asignatura) {
        asignaturas=null;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString () {
        return "Estudiante "+nombre +"\nDNI: "+dni.toString();
    }

    public String listadoAsignaturas() {
        return asignaturas.toString();
    }
}