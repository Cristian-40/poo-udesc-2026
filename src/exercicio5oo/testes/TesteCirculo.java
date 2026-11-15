package exercicio5oo.testes;

import exercicio5oo.classes.Circulo;

public class TesteCirculo {
    public static void main(String[] args) {
       Circulo circulo = new Circulo();
       circulo.setRaio(10);
        System.out.printf("Raio: %.2f\n", circulo.getRaio());
        System.out.printf("Diâmetro: %.2f\n", circulo.diametro());
        System.out.printf("Perímetro: %.2f\n", circulo.perimetro());
        System.out.printf("Área: %.2f\n", circulo.area());

    }
}
