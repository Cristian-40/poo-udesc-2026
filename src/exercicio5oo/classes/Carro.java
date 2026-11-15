package exercicio5oo.classes;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double velocidade;
    public String getModelo() {
        return modelo;
    }
    public String getMarca() {
        return marca;
    }
    public int getAno() {
        return ano;
    }
    public double getVelocidade() {
        return velocidade;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar(){
        velocidade += 10;
        System.out.printf("O carro acelerou. Velocidade atual: %.2f km/h\n", velocidade);
    }
    public void frear(){
        if (velocidade>= 10) {
            velocidade -= 10;
        }
        else {
            velocidade = 0;
        }
        System.out.printf("O carro freou. Velocidade atual: %.2f km/h\n", velocidade);
    }
    public void mostrarVelocidade(){
        System.out.printf("Velocidade atual: %.2f km/h\n", velocidade);
    }
}
