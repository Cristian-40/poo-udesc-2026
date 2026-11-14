package exercicio3oo.testes;

import exercicio3oo.classes.Livro;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setAutor("Antoine de Saint-Exupéry");
        livro.setGenero("Fábula");
        livro.setTitulo("Pequeno Pincípe");
        livro.setEmprestado(true);
        System.out.println("Título do livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("Foi emprestado?: " + (livro.getEmprestado() ? "Emprestado" : "Não emprestado"));
    }
}