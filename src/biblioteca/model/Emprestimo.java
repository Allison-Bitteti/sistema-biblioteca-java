package biblioteca.model;

// Nota Chat GPT: 10

public class Emprestimo {
    private final Usuario usuario;
    private final Livro livro;
    private StatusEmprestimo status;

    public Emprestimo(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
        this.status = StatusEmprestimo.ATIVO;
    }

    public void finalizarEmprestimo() {
        if (status == StatusEmprestimo.ATIVO) {
            status = StatusEmprestimo.FINALIZADO;
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public StatusEmprestimo getStatus() {
        return status;
    }
}
