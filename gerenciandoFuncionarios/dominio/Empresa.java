package praticando.gerenciandoFuncionarios.dominio;

public class Empresa {
    protected Funcionario[] listaDeFuncionarios;

    public Empresa(Funcionario[] listaDeFuncionarios) {
        this.listaDeFuncionarios = listaDeFuncionarios;
    }

    public void adicionarFuncionario(Funcionario[] funcionarios) {
        int tamanhoLista = this.listaDeFuncionarios.length;
        Funcionario[] listaCopiada = this.listaDeFuncionarios;

        for (int i = 0; i < funcionarios.length; i++) {
            listaCopiada[tamanhoLista] = funcionarios[i];
        }
    }

    public void listarFuncionarios() {
        for (Funcionario funcionario: this.listaDeFuncionarios) {
            System.out.println(funcionario);
        }
    }

    public Funcionario[] getListaDeFuncionarios() {
        return listaDeFuncionarios;
    }

    public void setListaDeFuncionarios(Funcionario[] listaDeFuncionarios) {
        this.listaDeFuncionarios = listaDeFuncionarios;
    }
}
