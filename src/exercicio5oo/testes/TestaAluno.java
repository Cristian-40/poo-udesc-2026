package exercicio5oo.testes;

import exercicio5oo.classes.Aluno;

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
        System.out.println(cristian.toString());

        if (cristian.getMedia() >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}
