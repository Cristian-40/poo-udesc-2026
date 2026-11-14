package exercicio4oo.testes;

import exercicio4oo.classes.Contabancaria;

public class TesteContaBancaria {
    public static void main(String[] args) {
        Contabancaria conta = new Contabancaria();
        conta.setNumeroconta("08092005");
        conta.setSaldo(1235);
        conta.setTitular("Cristian");
        System.out.printf("Bem vindo: %s \n" , conta.getTitular());
        System.out.printf("O número da conta é: %s \n",conta.getNumeroconta());
        System.out.printf("O seu saldo é R$ %f \n", conta.getSaldo());
        conta.depositar(500.0);
        conta.sacar(200.0);
        conta.imprimirSaldo();
    }
}


