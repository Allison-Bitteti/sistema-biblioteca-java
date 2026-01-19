package biblioteca.test;

// Nota Chat GPT: 10

import biblioteca.model.Emprestimo;
import biblioteca.model.Funcionario;
import biblioteca.model.Livro;
import biblioteca.model.TipoLivro;
import biblioteca.model.Usuario;
import biblioteca.service.Relatorio;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== CRIANDO USUÁRIOS ====");
        Usuario usuario1 = new Usuario("Allison", "123.456.789-00", "MAT001");
        Usuario usuario2 = new Usuario("Erica", "987.654.321-00", "MAT002");

        Relatorio.imprimirDadosPessoas(usuario1);
        Relatorio.imprimirDadosPessoas(usuario2);

        System.out.println();
        System.out.println("==== CRIANDO FUNCIONÁRIO ====");
        Funcionario funcionario1 = new Funcionario("Carlos", "111.222.333-44", "Bibliotecário", 3500.00);
        Relatorio.imprimirDadosPessoas(funcionario1);

        System.out.println();
        System.out.println("==== CRIANDO LIVROS ====");
        Livro livro1 = new Livro("Java Básico", "Deitel", TipoLivro.FISICO);
        Livro livro2 = new Livro("POO com Java", "Alura", TipoLivro.DIGITAL);
        Livro livro3 = new Livro("Estrutura de Dados", "Tanenbaum", TipoLivro.FISICO);
        Livro[] livros = { livro1, livro2, livro3 };
        for (Livro livro : livros) {
            Relatorio.imprimirDadosLivros(livro);
        }

        System.out.println();
        System.out.println("Total de livros criados: " + Livro.getTotalLivros());

        System.out.println();
        System.out.println("==== REALIZANDO EMPRÉSTIMOS ====");
        Emprestimo emprestimo1 = new Emprestimo(usuario1, livro1);
        Emprestimo emprestimo2 = new Emprestimo(usuario2, livro3);

        System.out.println();
        System.out.println("==== FINALIZANDO EMPRÉSTIMO ====");
        emprestimo1.finalizarEmprestimo();

        System.out.println();
        System.out.println("==== TESTANDO ENUM E SWITCH ====");
        switch (emprestimo2.getStatus()) {
            case ATIVO:
                System.out.println("Empréstimo em andamento");
                break;
            case FINALIZADO:
                System.out.println("Empréstimo finalizado");
                break;
            case ATRASADO:
                System.out.println("Empréstimo atrasado");
                break;
        }

        System.out.println();
        System.out.println("==== MOSTRANDO RELATORIO DE EMPRESTIMOS ====");
        Relatorio.imprimirEmprestimo(emprestimo1);
        Relatorio.imprimirEmprestimo(emprestimo2);
    }
}
