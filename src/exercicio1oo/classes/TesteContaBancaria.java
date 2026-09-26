package exercicio1oo.classes;

public class TesteContaBancaria {
    public static void main(String[] args) {
        Contabancaria conta = new Contabancaria();
        conta.numeroconta = "08092005";
        conta.saldo = 1234;
        conta.titular = "Cristian";
        System.out.println("Bem vindo: " + conta.titular);
        System.out.println("O número da conta é: " + conta.numeroconta);
        System.out.println("O seu saldo é R$ " + conta.saldo);

    }
}


