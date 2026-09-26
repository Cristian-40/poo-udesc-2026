package exercicio1oo.classes;

public class TesteCarro {
    public static void main(String[] args) {
        Carro corsa  = new Carro();
        corsa.ano = 2005;
        corsa.marca = "Chevrolet";
        corsa.modelo = "Sedan";
        corsa.velocidade = 155;
        System.out.println("Ano:  " + corsa.ano);
        System.out.println("Marca: " + corsa.marca);
        System.out.println("Modelo: " + corsa.modelo);
        System.out.println("Velociade máxima:  " + corsa.velocidade);
    }
}
