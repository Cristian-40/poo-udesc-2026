package exercicio3oo.testes;

import exercicio3oo.classes.Aluno;

public class TestaAluno {
    public static void main(String[]args) {
        Aluno cristian = new Aluno();
        cristian.setMatricula("42");
        cristian.setNome("Cristian");
        cristian.setIdade(21);
        cristian.setNota1(8);
        cristian.setNota2(7);
        cristian.setNota4(6);
        cristian.setNota4(2);
        System.out.printf("Matricula: %s\n", cristian.getMatricula());
        System.out.printf("Nome: %s\n", cristian.getNome());
        System.out.printf("Idade: %d\n", cristian.getIdade());
        System.out.printf("Nota 1: %d\n", cristian.getNota1());
        System.out.printf("Nota 2: %d\n", cristian.getNota2());
        System.out.printf("Nota 3: %d\n", cristian.getNota3());
        System.out.printf("Nota 4: %d\n", cristian.getNota4());
    }
}
