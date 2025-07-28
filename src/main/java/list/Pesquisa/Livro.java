package main.java.list.Pesquisa;

public class Livro {

    private String autor;

    private String titulo;

    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.autor = autor;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anoPublicacao='" + anoPublicacao + '\'' +
                '}';
    }
}
    