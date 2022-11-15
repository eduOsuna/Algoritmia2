public enum Especialidad {
    //posibles valores del tipo enumerado
    MECÁNICA, INFORMÁTICA, ELECTRÓNICA, PRIMERO, SEGUNDO;

    @Override
    public String toString() {
        switch (this) {
            case MECÁNICA:      return "FP de mecánica";
            case INFORMÁTICA:   return "FP de informática";
            case ELECTRÓNICA:   return "FP de electronica";
            case PRIMERO:       return "primero de bachillerato";
            case SEGUNDO:       return "segundo de bachillerato";
            default:            return "";
        }
    }

    public String getTipoCurso () {
        if (this.ordinal() <= 2)
            return "FP";
        else 
            return "Bachillerato";
    }
}