package exercicio3oo.testes;

import exercicio3oo.classes.Retangulo;

public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(5);
        retangulo.setAltura(10);
        System.out.printf("ALtura: %d\n", retangulo.getAltura());
        System.out.printf("Largura %d\n", retangulo.getLargura());

    }
}
