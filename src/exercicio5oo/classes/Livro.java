package exercicio5oo.classes;

public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private Boolean emprestado;

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getGenero() {
        return genero;
    }
    public Boolean getEmprestado() {
        return emprestado;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setEmprestado(Boolean emprestado) {
        this.emprestado = emprestado;
    }
    public boolean isDisponivel() {
        return !this.emprestado;
    }
    public void emprestar() {
        if (isDisponivel()) {
            this.emprestado = true;
            System.out.println("O livro \"" + this.titulo + "\" foi emprestado com sucesso!");
        } else {
            System.out.println("O livro \"" + this.titulo + "\" já se encontra emprestado.");
        }
    }
    public void devolver() {
        if (!isDisponivel()) {
            this.emprestado = false;
            System.out.println("O livro \"" + this.titulo + "\" foi devolvido com sucesso!");
        } else {
            System.out.println("O livro \"" + this.titulo + "\" já estava na biblioteca.");
        }

    }
    @Override
    public String toString() {
        String status = (emprestado != null && emprestado) ? "Emprestado" : "Disponível";
        return String.format("Título: %s | Autor: %s | Gênero: %s | Status: %s",
                titulo, autor, genero, status);
    }
}
