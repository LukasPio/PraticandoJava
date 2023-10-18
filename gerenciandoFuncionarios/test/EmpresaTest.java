package praticando.gerenciandoFuncionarios.test;

import praticando.gerenciandoFuncionarios.dominio.Desenvolvedor;
import praticando.gerenciandoFuncionarios.dominio.Empresa;
import praticando.gerenciandoFuncionarios.dominio.Funcionario;

public class EmpresaTest {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("lucas", 10090, 310);
        Desenvolvedor desenvolvedor2 = new Desenvolvedor("augusto", 10000, 400);
        Funcionario[] funcionariosContratados = new Funcionario[] {desenvolvedor1};
        Funcionario[] funcionariosContratados2 = new Funcionario[] {desenvolvedor2};
        Empresa empresa = new Empresa(funcionariosContratados);
        empresa.listarFuncionarios();
        empresa.adicionarFuncionario(funcionariosContratados2);
        empresa.listarFuncionarios();
    }
}
