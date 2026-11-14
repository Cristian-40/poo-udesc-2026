package exercicio4oo.classes;

public class Circulo {
  private double raio;
  public double getRaio() {
    return raio;
  }
  public void setRaio(double raio) {
    this.raio = raio;
  }
  public double diametro(){
    return (2 * raio);
  }
  public double perimetro(){
    return (2 + 3.14 * raio);
  }
  public double area(){
    return (3.14 * (raio * raio));
  }
}

