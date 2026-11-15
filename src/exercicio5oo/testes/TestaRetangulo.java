package exercicio5oo.testes;

import exercicio5oo.classes.Retangulo;

public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(5);
        retangulo.setAltura(10);
        System.out.printf("ALtura: %.2f\n", retangulo.getAltura());
        System.out.printf("Largura %.2f\n", retangulo.getLargura());
        System.out.printf("Área: %.2f\n", retangulo.calcularArea());
        System.out.println(retangulo.toString());
    }
}
