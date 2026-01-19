package biblioteca.model;

// Nota Chat GPT: 10
public enum StatusEmprestimo {
    ATIVO("Ativo"),
    FINALIZADO("Finalizado"),
    ATRASADO("Atrasado");

    private final String statusRelatorio;

    StatusEmprestimo(String statusRelatorio) {
        this.statusRelatorio = statusRelatorio;
    }

    public String getStatusRelatorio() {
        return statusRelatorio;
    }
}
