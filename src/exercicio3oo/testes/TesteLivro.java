package exercicio3oo.testes;

import exercicio3oo.classes.Livro;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setAutor("Antoine de Saint-Exupéry");
        livro.setGenero("Fábula");
        livro.setTitulo("Pequeno Princípe");
        livro.setEmprestado(false);
        System.out.printf("Título do livro: %s\n", livro.getTitulo());
        System.out.printf("Autor: %s\n", livro.getAutor());
        System.out.printf("Gênero: %s\n", livro.getGenero());
        System.out.printf("Foi emprestado?: %b\n", livro.getEmprestado());
    }
}