public class ReferenciaCurso {
    //Atributos
    //puntero a objetos Estudiante
    private Curso curso;

    //constructor
    public ReferenciaCurso (Curso c) {
        curso = c;
    }

    //métodos funcionales
    public Curso getCurso() {
        return curso;
    }
}
