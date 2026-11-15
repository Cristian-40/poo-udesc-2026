package exercicio5oo.classes;

public class Contabancaria {
    private String numeroconta;
    private String titular;
    private double saldo;

    public String getNumeroconta() {
        return numeroconta;
    }
    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setNumeroconta(String numeroconta) {
        this.numeroconta = numeroconta;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso!\n", valor);
        } else {
            System.out.println("O valor do depósito deve ser maior que zero.");
        }
    }
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso!\n", valor);
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido!");
        }
    }
    public void imprimirSaldo() {
        System.out.printf("Saldo atual da conta %s: R$ %.2f\n", numeroconta, saldo);
    }
    @Override
    public String toString() {
        return String.format("Número da Conta: %s | Titular: %s | Saldo: R$ %.2f",
                numeroconta, titular, saldo);
    }
}

