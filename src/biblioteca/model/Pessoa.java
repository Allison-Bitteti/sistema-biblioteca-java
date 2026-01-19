package biblioteca.model;

// Nota Chat GPT: 9,9

public abstract class Pessoa {
    private final String nome;
    private final String documento;

    public Pessoa(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public abstract String getDadosFormatados() {
        return "# Nome: " + nome +
                "\n# Documento: " + documento;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }
}
