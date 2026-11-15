package exercicio5oo.classes;

public class Aluno {
    private String matricula;
    private String nome;
    private int idade;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double media;

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public double getMedia() {
        return media;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void calcularMedia() {
        this.media = (nota1 + nota2 + nota3 + nota4) / 4.0;
    }

    @Override
    public String toString() {
        return String.format("Matrícula: %s | Nome: %s | Idade: %d | Notas: [%.2f, %.2f, %.2f, %.2f] | Média: %.2f",
                matricula, nome, idade, nota1, nota2, nota3, nota4, media);
    }
}




