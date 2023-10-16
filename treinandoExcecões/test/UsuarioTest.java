package praticando.treinandoExcecões.test;

import praticando.treinandoExcecões.Exceptions.SaldoInsuficienteException;
import praticando.treinandoExcecões.dominio.Depositar;
import praticando.treinandoExcecões.dominio.Transferir;
import praticando.treinandoExcecões.dominio.Usuario;

public class UsuarioTest {
    public static void main(String[] args) throws SaldoInsuficienteException {
        Usuario usuario1 = new Usuario("Lucas", 1000);
        Usuario usuario2 = new Usuario("Gabriel");
        Depositar.depositar(usuario2, 500);
        Transferir.transferir(usuario2, usuario1, 600);
    }
}
