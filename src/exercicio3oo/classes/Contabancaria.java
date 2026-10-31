package exercicio3oo.classes;

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
}

