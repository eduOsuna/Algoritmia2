public class DNI {
    //atributos
    private int codigo;
    private char letra;

    //constructor
    public DNI(String dni) {
        codigo = Integer.parseInt(dni.substring(0, dni.length()));
        letra = dni.charAt(dni.length());
    }

    //métodos
    @Override
    public String toString() {
        return ""+codigo+letra;
    }

    public int getCodigo() {
        return codigo;
    }
}
