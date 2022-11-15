public class Obligatoria extends Asignatura {
    //Atributos
    private int creditos;
    //también tenemos los atributos de la clase asignatura

    //métodos constructores
    public Obligatoria () {
        this.codigo = -1;
        this.nombre = "";
        this.creditos = -1;
    }

    public Obligatoria (String nom, int cod, int cred, Curso c) {
        this.codigo = cod;
        this.nombre = nom;
        this.creditos = cred;
        this.curso = new ReferenciaCurso(c);
    }

    //métodos funcionales
    //métodos getter y setter
    public int getCreditos() { 
        return creditos;
    }

    public void setCreditos(int cred) {
        creditos = cred;
    }

    @Override
    public String toString () {
        return   "\nAsignatura Obligatoria"
                +"\nNombre: " + nombre
                +"\nCódigo: " + codigo
                +"\nCréditos: "+ creditos;
    }
}
