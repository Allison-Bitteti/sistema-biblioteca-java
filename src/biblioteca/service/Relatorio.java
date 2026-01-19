package biblioteca.service;

import biblioteca.model.Emprestimo;
import biblioteca.model.Pessoa;
import biblioteca.model.Livro;

// Nota Chat GPT: 10

public class Relatorio {
    public static void imprimirDadosPessoas(Pessoa pessoa) {
        System.out.println();
        System.out.println();
        System.out.println("#############################");
        System.out.println("#        INFORMAÇÕES        #");
        System.out.println("#############################");
        System.out.println(pessoa.getDadosFormatados());
    }

    public static void imprimirDadosLivros(Livro livro) {
        System.out.println();
        System.out.println("########################");
        System.out.println("# INFORMAÇÕES DO LIVRO #");
        System.out.println("########################");
        System.out.println(livro.getInfoFormatada());
    }

    public static void imprimirEmprestimo(Emprestimo emprestimo) {
        System.out.println();
        System.out.println("#############################");
        System.out.println("# INFORMAÇÕES DO EMPRÉSTIMO #");
        System.out.println("#############################");
        System.out.println("# Usuário: " + emprestimo.getUsuario().getNome());
        System.out.println("# Livro: " + emprestimo.getLivro().getTitulo());
        System.out.println("# Tipo de Mídia: " + emprestimo.getLivro().getTipo().getNomeRelatorio());
        System.out.println("# Status: " + emprestimo.getStatus().getStatusRelatorio());
    }
}
