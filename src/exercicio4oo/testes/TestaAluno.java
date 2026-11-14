package exercicio4oo.testes;

import exercicio4oo.classes.Aluno;

public class TestaAluno {
    public static void main(String[]args) {
        Aluno cristian = new Aluno();
        cristian.setMatricula("42");
        cristian.setNome("Cristian");
        cristian.setIdade(21);
        cristian.setNota1(8);
        cristian.setNota2(7);
        cristian.setNota3(6);
        cristian.setNota4(2);
        cristian.calcularMedia();
        System.out.printf("Matricula: %s\n", cristian.getMatricula());
        System.out.printf("Nome: %s\n", cristian.getNome());
        System.out.printf("Idade: %d\n", cristian.getIdade());
        System.out.printf("Nota 1: %.2f\n", cristian.getNota1());
        System.out.printf("Nota 2: %.2f\n", cristian.getNota2());
        System.out.printf("Nota 3: %.2f\n", cristian.getNota3());
        System.out.printf("Nota 4: %.2f\n", cristian.getNota4());
        System.out.printf("Média: %.2f\n", cristian.getMedia());
        if (cristian.getMedia() >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}
