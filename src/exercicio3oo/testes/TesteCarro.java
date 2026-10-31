package exercicio3oo.testes;

import exercicio3oo.classes.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro corsa  = new Carro();
        corsa.setAno(2005);
        corsa.setMarca("Chevrolet");
        corsa.setModelo("Sendan");
        corsa.setVelocidade(155);
        System.out.printf("Ano: %d\n", corsa.getAno());
        System.out.printf("Marca: %s\n", corsa.getMarca());
        System.out.printf("Modelo: %s\n", corsa.getModelo());
        System.out.printf("Velocidade máxima: %d\n", corsa.getVelocidade());
    }
}
