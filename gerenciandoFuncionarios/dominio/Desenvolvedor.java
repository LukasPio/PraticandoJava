package praticando.gerenciandoFuncionarios.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salarioBase, double bonificacao) {
        super(nome);
        this.salarioBase = (salarioBase + bonificacao);
    }
}
