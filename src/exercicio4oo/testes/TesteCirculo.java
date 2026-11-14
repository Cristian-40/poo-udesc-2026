package exercicio4oo.testes;

import exercicio4oo.classes.Circulo;

public class TesteCirculo {
    public static void main(String[] args) {
       Circulo circulo = new Circulo();
       circulo.setRaio(10);
        System.out.printf("Raio: %d\n", circulo.getRaio());

    }
}
