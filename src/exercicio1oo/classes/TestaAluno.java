package exercicio1oo.classes;

public class TestaAluno {
    public static void main(String[]args) {
        Aluno cristian = new Aluno();
        cristian.matricula = "40";
        cristian.nome = "cristian";
        cristian.idade = 21;
        cristian.nota1 = 7;
        cristian.nota2 = 8;
        cristian.nota3 = 5;
        cristian.nota4 = 9;
        System.out.println("Matricula: " + cristian.matricula);
        System.out.println("Nome: " + cristian.nome);
        System.out.println("Idade: " + cristian.idade);
        System.out.println("Nota 1: " + cristian.nota1);
        System.out.println("Nota 2: " + cristian.nota2);
        System.out.println("Nota 3: " + cristian.nota3);
        System.out.println("Nota 4: " + cristian.nota4);
    }
}
