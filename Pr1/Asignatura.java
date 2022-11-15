public abstract class Asignatura implements Nodo {
    //Atributos
    protected String nombre;
    protected int codigo;
    protected ReferenciaCurso curso;

    //Métodos funcionales
    //métodos getters y setters
    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nom) {
        nombre = nom;
    }

    public void setCodigo (int cod) {
        codigo = cod;
    }

    public int getCodigo () {
        return codigo;
    }

    public Curso getCurso () {
        return curso.getCurso();
    }

    //no se utilizan los métodos getSeg o setSeg porque se implementa la lista
    //con arrays

    @Override
    public Nodo getSeg() {
        return null;
    }

    @Override
    public void setSeg (Nodo nodo) {}
}
