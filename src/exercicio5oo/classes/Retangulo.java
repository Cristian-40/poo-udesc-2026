package exercicio5oo.classes;

public class Retangulo {
    private double largura;
    private double altura;

    public double getLargura() {
        return largura;
    }
    public double getAltura() {
        return altura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double calcularArea() {
        return (largura * altura);
    }
    @Override
    public String toString() {
        return String.format("Largura: %.2f | Altura: %.2f | Área: %.2f", largura, altura, calcularArea());
    }
}

