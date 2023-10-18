package praticando.gerenciandoFuncionarios.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salarioBase) {
        super(nome);
        this.salarioBase = (salarioBase * 1.2);
    }
}
