package praticando.treinandoExcecões.dominio;

import praticando.treinandoExcecões.Exceptions.SaldoInsuficienteException;

public class Sacar {
    public static void sacar(Usuario usuario, double saldoParaSaque) throws SaldoInsuficienteException {
        if (saldoParaSaque > usuario.saldoEmConta) {
            throw new SaldoInsuficienteException();
        }
        usuario.saldoEmConta -= saldoParaSaque;
        System.out.println("Saque realizado com sucesso!");
        usuario.relatorioUsuario();
    }
}
