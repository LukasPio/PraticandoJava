package praticando.gerenciandoFuncionarios.test;

import praticando.gerenciandoFuncionarios.dominio.Desenvolvedor;
import praticando.gerenciandoFuncionarios.dominio.Empresa;
import praticando.gerenciandoFuncionarios.dominio.Funcionario;
import praticando.gerenciandoFuncionarios.dominio.Gerente;
import praticando.gerenciandoFuncionarios.exceptions.idInvalidoException;
import praticando.gerenciandoFuncionarios.exceptions.semFuncionariosException;

public class EmpresaTest {
    public static void main(String[] args) throws semFuncionariosException, idInvalidoException {
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Lucas", 10000, 600);
        Gerente gerente1 = new Gerente("Matheus", 10000);
        Desenvolvedor desenvolvedor2 = new Desenvolvedor("Gabriel", 10000, 600);
        Funcionario[] listaDeDesenvolvedores = new Funcionario[] { desenvolvedor1, desenvolvedor2, gerente1};
        int[] funcionariosParaDemissao = new int[] {gerente1.getId(), desenvolvedor2.getId()};
        Empresa empresa = new Empresa(listaDeDesenvolvedores);
        empresa.listarFuncionarios();
        empresa.removerFuncionario(funcionariosParaDemissao);
        empresa.listarFuncionarios();
    }
}
