package exercicio2oo.testes;

import exercicio2oo.classes.Livro;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.autor = "Antoine de Saint-Exupéry";
        livro.genero = "Fábula";
        livro.titulo = "Pequeno Princípe";
        livro.emprestado = false;
        System.out.println("Título do livro: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Gênero: " + livro.genero);
        System.out.println("Foi emprestado?: " + livro.emprestado);
    }
}