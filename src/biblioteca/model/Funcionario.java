package biblioteca.model;

// Nota Chat GPT: 9,6
// Adicionar validações
// Regras de alteração: Alteração do cargo e salario dos funcionários, mas eles não tem esse acesso
// Controle de permissão: Gerente pode alterar tudo, já o funcionário é limitado

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, String documento, String cargo, double salario) {
        super(nome, documento);
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String getDadosFormatados() {
        return super.getDadosFormatados()
                + "\n# Cargo: " + cargo +
                "\n# Salário: %.2f".formatted(salario);
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

}
