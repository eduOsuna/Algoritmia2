public enum Perfil {
    //posibles valores del tipo enumerado
    TEÓRICO, PRÁCTICO;

    @Override
    public String toString() {
        switch (this) {
            case TEÓRICO:   return "teórico";
            case PRÁCTICO:  return "práctico";
            default:        return "";
        }
    }
}