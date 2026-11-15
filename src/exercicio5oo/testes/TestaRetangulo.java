package exercicio5oo.testes;

import exercicio5oo.classes.Retangulo;

public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(5);
        retangulo.setAltura(10);

        System.out.println(retangulo.toString());
    }
}
