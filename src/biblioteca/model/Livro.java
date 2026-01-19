package biblioteca.model;

// Nota Chat GPT: 10

public class Livro {
    private final String titulo;
    private final String autor;
    private final TipoLivro tipo;
    private static int totalLivros;

    public Livro(String titulo, String autor, TipoLivro tipo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tipo = tipo;
        Livro.totalLivros += 1;
    }

    public String getInfoFormatada() {
        return "# Titulo: " + titulo +
                "\n# Autor: " + autor +
                "\n# Tipo de Mídia: " + tipo.getNomeRelatorio();
    }

    public String getTitulo() {
        return titulo;
    }

    public static int getTotalLivros() {
        return totalLivros;
    }

    public String getAutor() {
        return autor;
    }

    public TipoLivro getTipo() {
        return tipo;
    }
}
