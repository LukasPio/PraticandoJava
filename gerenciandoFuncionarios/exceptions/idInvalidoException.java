package praticando.gerenciandoFuncionarios.exceptions;

public class idInvalidoException extends Exception{
    public idInvalidoException() {
        super("No momento, esse id não pertence a nenhum funcionário");
    }
}
