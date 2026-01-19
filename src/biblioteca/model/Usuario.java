package biblioteca.model;

// Nota Chat GPT: 9,9
// Falta aprender exceções para manter o código

public class Usuario extends Pessoa {
    private final String matricula;

    public Usuario(String nome, String documento, String matricula) {
        super(nome, documento);
        this.matricula = matricula;
    }

    @Override
    public String getDadosFormatados() {
        return super.getDadosFormatados() +
                "\n# Matrícula: " + matricula;
    }

    public String getMatricula() {
        return matricula;
    }
}
