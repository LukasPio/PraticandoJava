package praticando.gerenciandoFuncionarios.exceptions;

public class semFuncionariosException extends Exception{
    public semFuncionariosException() {
        super("Atualmente, a empresa não tem funcionários removíveis");
    }
}
