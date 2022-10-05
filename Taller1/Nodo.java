package Taller1;

//clase nodo

class Nodo {
  //Atributos
  private int info;
  private Nodo seg;
  
  //Método constructor
  public Nodo () {
    info=0;
    seg=null;
  }

  //Metodos funcionales
  public int getInfo() {
    return info;
  }

  public void setInfo(int info) {
    this.info = info;
  }

  public Nodo getSeg() {
    return seg;
  }

  public void setSeg(Nodo seg) {
    this.seg = seg;
  }
}