package exercicio3oo.testes;

import exercicio3oo.classes.Contabancaria;

public class TesteContaBancaria {
    public static void main(String[] args) {
        Contabancaria conta = new Contabancaria();
        conta.setNumeroconta("08092005");
        conta.setSaldo(1235);
        conta.setTitular("Cristian");
        System.out.printf("Bem vindo: %s " , conta.getTitular());
        System.out.printf("O número da conta é: %f ",conta.getNumeroconta());
        System.out.printf("O seu saldo é R$ %f ", conta.getSaldo());

    }
}


