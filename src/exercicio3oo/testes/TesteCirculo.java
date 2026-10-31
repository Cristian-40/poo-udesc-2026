package exercicio3oo.testes;

import exercicio3oo.classes.Circulo;

public class TesteCirculo {
    public static void main(String[] args) {
       Circulo circulo = new Circulo();
       circulo.setRaio(10);
        System.out.printf("Raio: %d\n", circulo.getRaio());

    }
}
