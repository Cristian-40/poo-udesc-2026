package exercicio5oo.testes;

import exercicio5oo.classes.Livro;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setAutor("Antoine de Saint-Exupéry");
        livro.setGenero("Fábula");
        livro.setTitulo("Pequeno Princípe");
        livro.setEmprestado(false);
        System.out.println("Título do livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("Foi emprestado?: " + (livro.getEmprestado() ? "Emprestado" : "Não emprestado"));
        livro.emprestar();
        System.out.println("Foi emprestado?: " + (livro.getEmprestado() ? "Emprestado" : "Não emprestado"));
        livro.devolver();
        System.out.println("Está disponível? " + (livro.isDisponivel() ? "Sim" : "Não"));
    }
}