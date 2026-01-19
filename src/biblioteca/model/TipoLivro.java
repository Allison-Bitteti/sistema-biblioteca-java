package biblioteca.model;

// Nota Chat GPT: 10

public enum TipoLivro {
    FISICO("Físico"),
    DIGITAL("Digital");

    private final String nomeRelatorio;

    TipoLivro(String nomeRelatorio) {
        this.nomeRelatorio = nomeRelatorio;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
