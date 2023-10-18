package praticando.gerenciandoFuncionarios.dominio;

import praticando.gerenciandoFuncionarios.exceptions.semFuncionariosException;
import praticando.gerenciandoFuncionarios.exceptions.idInvalidoException;

import java.security.InvalidParameterException;
import java.util.Arrays;

public class Empresa {
    protected Funcionario[] listaDeFuncionarios;

    public Empresa(Funcionario[] listaDeFuncionarios) {
        this.listaDeFuncionarios = listaDeFuncionarios;
    }

    public Empresa(Funcionario funcionario) {
       Funcionario[] listaAtualizada = new Funcionario[1];
       listaAtualizada[0] = funcionario;
       this.listaDeFuncionarios = listaAtualizada;
    }

    public void adicionarFuncionario(Funcionario[] funcionarios) {
        try {
            int quantidadeFuncionarios = this.listaDeFuncionarios.length;
            Funcionario[] listaAtualizada = Arrays.copyOf(this.listaDeFuncionarios, quantidadeFuncionarios + funcionarios.length);
            int contador = 0;

            for (Funcionario funcionario: funcionarios) {
                listaAtualizada[quantidadeFuncionarios + contador] = funcionario;
                contador++;
            }

            this.listaDeFuncionarios = listaAtualizada;
        } catch (InvalidParameterException exception) {
            exception.printStackTrace();
        }
    }
    public void adicionarFuncionario(Funcionario funcionario) {

            int quantidadeFuncionarios = this.listaDeFuncionarios.length;
            Funcionario[] listaAtualizada = Arrays.copyOf(this.listaDeFuncionarios, quantidadeFuncionarios + 1);
            listaAtualizada[quantidadeFuncionarios] = funcionario;
            this.listaDeFuncionarios = listaAtualizada;

    }

    public boolean checharId (int id) {
        for (Funcionario funcionario: this.listaDeFuncionarios) {
            if (funcionario.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void removerFuncionario(int id) throws idInvalidoException, semFuncionariosException {

        if (checharId(id) == false) {
            throw new idInvalidoException();
        }

        if (this.listaDeFuncionarios.length == 0) {
            throw new semFuncionariosException();
        }

            Funcionario[] funcionariosAtualizado = new Funcionario[this.listaDeFuncionarios.length - 1];
            int contador = 0;

            for (Funcionario funcionario: this.listaDeFuncionarios) {
                if (funcionario.getId() != id) {
                    funcionariosAtualizado[contador] = funcionario;
                }
                contador++;
            }

            this.listaDeFuncionarios = funcionariosAtualizado;
            System.out.println("O funcionário de id " + id + ", foi demitido da empresa");

    }

    public void removerFuncionario (int[] ids) throws idInvalidoException, semFuncionariosException{
        for (int id: ids) {
            removerFuncionario(id);
        }
    }

    public void listarFuncionarios() {
        if (this.listaDeFuncionarios.length > 0) {
            for (Funcionario funcionario: this.listaDeFuncionarios) {
                System.out.println(funcionario);
            }
        }
        else {
            System.out.println("Ainda não há nenhum funcionário nessa empresa!");
        }
    }

    public Funcionario[] getListaDeFuncionarios() {
        return listaDeFuncionarios;
    }

    public void setListaDeFuncionarios(Funcionario[] listaDeFuncionarios) {
        this.listaDeFuncionarios = listaDeFuncionarios;
    }
}
