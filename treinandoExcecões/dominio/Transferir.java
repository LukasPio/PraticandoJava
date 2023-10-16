package praticando.treinandoExcecões.dominio;

import praticando.treinandoExcecões.Exceptions.SaldoInsuficienteException;

public class Transferir  {
    public static void transferir (Usuario remetente, Usuario destinatario, double saldoParaTransferir) throws SaldoInsuficienteException {
        if (saldoParaTransferir > remetente.saldoEmConta) {
        throw new SaldoInsuficienteException();
        }
        remetente.saldoEmConta -= saldoParaTransferir;
        destinatario.saldoEmConta += saldoParaTransferir;
        System.out.println("Transferência realizada com sucesso!");
        remetente.relatorioUsuario();
        destinatario.relatorioUsuario();
        }
}
