package exercicio3oo.classes;

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
}
