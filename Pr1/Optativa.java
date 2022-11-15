public class Optativa extends Asignatura {
    //Atributos
    private Perfil perfil;
    //también tenemos los atributos de la clase asignatura

    //métodos constructores
    public Optativa () {
        this.codigo = -1;
        this.nombre = "";
        this.perfil = null;
    }

    public Optativa (String nom, int cod, String perf, Curso c) {
        this.codigo = cod;
        this.nombre = nom;
        this.perfil = Perfil.valueOf(perf);
        this.curso = new ReferenciaCurso(c);
    }

    //métodos funcionales
    //métodos getter y setter
    public Perfil getPerfil() { 
        return perfil;
    }

    public void setPerfil(Perfil perf) {
        this.perfil = perf;
    }

    @Override
    public String toString () {
        return   "\nAsignatura Optativa"
                +"\nNombre: " + nombre
                +"\nCódigo: " + codigo
                +"\nPerfil: "+ perfil.toString();
    }
}